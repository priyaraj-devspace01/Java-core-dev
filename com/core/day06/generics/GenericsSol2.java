package com.core.day06.generics;

class Pair<T, V>
    /// if we want two different type we can take two types as well
{
    T x;
    V y;

    public Pair(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public void setX(T x) {
        this.x = x;
    }
    public void setY(V y) {}
}

public class GenericsSol2 {
    public static void main(String[] args) {

        // Let's suppose the requirement is to create A Pair of any type which can be only be decided at the run time
        // so for that we can make the class as generic


        Pair<Integer, String> x = new Pair<>(11,"HELLO");
        System.out.println(x.x);
        System.out.println(x.y);



    }
}
