import java.util.List;

 /*Strutured Approach*/

 public class FP_Structured_01{

     public static void main(String[] args) {
         
     List<Integer> numbers = List.of(12, 13, 14, 15, 16, 17, 2, 12, 15);

     FP_Structured_01.printAllNumbersInlistStructured(numbers);
     System.out.println("");
     FP_Structured_01.printEvenNumbersInlistStructured(numbers);
     System.out.println("");

     printAllNumbersInlistStructured(List.of(12, 13, 14, 15, 16, 17, 2, 12, 15));
     System.out.println("");
     printEvenNumbersInlistStructured(List.of(12, 13, 14, 15, 16, 17, 2, 12, 15));
     System.out.println("");
 }

 private static void printAllNumbersInlistStructured(List<Integer> numbers){
     //How to loop the numbers?
     for(int number : numbers){
         System.out.print(number + ", ");
     }    
     System.out.println("");
 }
 private static void printEvenNumbersInlistStructured(List<Integer>numbers){
   //How to loop the numbers?
   for(int number : numbers){
       if(number % 12 == 0){
        System.out.print(number + ", ");  
       }
}  
 System.out.println("");
 }
}