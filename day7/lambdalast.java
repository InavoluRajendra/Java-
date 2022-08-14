package com.org.tav.day7;
interface IFunction{
	void function();
}

class lambdafunction{
	int a;//class data field
	static int b;//static field
	
	void printa()
	{
		System.out.println("a="+a);
	}
	static void printb()
	{
		System.out.println("b="+b);
	}
	//method with lambda expression
	void methodlambda()
	{//1.lambda expression
		IFunction ref=()->{
			//there is access to all these elements
			a=8;
			lambdafunction.b=15;
			printa();
			lambdafunction.printb();
		};
		//2.invoke function() method of Ifunction interface
		ref.function();
	}
}
public class lambdalast {
//client code-calling method lambda
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambdafunction l=new lambdafunction();
		l.methodlambda();
		

	}

}
