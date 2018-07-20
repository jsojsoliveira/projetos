package exemplos;

public class TestaLampada {
	
	public static void main(String[] args) {
		
		Fabricante fab = new Fabricante();
		fab.setNome("Velux");
		fab.setSigla("vlx");
		
		Lampada lamp1 = new Lampada();
			
		lamp1.setPotencia(20);
		lamp1.setFabricante(fab);
		lamp1.acender();
		
		//lamp1.acender(); 
				
		//lamp1.setPotencia(60f);

		//System.out.println("Estado: " + lamp1.getEstado());
		//System.out.println("Potencia: " + lamp1.getPotencia());
		System.out.println(lamp1);
	}
	
}
