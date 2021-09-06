package com.alfa.work2;

import java.util.List;
import java.util.Set;

public class Runner {
    public void run () {
        MyNumGenerator numGenerator = new MyNumGenerator(15, 20);

        List<Integer> integerList = numGenerator.generateList();
        System.out.println(integerList);

        Set<Integer> integerSet = numGenerator.generateSet();
        System.out.println(integerSet);
    }
}
