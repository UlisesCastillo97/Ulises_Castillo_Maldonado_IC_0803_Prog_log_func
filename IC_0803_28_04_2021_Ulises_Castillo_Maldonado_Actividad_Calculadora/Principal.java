public class Principal{
	public static void main(String[] args) {
		Principal.engine((x, y) -> x + y);
		Principal.engine((x, y) -> x * y);
		Principal.engine((x, y) -> x / y);
		Principal.engine((x, y) -> x - y);
		Principal.engine((x, y) -> x % y);
	}

	//sobrecarga de metodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}
        //correccion de ambighuedad
        //dos metodos pueden tener el mismo nombre pero no los mismos pararametros (argumentos)
        //se llama sobrecarga de metodos o constructores porque tienen el mismo nombre
	private static void engine(CalculadoraLong cal, CalculadoraLong a){
		long x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado = " + resultado);
	}
}