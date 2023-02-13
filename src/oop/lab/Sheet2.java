/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

import java.util.Random;
import java.util.Scanner;

public class Sheet2 {

    public static void runsheet2() {

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sum12 = new int[3][3];
        int[][] transpose = new int[2][3];
        int[][] transposed = new int[3][2];
        int sum = 0;

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.println("Enter no. for element" + i + j);
                matrix1[i][j] = input.nextInt();
                matrix2[i][j] = matrix1[i][j];
                sum12[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < sum12.length; i++) {
            for (int j = 0; j < sum12[0].length; j++) {

                System.out.print(sum12[i][j] + "  ");

            }
            System.out.println();
        }

        System.out.println("The Mx we want to transpose");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = rnd.nextInt(0, 100);
                transposed[j][i] = transpose[i][j];
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("The Transposed Mx");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transposed[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix1.length; i++) {
            sum = sum + matrix1[i][i];
        }

        System.out.println("Sum of Diag mx is " + sum);

        sum = 0;

        System.out.println("Sum of every column in Mx ");

        for (int j = 0; j < matrix2[0].length; j++) {
            for (int i = 0; i < matrix2.length; i++) {
                sum = sum + matrix2[i][j];
            }
            sum = 0;
            System.out.print("  ");
        }

        sum = 0;

        for (int j = 0; j < matrix2.length; j++) {
            for (int i = 0; j < matrix2[0].length; j++) {
                if (matrix2.length == matrix2[0].length) {
                    sum = sum + matrix2[i][j];
                } else {
                    break;
                }
            }
        }

        if (sum == matrix2.length && matrix2.length == matrix2[0].length) {
            System.out.println("It's a Markov Mx");
        } else {
            System.out.println("It's not a Markov Mx");
        }
        
        
        int[][] a= {{-1,0,0},{0,1,0},{0,0,1}};
        sum=0;
        outerloop:
        for(int i = 0;i<a[0].length;i++)
        {
            for(int j = 0;j<a.length;j++)
            {
                if(a[j][i]<0)
                {
                    System.out.println("It's not markov");
                    break outerloop;
                }
                sum = sum + a[j][i];
            }
            if(sum!=1)
            {
                System.out.println("It's not markov");
                break;
            }else if(i==a[0].length-1)
                System.out.println("It's markov");
            sum=0;
        }

    }
}
