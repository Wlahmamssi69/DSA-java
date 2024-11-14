package org.example.arrays;

import java.util.Scanner;

public class AverageTemperature {
    static int [] dataArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many Days temperature?");
        int numDays = scanner.nextInt();
        dataArray= new int[numDays];

        System.out.println("Filling days temperature data: " + numDays);
        for(int i =0 ; i<numDays;i++){
            System.out.print("Day"+i+" 's high temp: ");
            dataArray[i] = scanner.nextInt();
        }

        System.out.println("----- Days Average  -----");
        System.out.println("Days Average temperature: " + calculateAverage(dataArray));

        System.out.println("- Number of Days Above Average : " + calculateNumberOfDaysAboveAverage(dataArray)+" days.");


    }

    public static double calculateAverage(int[] arr){
        int sum = 0;
        for(int i =0 ; i<arr.length;i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static int calculateNumberOfDaysAboveAverage(int[] arr){
        int count = 0;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i] >= calculateAverage(arr)) count++;
        }
        return count;
    }


}
