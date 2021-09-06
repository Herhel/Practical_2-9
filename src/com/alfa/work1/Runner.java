package com.alfa.work1;

import java.util.*;

public class Runner {
    public void run () {
        List<String> listArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listArray.add("number_" + i);
        }
        System.out.println(listArray);

        Random random = new Random();
        List<String> listLinked = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int position = random.nextInt(i+1);
            listLinked.add(position, "num_"+i);
        }
        System.out.println(listLinked);

        ListIterator<String> iterator = listArray.listIterator(listArray.size());
        int index = 1;
        while (iterator.hasPrevious()) {
            listLinked.add(index, iterator.previous());
            index += 2;
        }

        System.out.println(listLinked);
    }
}
