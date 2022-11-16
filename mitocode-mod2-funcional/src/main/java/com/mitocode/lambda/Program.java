package com.mitocode.lambda;

public class Program {
    public static void main(String[] args) {
//        Operation op = new Sum();
//        int result = op.operation(2, 3);
//        System.out.println(result);

        Operation op1 = (a, b) -> a + b;
        Operation op2 = (a, b) -> a * b;
        int result1 = op1.operation(2, 3);
        int result2 = op2.operation(2, 3);
        System.out.println(result1);
        System.out.println(result2);
    }
}
