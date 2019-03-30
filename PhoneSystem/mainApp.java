package PhoneSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class mainApp {

	static ArrayList<person>list=new ArrayList<person>();
	   
		public static  void IDsort(String[] args) {
			Collections.sort(list, new IDComparator());
	       // System.out.println(list);
	    }

	
	static class IDComparator implements Comparator<person> {
	    @Override
	    public int compare(person a, person b) {
	        return a.getID() < b.getID() ? -1 : a.getID() == b.getID() ? 0 : 1;
	    }
	}
	public static void Menu() {
		System.out.println("1.	Insert New Record");
		System.out.println("2.	Delete Existing Record");
		System.out.println("3.	Change Phone Number");
		System.out.println("4.	Search for an input name and print their address and phone number.");
		System.out.println("5.	Look up a phone number ");
		System.out.println("6.	Sort the records in the ascending order of the ID.");
		System.out.println("7.	Print a report listing all subscribers with their details in a tabular form.");
		System.out.println("8.	Exit");

	}

	public static int getMenuOption() {
		int option;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your option:");
		option = in.nextInt();
		return option;
		
	}

	
	public static void input(ArrayList<person> list)
	   {   String name,surname;
	        Address a=new Address() ;
	        tellNum n=new tellNum() ;
	        
	        int ID;
		   Scanner in= new Scanner(System.in);
		   System.out.println("Enter the customer data:");
		   
		   System.out.println("Enter Name:");
		   name=in.nextLine();
		   System.out.println("Enter Surname:");
		   surname=in.nextLine();
		   System.out.println("Enter ID:");
		   ID=in.nextInt();
		    n.input();
		    a.input();
	       person objt = new person(name, surname,a,n,ID);
	       list.add(objt);
	       
	   }
	

	public static void deletePerson() {
		int tempid;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter person ýd:");
		tempid = in.nextInt();
		for (int i = 0; i <list.size(); ++i) {
			if (tempid == list.get(i).getID()) {
				list.remove(i);
				
			}
		}
	}
	
    
	 
	
	public static void printAddressandPhone() {
		boolean flag = false;
		String tempName;
		String tempsurName;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter person name:");
		tempName = in.nextLine();
		System.out.println("Enter person surname:");
		tempsurName = in.nextLine();
		for (int i = 0; i < list.size(); ++i) 
		{
			if (tempName.equals(list.get(i).getName()))
			{
				if (tempsurName.equals(list.get(i).getsurname())) 
				{
					flag = true;
					System.out.println("Address:" +list.get(i).getAddressofCustomer());
					System.out.println("Tell number of customer:" +list.get(i).getTellNumofCustomer());
				}

			}
		}
		if (flag == false)
			System.out.println("person data not found be sure the inputted name and surname is correct ");
	}

	public static void lookupPNum() {
		int areaC;
		int Pnum;
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter areacode:");
		areaC = in.nextInt();
		System.out.println("Enter phone number:");
		Pnum = in.nextInt();

		for (int i = 0; i < list.size(); ++i) {
			if (areaC == list.get(i).getTellNumofCustomer().getareaCode()
					&& Pnum == list.get(i).getTellNumofCustomer().getTellNum()) {
				flag = true;
				System.out.println("this phone number already in the data //" + list.get(i).getTellNumofCustomer());
				System.out.println("customer name:" + list.get(i).getName());
				System.out.println("customer surname:" + list.get(i).getsurname());
				System.out.println("customer address:" +list.get(i).getAddressofCustomer());
			}

		}

		if (flag == false)
			System.out.println("this phone number is not in the data");

	}

	public static void read() throws FileNotFoundException {
	       Scanner s=new Scanner(new File("in.txt"));
	       String name,surname;
	       int ID;
	       Address a=new Address() ;
	       tellNum n=new tellNum() ;
	       while(s.hasNextLine())
	       {
	    	   name=s.nextLine();
	    	   surname=s.nextLine();
	    	   ID=Integer.parseInt(s.nextLine());
	    	   n.setareaCode(Integer.parseInt(s.nextLine()));
	    	   n.setTellNum(Integer.parseInt(s.nextLine()));
	    	   a.setName(s.nextLine());;
	    	   a.setcityName(s.nextLine());
	    	   a.setBuildNo(s.nextLine().trim());
	    	   person objt = new person(name, surname,a,n,ID);
		      list.add(objt);
	       }
	       System.out.println(list);
	}

	public static void ChangePhoneNum() {
		int tempid;
		int newNum;
		int newAreaCode;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter person id:");
		tempid = in.nextInt();
		for (int i = 0; i < list.size(); ++i) {
			if (tempid == list.get(i).getID()) {
				System.out.println("Enter new area code:");
				newAreaCode = in.nextInt();
				System.out.println("Enter new phone number:");
				newNum = in.nextInt();

				list.get(i).setTellnumofCustomer(newAreaCode, newNum);
			}
		}
	}

	
	
   
	public static void main(String[] args) throws FileNotFoundException, IOException {
		read();
		int op = 0;
		do {
       
			Menu();
			op = getMenuOption();

			switch (op) {

			case 1:
				
				input(list);
				break;
			case 2: {
				deletePerson();
				System.out.println("Selected Customer data has been deleted.");
			}
				break;
			case 3:
				ChangePhoneNum();
				break;
			case 4:
				printAddressandPhone();
				break;
			case 5:
				lookupPNum();
			
			
				break;
			case 6: {
				IDsort(args);
				System.out.println("Items has been sorted");
			}
				break;
			case 7: 
				writer. writer(list);

				break;
			case 8:
				
				System.out.println("Thanks");
				break;
			default:
				
				System.out.println("ERROR INPUT");
				break;
			}

		} while (op != 8);
	}

	

}
