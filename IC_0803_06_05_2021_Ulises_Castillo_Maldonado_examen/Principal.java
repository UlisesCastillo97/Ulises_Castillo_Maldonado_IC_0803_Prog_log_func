public class Principal{
	public static void main(String[] args) {
          CalculadoraInt b = (x, y) -> x * y;
          CalculadoraLong c = (x, y) -> x - y;
		
       System.out.println("==> CalculadoraInt --> Resultado = " + Principal.engine_1(b).calculate(5, 5));
       System.out.println("==> CalculadoraLong --> Resultado = " + Principal.engine_1(c).calculate(6, 2));
    }

	//retorno de un objeto de tipo "calculadoraInt"
	private static  CalculadoraInt engine_1(CalculadoraInt a){
		return a;
	}
      
	//retorno de un objeto de tipo "calculadoraLong"
	private static CalculadoraLong engine_1(CalculadoraLong a){
		return a;
	}
}