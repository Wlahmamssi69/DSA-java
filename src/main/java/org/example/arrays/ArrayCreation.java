package org.example.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        //Decalation : create a reference to the arrays this; reference will store the memory address of the first element after the instantiation
        int[] tab;
        //    Instantiation : create an array ; and allocate memory
        tab = new int[2];
        //intitialization : asign values to table cells
        tab[0] = 1;
        tab[1] = 2;
//        Printing
        System.out.println(Arrays.toString(tab));
    }

}
