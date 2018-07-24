package exemplo1;

public class Pessoa {

	private String nome;
	private int idade;
	private float altura;
	private float peso;
			
	public Pessoa(String nome, int idade, float altura, float peso) {
		//super();
		this.setNome(nome) = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
		public Pessoa(String nome) {
		//super();
		this.setNome(nome) = nome;
	}		

		public Pessoa() {
		//super();
	}

		public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + "]";
	}
		
}