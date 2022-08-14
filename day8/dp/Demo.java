package com.org.tav.day8.dp;

public class Demo {
	private static Application configureApplication()
	{
		Application app;
		GUIFactory factory;
		String osName=System.getProperty("os.name").toLowerCase();
		if(osName.contains("mac"))
		{
			factory=new MacosFactory();
			app=new Application(factory);
		}
		else
		{
			factory=new WindowsFactory();
			app=new Application(factory);
		}
		return app;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app=configureApplication();
		app.paint();

	}

}
