package oop.lab;

public class Sheet6 {
    
    public class Reverse{
        
        int[] reversearr(int[] notreversed){
            int[] reversed = new int[notreversed.length];
            for(int i = 0;i<reversed.length;i++)
            {
                reversed[reversed.length-1-i] = notreversed[i];
            }
            return reversed;
        }
        
        char[] reversearr(char[] notreversed){
            char[] reversed = new char[notreversed.length];
            for(int i = 0;i<reversed.length;i++)
            {
                reversed[reversed.length-1-i] = notreversed[i];
            }
            return reversed;
        }
        
    }
    
    public class Square{
        private int side;
        private String color;
        
        Square(){
            side = 0;
            color = "Blank";
        }
        
        Square(int side, String color){
            this.side = side;
            this.color = color;
        }
        
        void SetSide(int side){
            this.side=side;
        }
        
        void SetColor(String color){
            this.color=color;
        }
        
        int GetSide(){
            return side;
        }
        
        String GetColor(){
            return color;
        }
        
        int GetArea(){
            return side*side;
        }
        int GetPerimeter(){
            return side*4;
        }
        
    }
    
}
