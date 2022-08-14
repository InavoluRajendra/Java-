package com.org.tav.day7;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
    public static int getSum(int[] arr,Predicate<Integer> condition)
    {
        int sum=0;
        for(int num:arr)
        {
            if(condition.test(num))
                sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5,6};
        int evensum=getSum(arr,x->x%2==0);
        int oddSum=getSum(arr,x->x%2!=0);
        System.out.println("Sum of even numbers "+evensum);
        System.out.println("Sum of odd numbers "+oddSum);

    }

}