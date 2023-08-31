public class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {

           // the variable item holds the current value from the numbers array
             System.out.println("Count is: " + item);
         }
    }
}