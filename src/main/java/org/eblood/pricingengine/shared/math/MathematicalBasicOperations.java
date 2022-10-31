package org.eblood.pricingengine.shared.math;

public class MathematicalBasicOperations {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static int fibonacci(int n){
        if(n <= 1) {
            return n;
        } if(n == 2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


}
