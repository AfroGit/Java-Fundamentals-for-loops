/* 
* # Author: Maurice
* # Date: 8/31/2023
* # Mission: To learn the basics of a for loop,its syntax,why and all its hows
*/ 

public class ForDemo {
    public static void main(String[] args){
         for(int i=0; i<11; i++){
           // initialization expression initializes the loop; it's executed once, as the loop begins.
           // When the termination expression evaluates to false, the loop terminates.
           // increment expression is invoked after each iteration through the loop
              System.out.println("Count is: " + i);
         }
    }
}