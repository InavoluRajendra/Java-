package com.org.tav.day7;
@FunctionalInterface
public interface Calculation<T> {
	T compute(T one,T two);
	
	default double sqrt(int num)
	{
		return Math.sqrt(num);
	}

}
