package com.org.tav.day2;
 
class Table{
   synchronized void printTable(int n ) {
        for(int i=1 ; i<=5;i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            }catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class Thread1 extends Thread{
    Table t;
 
    public Thread1(Table t) {
        super();
        this.t = t;
    }
    public void run() {
        t.printTable(3);
    }

}
class Thread23 extends Thread{
    Table t;
 
    public Thread23(Table t) {
        super();
        this.t = t;
    }
    public void run() {
        t.printTable(6);
    }
}
 
public class SynchronizedDemo {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     Table obj = new Table();
     Thread1 t1 = new Thread1(obj);
     Thread23 t2 = new Thread23(obj);
     t1.start();t2.start();
    }
 
}