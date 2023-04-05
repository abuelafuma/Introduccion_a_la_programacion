
public class Coche {

	private String nombre;
	private int puertas;
	
	
		public Coche(int puertas) {
			nombre = "miCoche";
			this.puertas = puertas;
		}

		public String getNombre() {
			return nombre;
		}
		public int getPuertas() {
			return puertas;
		}
		
		
		public void setPuertas(int puertas) {
			this.puertas = puertas;
		}
		
		public String toString() {
			return "Mi coche es "+nombre+" y tiene "+puertas+" puertas";
			
		}
}		

