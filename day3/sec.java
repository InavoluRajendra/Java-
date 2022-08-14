package com.org.tav.day3;

class dep
{
	synchronized void printsal(String name,int l,int r)
	{
		System.out.println("sal for "+name+" is "+(l*1.5+r));
		try {
            Thread.sleep(1000);
        }catch (Exception e) {
            // TODO: handle exception
        }
	}
}

class hr extends Thread{
    dep t;
 
    public hr(dep t) {
        super();
        this.t = t;
    }
    public void run() {
        t.printsal("hr",20000,10000);
    }

}
class service extends Thread{
    dep t;
 
    public service(dep t) {
        super();
        this.t = t;
    }
    public void run() {
        t.printsal("service",30000,20000);
    }

}
class test extends Thread{
    dep t;
 
    public test(dep t) {
        super();
        this.t = t;
    }
    public void run() {
        t.printsal("test",25000,12000);
    }

}
public class sec extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dep obj = new dep();
	     hr t1 = new hr(obj);
	     service t2 = new service(obj);
	     test t3=new test(obj);
	     t1.start();t2.start();t3.start();

	}

}
