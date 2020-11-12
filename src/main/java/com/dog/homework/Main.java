package com.dog.homework;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner scanObject = new Scanner (System.in);

        String petName  = scanObject.nextLine();
        String petFavouriteAction = scanObject.nextLine();

System.out.println("My favourite dog " + petName + " likes to " + petFavouriteAction);

        System.out.println( "petName: " + petName);
        System.out.println( "Likes to : " + petFavouriteAction);
    }


}
