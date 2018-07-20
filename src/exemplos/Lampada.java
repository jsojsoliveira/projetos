package exemplos;

public class Lampada {
	
	//String tipo;
	private float potencia;
	//String forma;
	private Fabricante fabricante;
	//float tamanho;
	//float peso;
	//boolean estado; 
	private boolean estado; 
	
	void acender() {
		this.estado = true;
	} 
	
	void apagar ( ) {
		this.estado = false;
	}
	
	boolean getEstado() {
		return this.estado;
	}
	
	float getPotencia() {
		return this.potencia;
	}
		
	void setPotencia(float potencia) {
		if (potencia > 0) {
			this.potencia = potencia;	
		}
			
	}	

	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		String lampada = "Lampada{";
		lampada += "potencia=" + this.potencia + ", ";
		lampada += "estado=" +this.estado + ", ";
		lampada += "fabricante=" + this.fabricante;
		lampada += "}";
		return lampada;
	}
}
