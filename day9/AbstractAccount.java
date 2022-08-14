package com.org.tav.day9;

public abstract class AbstractAccount {
	private Logger logger=Logger.info();

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	public void operate(String message,boolean result)
	{
		logger.log(message+" Result "+result);
	}
	
}
