/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab;

import java.util.Arrays;
import java.util.Random;

public class Sheet3 {
    
    public static void whichgreater(int x, int y, int z){
        
        if(x > y && x > z)
            System.out.printf("%,d Is Greatest\n",x);
        else if(y > x && y > z)
            System.out.printf("%,d Is Greatest\n",y);
        else if(z > x && z > y)
            System.out.printf("%,d Is Greatest\n",z);
        else if(x == y && x > z)
            System.out.printf("%,d and %,d are equal and greater than %,d\n",x,y,z);
        else if(y == z && y > x)
            System.out.printf("%,d and %,d are equal and greater than %,d\n",y,z,x);
        else if(x == z && x > y)
            System.out.printf("%,d and %,d are equal and greater than %,d\n",x,z,y);
        else
            System.out.println("Non are greater");
    
    }
    
    public static void sort(double num1, double num2, double num3){
        
        double[] sorting={num1,num2,num3};
        Arrays.sort(sorting);
        
        for(int i = 0; i<sorting.length ;i++ ){
            
            System.out.printf("%,1.2f ",sorting[i]);
        }
        
    }
    
    public static void searcharr(int b){
        
        Random rnd = new Random();
        int[][] a = new int[2][Math.abs(rnd.nextInt())];
        System.out.printf("Array is %d x %d \n",a.length,a[0].length );
        
        outerloop:
        for(int i = 0 ; i<a.length;i++){
            for(int j = 0; j<a[0].length;j++)
            {
                a[i][j] = rnd.nextInt();
                if(a[i][j]==b){
                    System.out.printf("%,d is found at %d %d \n",b,i,j);
                    break outerloop;
                }else 
                    if(i==a.length-1 && j==a[0].length-1 )
                    System.out.println("Not found");

            }
        }
        
    }
    
    public static boolean isSorted(int[] list){
        
        int[] list2 = Arrays.copyOf(list, list.length);
        Arrays.sort(list2);
        return Arrays.equals(list, list2 );
    }
}
