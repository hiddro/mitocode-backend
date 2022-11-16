package com.mitocode.lambda;

public class Sum implements Operation{
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
