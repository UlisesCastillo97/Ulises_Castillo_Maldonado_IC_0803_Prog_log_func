public class LambdaTest{
    public static void main(String[] args) {

     //exprecion lambda==> representa un objeto de una interfaz funcional
     //Operaciones op = (num1, num2) -> System.out.println(num1 + num2); 
                                                               
     //op.imprimeOperacion(5, 10);
      //pasanda la exprecion lambda de mi metodo ya no instancia que se desea hacer
      //difrentes funcionalidades con la exprecion sin utilizar la instancia
      // 
     LambdaTest objeto = new LambdaTest();
     objeto.miMetodo((num1, num2) -> System.out.println(num1 - num2), 20, 10);
     objeto.miMetodo((num1, num2) -> System.out.println(num1 * num2), 20, 10);
    }

    public void miMetodo(Operaciones op, int num1, int num2){
    	op.imprimeOperacion(num1, num2);
    }
}