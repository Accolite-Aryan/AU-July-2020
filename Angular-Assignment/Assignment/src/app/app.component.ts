import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'Assignment';
  newUser = {firstName:"",lastName:"",age:"",empId:"",city:""};
  editUser = {firstName:"",lastName:"",age:"",empId:"",city:""};
  user1 = {firstName:"test",lastName:"test",age:"21",empId:"2345",city:"hyd"};
  user2 = {firstName:"test",lastName:"test",age:"20",empId:"2345",city:"hyd"};
  name = [this.user1,this.user2];
  delkey = null;

  ngOnInit(){ 
  }
 
   
  addUser = () =>{
      let newValue = {firstName:"",lastName:"",age:"",empId:"",city:""};
      newValue.firstName = this.newUser.firstName;
      newValue.lastName = this.newUser.lastName;
      newValue.age = this.newUser.age;
      newValue.empId = this.newUser.empId;
      newValue.city = this.newUser.city;
      
      this.name.push(newValue);
      return ;
  } 
  
  sortfirstName = () =>{
     this.name.sort((a,b) => a.firstName.localeCompare(b.firstName));
     return ;
  }
  sortlastName = () =>{
    this.name.sort((a,b) => a.lastName.localeCompare(b.lastName));
    return ;
  }
  sortage = () =>{
    this.name.sort((a,b) => a.age.localeCompare(b.age));
    return ;
  }
  sortempId = () =>{
    this.name.sort((a,b) => a.empId.localeCompare(b.empId));
    return ;
  }
  sortcity = () =>{
    this.name.sort((a,b) => a.city.localeCompare(b.city));
    return ;
  }

  updateUser= () =>{
    let editValue = {firstName:"",lastName:"",age:"",empId:"",city:""};
        editValue.firstName = this.editUser.firstName;
        editValue.lastName = this.editUser.lastName;
        editValue.age = this.editUser.age;
        editValue.empId = this.editUser.empId;
        editValue.city = this.editUser.city;
    var num : Number = null;
      for(var i=0;i<this.name.length;i++){
      var obj = this.name[i];
        if(obj.empId == this.editUser.empId){
          this.name[i] = editValue;
          break;
    }
  } 
}

  deleteUser=()=>{
    for(var i=0;i<this.name.length;i++){
      var obj = this.name[i];
      if(obj.empId == this.delkey){
        this.name.splice(i,1);
        break;
    }
  }
}

}
