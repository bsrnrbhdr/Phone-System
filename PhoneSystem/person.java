package PhoneSystem;

import java.io.* ;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.Serializable;

public class person implements Serializable {
	
	private String name;
	private String surname;
	private int ID;
	private Address addressofCustomer;
	private tellNum tellnumofCustomer;
	
	
	public person()
	{
		   this.name=" ";
		   this.surname=" ";
		   this.ID=0;
		   this.addressofCustomer=new Address();
		   this.tellnumofCustomer=new tellNum();
		  
		
	}
	public person(String pName,String pSurname,Address a,tellNum n,int ID)
   {
	   this.name=pName;
	   this.surname=pSurname;
	   this.addressofCustomer=new Address(a);
	   this.tellnumofCustomer=new tellNum(n);
	   this.ID=ID;
	   ;
	  
   }
   public person(person p)
   {
	   this.name=p.name;
	   this.surname=p.surname;
	   this.ID=p.ID;
	   this.addressofCustomer=new Address(p.addressofCustomer);
	   this.tellnumofCustomer=new tellNum(p.tellnumofCustomer);
   }
   public void setID(int ID)
   {
	   this.ID=ID;
   }
   public int getID()
   {
	   return ID;
   }
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public String getsurname() {
	   return surname;
   }
   public void setsurname(String sname) {
	   this.surname=sname;
   }
   public Address getAddressofCustomer() {
	   return addressofCustomer;
   }
   public void setAddressofCustomer(String Name, String cityName,String BuildNo ) {
	   this.addressofCustomer.setName(Name);
	   this.addressofCustomer.setcityName(cityName);
	   this.addressofCustomer.setBuildNo(BuildNo);
   }
   public tellNum getTellNumofCustomer() {
	   return tellnumofCustomer;
   }
   public void setTellnumofCustomer(int AreaCode,int PhoneNUM) {
	   this.tellnumofCustomer.setareaCode(AreaCode);
	   this.tellnumofCustomer.setTellNum(PhoneNUM);
   }
   public String toString()
   {
	   return "name: "+this.name+" surname: "+this.surname+"address of the customer: "+addressofCustomer+"  tell number of the customer: " +tellnumofCustomer;
   }
   
 


public void print()
   {
	   System.out.println("Name: "+this.name);
	   System.out.println( "Surname: "+this.surname);
	   System.out.println( "ID: "+this.ID);
	   System.out.println("Address: "+this.addressofCustomer);
	   System.out.println("Tell number: "+this.tellnumofCustomer);
	   System.out.println("*******************************************");
   }
  
  
   
}
