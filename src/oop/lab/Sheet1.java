/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

import java.util.Arrays;
import java.util.Scanner;

public class Sheet1 {

    static void runsheet1() {

        int[] arrorg, arr;
        int n, elemofarr = 0, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter N");         // Size of array
        arrorg = new int[input.nextInt()];
        arr = new int[arrorg.length];

        for (int i = 0; i < arrorg.length; i++) //Filling the array entries from user
        {
            System.out.println("Enter Entry" + i);
            elemofarr = input.nextInt();
            arrorg[i] = elemofarr;
            arr[i] = elemofarr;                   // cloning the array
            sum = sum + elemofarr;

        }

        System.out.println("AVg" + sum / arrorg.length);
        Arrays.sort(arr);                       //sort the cloned array
        System.out.println("Max " + arr[arrorg.length - 1]);
        System.out.println("min " + arr[0]);

        System.out.println("Search");
        n = input.nextInt();
        for (int i = 0; i < arrorg.length; i++) // Checking if the number exist
        {
            if (arr[i] == n) {

                //truth =true;
                System.out.println("Number Found");
                break;
            } else if (i == arrorg.length - 1) {
                System.out.println("Not Found");
            }
        }

        for (int i = 0; i < arrorg.length; i++) //Reversing Array
        {
            arr[i] = arr[arrorg.length - i - 1];
            System.out.println(arr[arrorg.length - i - 1]);
        }

        for (int i = 0; i < arrorg.length; i++) //check if the orginal and cloned array are equal
        {

            if (arrorg[i] != arr[i]) {
                System.out.println("Arrays are not equal");
                break;
            } else if (i == arrorg.length - 1) {
                System.out.println("Arrays are equal");
            }
        }
    }

}
