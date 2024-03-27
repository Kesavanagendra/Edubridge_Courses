/*
 * Predicate<Type> obj ---is a default interface for predicate.. 
 * and it contains only one abstract method with the name of "test". i.e;test(int p)..this method takes only one argument as a parameter.
 *  and this method returns boolean type(true or false).
 */



package practice_edu;

import java.util.function.Predicate;

public class PredMain {
	
	private static void filterNo(Predicate<Integer> p, Integer[] arr) {
		for(Integer i:arr) {
			if(p.test(i))  
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
             Integer arr[]= {5,23,67,1,9,10};
             
             Predicate<Integer> p=(i)->(i>10);//---Predicate<Type> obj ---is a default interface for predicate.. and it contains only one abstract method. i.e;test(int p)..this method takes omnly argument. 
             
             filterNo(p,arr);
             
	}
}




