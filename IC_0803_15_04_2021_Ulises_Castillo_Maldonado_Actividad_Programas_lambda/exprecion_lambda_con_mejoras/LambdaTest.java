public class LambdaTest{
    public static void main(String[] args) {

     //exprecion lambda==> representa un objeto de una interfaz funcional
     FunctionTest ft = () -> System.out.println("Hola Mundo!!!"); 
                                                               
     //ft.saludar();

     LambdaTest objeto = new LambdaTest();
     // se esta instanciando un nuevo objeto labdatest que es un nuevo objeto
     //guardmos un metodo abstracto reserve memoria dinamica solo reserva depende lo que contenga
     objeto.miMetodo(ft);
     //se le asigna parametros ft e invocando al metodo mi metodo una instacia 
    }

    public void miMetodo(FunctionTest parametro){
    	parametro.saludar();
    }
}