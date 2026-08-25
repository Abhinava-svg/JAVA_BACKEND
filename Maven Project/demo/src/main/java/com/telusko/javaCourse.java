package com.telusko;

public class javaCourse implements Course {

    @Override
    public boolean coursePurchased() {
        System.out.println("Java course purchased");
        System.out.println("it's not actually connecting to db hance result in false");
        return false;
    }
}