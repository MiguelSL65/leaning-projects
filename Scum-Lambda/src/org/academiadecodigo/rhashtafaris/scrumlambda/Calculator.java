package org.academiadecodigo.rhashtafaris.scrumlambda;

public class Calculator {

    public int execute(int a, MonoOperation monoOperation) {

        return monoOperation.monoOperation(a);
    }

    public int execute(int a, int b, BiOperation biOperation) {

        return biOperation.biOperation(a, b);
    }
}
