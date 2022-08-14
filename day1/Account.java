package com.orgtav.day1;
class accdet
{
	private String accno;
	private int accbal;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		accdet a1=new accdet();
		a1.setAccno("12341234");
		a1.setAccbal(1234);
		System.out.println(a1.getAccbal());
		System.out.println(a1.getAccno());
	}

}
