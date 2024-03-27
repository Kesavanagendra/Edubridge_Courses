/*
 * Predicate<Type> obj ---is a default interface for predicate.. 
 * and it contains only one abstract method with the name of "test". i.e;test(int p)..this method takes only one argument as a parameter.
 *  and this method returns boolean type(true or false).
 */

package practice_edu;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> obj = (a)->a>10;
        Boolean res = obj.test(12);
        System.out.println(res);
    }
}
