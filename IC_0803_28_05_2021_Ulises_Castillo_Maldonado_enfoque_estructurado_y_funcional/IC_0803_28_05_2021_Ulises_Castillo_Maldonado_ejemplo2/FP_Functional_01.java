import java.util.List;

 /*Strutured Approach*/

 public class FP_Functional_01{

     public static void main(String[] args) {
         List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

         System.out.println("Using to --> [System.out: :print] by default");
         printAllNumbrersInlistFunctional_Two(numbers);
         System.out.println("\nprintAllNumbrersInlistFunctional: ");
         printAllNumbersInlistFunctinal(numbers);
         System.out.println("\nprintEvenNumbrersInlistFunctional: ");
         printEvenNumbrersInlistFunctional(numbers);
         System.out.println("\nprintSquaresOfEvennumbersInListFunctional: ");
         printSquaresOfEvenNumbrersInlistFunctional(numbers);
         System.out.println("");
 }

 private static void print(int number){
     System.out.print(number + ", ");
 }

 private static boolean isEven(int number){
     return (number % 10 == 0);
 }

 private static void printAllNumbrersInlistFunctional_Two(List<Integer> numbers){
     //What to do?
     numbers.stream()                  //--->convert to Stream
     .forEach(System.out::print);      //--->method reference   
     System.out.println("");
 }

 private static void printAllNumbersInlistFunctinal(List<Integer> numbers){
   //what to do?
   numbers.stream()                  //--->convert to Stream
   .forEach(FP_Functional_01::print);      //--->method reference   
   System.out.println("");
 }

 // number -> number % 2 == 0
 private static void printEvenNumbrersInlistFunctional(List<Integer> numbers){
    //what to do?
    numbers.stream()                  //--->convert to Stream
    .filter(FP_Functional_01::isEven)  //--->method reference ---> filter = only allow even Numbers
    .forEach(FP_Functional_01::print);      //--->method reference   
    System.out.println("");
  }

  private static void printSquaresOfEvenNumbrersInlistFunctional(List<Integer> numbers){
    numbers.stream()                  //--->convert to Stream
    .filter(number -> number % 2 == 0)  //--->lambda exprecion
    .map(number -> number * number)     //--->lambda --> mapping = x -> x * x
    .forEach(FP_Functional_01::print);
    System.out.println("");
  }
}
