package main.java.com.hibernate.bankservice;

import org.hibernate.Transaction;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hybernate.entity.Account;
import com.hybernate.entity.Audit;
import com.hybernate.entity.User;

public class Service {
	
	private SessionFactory sf;
	
	public BankService() {
		Configuration config = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Account.class).addAnnotatedClass(Audit.class);
		this.sf = config.buildSessionFactory();		
	}
	
	public void addUser(User user)
	{
		if(user != null)
		{
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
			session.close();
		}
	}
	
	public void addAccount(Account account)
	{
		if(account != null) {
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(account);
			transaction.commit();
			session.close();
		}
	}
	
	public void makeTrasaction(Account sender, Account reciever, double amount)
	{
		if(sender != null && reciever != null)
		{
			
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Audit audit = new Audit();
			audit.setSender(sender);
			audit.setReciever(reciever);
			audit.setAmount(amount);
			
			if(sender.withdraw(amount))
			{
				session.saveOrUpdate(sender);
				if(reciever.deposit(amount))
				{
					session.saveOrUpdate(reciever);
					audit.setStatus("Success");
				}
				else
				{
					transaction.rollback();
					audit.setStatus("Failed");
					
				}
			}else
			{
				audit.setStatus("Failed");
			}
			
			session.save(audit);
			transaction.commit();			
			session.close();
			
		}
	}
	
	public List<Object[]> viewAudit(User user)
	{	
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Object[]> pair = session.createNativeQuery("SELECT audit.*,account.* FROM bankaudit audit JOIN bankaccount account ON audit.sender_id = account.id OR audit.reciever_id = account.id where account.userid_id = "+user.getId())
		.addEntity("Audit", Audit.class )
		.addJoin( "Account", "Audit.sender")
		.list();
		
		session.close();
		return pair;

	}
}
