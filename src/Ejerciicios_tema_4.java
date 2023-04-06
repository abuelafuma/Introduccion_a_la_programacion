
public class Ejerciicios_tema_4 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.out.println("Ejercicio CONDICIONAL IF ");
		System.out.println("");

		int numeroif = -12;
				
		if (numeroif > 0){
			System.out.println("El número entero es positivo");
		}else if(numeroif < 0){
			System.out.println("El numero entero es negativo");
		}else {
			System.out.println("El numero entero es 0");	
		}
		System.out.println("");
		
		

		
		System.out.println("Ejercicio BUCLE WHILE");
		System.out.println("");

		int numeroWhile = 0;
		while (numeroWhile < 3) {
			
			numeroWhile = numeroWhile +1;
			
			System.out.println("Estoy en el numeroWhile: "+numeroWhile);
			
		}	
		System.out.println("");
		
		
		
		
		System.out.println("Ejercicio BUCLE DO WHILE");
		System.out.println("");

		numeroWhile = 0;
		do {	
			numeroWhile = numeroWhile +1;
			
			System.out.println("Estoy en el numeroWhile: "+numeroWhile);
			System.out.println("Solo me ejecuto 1 vez");

		}while(numeroWhile < 1);
		
		System.out.println("");
		
		
		System.out.println("");
		System.out.println("Ejercicio BUCLE FOR ");
		System.out.println("");

		int numeroFor= 0;
		
		for( numeroFor = 0; numeroFor <= 3; numeroFor ++) {
			
			System.out.println("Ahora tengo valor: "+numeroFor);
		}
		System.out.println("");
		
		
		

		System.out.println("Ejercicio SWITCH");
		System.out.println("");

		
		String estacion = "hinvierno";
		
		switch(estacion) {
		
		case "primavera":
			System.out.println("Es primavera en el corte ingles");
			break;
			
		case "verano": 
			System.out.println("Ojalà se volviera a emitir verano azul");
			break;
			
		case "otoño": 
			System.out.println("Se acerca el hinvierno");
			break;
			
		case "hinvierno": 
			System.out.println("Estas en Winterfell");
			break;	
			
		default :
			System.out.println("no es una estacion del año");
			break;
			
		}
		
	}

}
