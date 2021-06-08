import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 public class FP_Functional_Exercises{
      public static void main(String[] args) {
         List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

         List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
         "AWS", "PCF", "Azure", "Docker", "Kubernetes");

         FP_Functional_Exercises.printAllNumbersInlistStructured(numbers);
         System.out.println("");
         FP_Functional_Exercises.printEvenNumbersInlistStructured(courses);
         System.out.println("");
         FP_Functional_Exercises.printSquaresOfNumbersInlistStructured(courses);
         System.out.println("");
         FP_Functional_Exercises.printAlmenos4letrasNumbersInlistStructured(courses);
         System.out.println("");
         FP_Functional_Exercises.printCube_ImparesNumbersInlistStructured(numbers);
         System.out.println("");
         FP_Functional_Exercises.printNumbers_CharactersNumbersInlistStructured(courses);
         System.out.println("");
     }
     //ejecicio 1 
     private static void printAllNumbersInlistStructured(List<Integer>numbers){
         for (int number : numbers){
             if(number % 2 != 0){
                 System.out.print(number + ", ");
             }
         }
         System.out.println("");
     }
     //ejercicio 2
     private static void printEvenNumbersInlistStructured(List<String>courses){
         courses.forEach(new Consumer<String>(){
             public void accept(final String name){
                 System.out.println(name);
             }
         });
         System.out.println("");
     }
     // ejercicio 3
     public static void printSquaresOfNumbersInlistStructured(List<String>courses){
        courses.forEach(new Consumer<String>(){
            public void accept(final String name){
                Pattern pat = Pattern.compile("Spring.*");
                Matcher mat = pat.matcher(name);
                if(mat.matches()){
                System.out.println(name);
            }
        }
        });
        System.out.println("");
     }
     //ejercicio 4
     public static void printAlmenos4letrasNumbersInlistStructured(List<String>courses){
       courses.forEach(new Consumer<String>(){
           public void accept(final String name){
               if(name.length()>3){
                   System.out.println(name);
               }
           }
       });
       System.out.println("");
     }
     //ejercicio 5
     public static void printCube_ImparesNumbersInlistStructured(List<Integer>numbers){
         for (int i = 0; i < numbers.size(); i++){
             int a = (int)numbers.get(i);
             if (a % 2 != 0){
                 int res= (int)Math.pow(a, 3);
                 System.out.println(res);
             }
         }
         System.out.println("");
     }
     //ejercicio 6 
     public static void printNumbers_CharactersNumbersInlistStructured(List<String>courses){
        courses.forEach(new Consumer<String>(){
            public void accept(final String name){
                System.out.print(name);
                System.out.print("=");
                System.out.print(name.length());
                System.out.println("");

            }
        });
        
     }

 }
