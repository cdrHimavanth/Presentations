package com.tdd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@NoArgsConstructor
public class Calculator {
    public int add(int ...i) {
        return Arrays.stream(i).reduce(0,(a,b)->a+b);
    }
    public int sub(int ...i) {
        return Arrays.stream(i).reduce(0,(a,b)->a-b);
    }
    public int div(int ...i){
        return Arrays.stream(i).reduce(0,(a,b)->a/b);
    }
}
