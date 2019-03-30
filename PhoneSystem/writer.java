package PhoneSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class writer {

	 public static  void writer(ArrayList<person> datArrayList) throws IOException {

		 PrintWriter writer = new PrintWriter("out.txt", "UTF-8");
         BufferedWriter outStream = new BufferedWriter(writer);
         
         for (int k = 0; k <datArrayList.size(); k++)
         {
        	    writer.println("Name:" + datArrayList.get(k).getName());
				writer.println("Surname:" + datArrayList.get(k).getsurname());
				writer.println("ID:" + datArrayList.get(k).getID());
				writer.println("Adress:" + datArrayList.get(k).getAddressofCustomer());
				writer.println("Phone number:" +datArrayList.get(k).getTellNumofCustomer());
				writer.println("//////////////////////////////////////////////////////////");
         }
         outStream.close();
         System.out.println("Data saved.");
			

	    }
	  }
	


