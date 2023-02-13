package oop.lab;

public abstract class PrimeNumber {
    
    static void Primenumbers(int from,int to){
        
        int count;
        int linecount=0;
        
        for(int x=from;x<to;x++)
        {
            count = 0;
            
            for(int i=x;i>1;i--)
                if(x%i==0 && x!=i)
                    count++;
                
            if(count==0)
            {
                if(x>=2 && x<11)
                    System.out.print(x+"   ");
                else
                    System.out.print(x+"  ");
                linecount++;
            }
            
            if(linecount==5)
            {
                System.out.println();
                linecount =0;
            }
        }
    }
    
    static boolean IsItPrime(int Prime){
        
        int count;
        
        for(int x=2;x<Prime;x++)
        {
            count = 0;
            
            for(int i=x;i>1;i--)
                if(x%i==0 && x!=i)
                    count++;
                
            if(count==0)
            {
                return true;
            }
        }
        return false;
        
    }
    
}
