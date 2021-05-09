public class Principal{
	public static void main(String[] args) {
		Principal.engine((long x, long y) -> x + y);
		Principal.engine((int x, int y) -> x * y);
		try{
                 Principal.engine((int x, int y) -> x / y);
              }catch (Exception e) {
                 System.out.println("lo siento no puedes dividir un numero entre cero!!!!!");
              }
		Principal.engine((int x, int y) -> x - y);
                try{
		Principal.engine((long x, long y) -> x % y);
              }catch (Exception e) {
                 System.out.println("lo siento no se puede realizar la operacion con cero!!!!!");
              }
                   
	}

	//sobrecarga de metodos sobreescribirlos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 0;
		int resultado = cal.calcular(x, y);
                System.out.println("resultado = " + resultado);
		
	}
	private static void engine(CalculadoraLong cal){
		long x = 2, y = 0;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}
}
        //correccion de ambighuedad
        //dos metodos pueden tener el mismo nombre pero no los mismos pararametros (argumentos)
        //se llama sobrecarga de metodos o constructores porque tienen el mismo nombre
	