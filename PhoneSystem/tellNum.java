package PhoneSystem;

import java.util.Scanner;

public class tellNum {

	private int areaCode;
	private int tellNum;

	public tellNum() {

		this.areaCode = 0;
		this.tellNum = 0;
	}

	public tellNum(int areaCd, int Num) {
		this.areaCode = areaCd;
		this.tellNum = Num;

	}

	public tellNum(tellNum n) {
		this.areaCode = n.areaCode;
		this.tellNum = n.tellNum;

	}

	public int getareaCode() {
		return areaCode;
	}

	public int getTellNum() {
		return tellNum;
	}

	public void setareaCode(int AreaC) {
		this.areaCode = AreaC;
	}

	public void setTellNum(int Num) {
		this.tellNum = Num;
	}

	public String toString() {
		return " " + this.areaCode + "-" + this.tellNum;
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the area code:");
		areaCode = in.nextInt();

		System.out.println("Enter the tell number:");
		tellNum = in.nextInt();
	}
}
