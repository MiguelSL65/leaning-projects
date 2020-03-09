package org.academiadecodigo.rhashtafaris.scrumlambda;

public class Main {

    public static void main(String[] args) {

        MonoOperation monoOperation = (int a) -> a * a;
        MonoOperation monoOperation1 = (int a) -> (int) Math.sqrt(a);

        System.out.println(monoOperation.monoOperation(5));
        System.out.println(monoOperation1.monoOperation(25));

        BiOperation biOperation = (int a, int b) -> a - b;
        BiOperation biOperationSum = (int a, int b) -> a + b;
        BiOperation biOperationMultiply = (int a, int b) -> a * b;
        BiOperation biOperationDivision = (int a, int b) -> a / b;

        System.out.println(biOperation.biOperation(8, 9));
        System.out.println(biOperationSum.biOperation(9, 8));
        System.out.println(biOperationMultiply.biOperation(9, 8));
        System.out.println(biOperationDivision.biOperation(10, 2));

    }
}
