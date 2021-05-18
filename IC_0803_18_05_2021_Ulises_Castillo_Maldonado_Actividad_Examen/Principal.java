public class Principal {
    public static void main(String[] args) {
		pruebaExamen pe;
      pe = (num1, num2, num3) -> System.out.println(num1 + num2 + num3); 
                                                               
     pe.operacionPrueba(5, 10, 20);  
     pe.mensajeHola();
     pe.mensajeHola("hola"); 
     pe = (num1, num2, num3) -> System.out.println(num1 +( num2 * num3));                                                           
     pe.operacionPrueba(5, 10, 20);  
     //numero 9 
     pe.operacionPrueba(10, operacionPrueba(5, 10), operacionPrueba(6, 12));
     
     miMetodo(pe);
     
     miMetodo(pe = (num1, num2, num3) -> System.out.println(num1 +( num2 / num3)));
    //16
    miMetodo(pe = (double num1,double num2,double num3) -> System.out.println(num1 +( num2 / num3)));
    //17
    miMetodo(pe, 5,3,7);
    }
//3
    public void mensajeHola(){
        System.out.println("hola mi nombre es: ULises Castillo Maldonado");       
    }
    
private static void miMetodo(pruebaExamen obj){
//10
pe = (num1, num2, num3) -> System.out.println(num1 +( num2 * num3));                                                           
     pe.operacionPrueba(5, 10, 20);
     //11
     obj.operacionPrueba(10, operacionPrueba(10, 20), operacionPrueba(5, 15));
} 
//14
//15
private static void miMetodo(pruebaExamen obj, int x, int y, int z){
    obj.operacionPrueba(x, operacionPrueba(y,y), operacionPrueba(z,z)); 
} 
  
  
}

    

