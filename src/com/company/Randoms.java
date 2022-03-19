package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    public int min;
    public int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();


    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {

                return random.ints(min, (max + 1)).findFirst().getAsInt();
            }
        };
    }

}