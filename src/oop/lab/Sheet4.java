package oop.lab;

public class Sheet4 {
    
    public static int Q1(int x, int y){
        
        if(y==0)
            return 0;
        else return x+Q1(x,y-1);
    }
    
    public static int Q2(int x,int y){
        
        if(y==0)
            return 1;
        else return x*Q2(x,y-1);
    }
    
    public static int Q3(int n){
        
        if(n==0)
            return 1;
        else return 10*Q3(n-1);
    }
    
    public static int Q4(int x,int y){
        
        if(x==y)
            return x;
        else if(x>y)
            return x+Q4(x-1,y);
        else return y+Q4(x,y-1);
    }
    
    public static int Q5(int[] arr,int index){
        
        if(index<0)
            return 0;
        return arr[index]+Q5(arr,index-1);
    }
    
    public static int Q6(int[] arr,int find,int index){
        
        if(index<0)
            return -1;
        if(find==arr[index])            
           return index;
        return Q6(arr,find,index-1);
    }
    
    public static int Q7(int x){
        
        if(x==0)
            return 0;
        if(x==1)
            return 1;
        return Q7(x-1)+Q7(x-2);
    
    }
    
}
