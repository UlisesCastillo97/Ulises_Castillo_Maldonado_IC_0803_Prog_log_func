public class LambdaTest{
    public static void main(String[] args) {

     //exprecion lambda==> representa un objeto de una interfaz funcional
     Operaciones op = (num1, num2) -> System.out.println(num1 + num2); 
                                                               
     //op.imprimeSuma(5, 10);
     LambdaTest objeto = new LambdaTest();
     //se esta instanciando el metodo 
     objeto.miMetodo(op, 10, 10);
    }
    public void miMetodo(Operaciones op, int num1, int num2){
    	op.imprimeSuma(num1, num2);
    }
}