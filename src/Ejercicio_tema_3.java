
public class Ejercicio_tema_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultadoSuma = suma(2, 3 , 4);
		System.out.println(resultadoSuma); 
	}
	
	
	public static String suma (int num1, int num2, int num3) {
		int suma = num1 + num2 + num3;
		String resultado = "La suma de "+ 2 + " + "+3+ " + "+ 4 + " +  = "+ suma;
		return resultado;
	}
}
