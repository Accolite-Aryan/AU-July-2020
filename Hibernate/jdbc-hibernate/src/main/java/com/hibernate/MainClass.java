package main.java.com.hibernate;

import java.util.List;

import com.hybernate.bankservice.BankService;
import com.hybernate.entity.Account;
import com.hybernate.entity.Audit;
import com.hybernate.entity.User;

public class MainClass {
	public static void main(String []args) {
		
		Service hdfc = new Service();

		User aryan = new User();
		aryan.setFirstName("Aryan");
		aryan.setLastName("Dixit");
		hdfc.addUser(aryan);

		User jayaram = new User();
		jayaram.setFirstName("Jayaram");
		jayaram.setLastName("Das");
		hdfc.addUser(jayaram);
		
		Account account1 = new Account();
		account1.setUserid(aryan);
		account1.setAccountNumber(2030101447);
		account1.setAmount(20000);
		hdfc.addAccount(account1);

		Account account2 = new Account();
		account2.setUserid(jayaram);
		account2.setAccountNumber(2030101447);
		account2.setAmount(50000);
		hdfc.addAccount(account2);
		
		hdfc.makeTrasaction(account1, account2, 5000);
		hdfc.makeTrasaction(account2, account1, 5000);	
		
		List<Object[]> pair  = hdfc.viewAudit(jayaram);
		
		for (Object[] objects : pair) {
		
			Audit audit = (Audit)objects[0];
			Account account = (Account)objects[1];
			
			System.out.print(audit.getId());
			System.out.print(audit.getAmount());
			System.out.print(audit.getStatus());
			System.out.print(audit.getSender().getAccountNumber());
			System.out.print(audit.getReciever().getAccountNumber());
			System.out.print(account.getUserid().getFirstName();
			System.out.println();
		}
		
	}
}
