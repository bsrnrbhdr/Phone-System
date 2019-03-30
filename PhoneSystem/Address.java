package PhoneSystem;

import java.util.Scanner;

public class Address {

	private String name;
	private String BuildNo;
	private String cityName;

	public Address() {
		this.name = " ";
		this.BuildNo = "";
		this.cityName = " ";
	}

	public Address(String name1, String BNo, String cName) {
		this.name = name1;
		this.BuildNo = BNo;
		this.cityName = cName;
	}

	public Address(Address a) {
		this.name = a.name;
		this.BuildNo = a.BuildNo;
		this.cityName = a.cityName;
	}

	public String getName() {
		return name;
	}

	public String getcityName() {
		return cityName;
	}

	public String getBuildNo() {
		return BuildNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setcityName(String cityName) {
		this.cityName = cityName;
	}

	public void setBuildNo(String BuildNo) {
		this.BuildNo = BuildNo;
	}

	public String toString() {
		return " " + this.name + "," + this.cityName + "," + this.BuildNo;
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the address:");
		name = in.nextLine();
		System.out.println("Enter the city name:");
		cityName = in.nextLine();
		System.out.println("Enter the Building no:");
		BuildNo = in.nextLine();
	}
}
