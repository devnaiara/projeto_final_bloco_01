package vibes80s.model;

public abstract class Album {
	private String nome;
	private int ano;
	private double valor;
	public Album(String nome, int ano, double valor) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void comprar() {
        System.out.println("\nComprando o álbum: "+ nome + "por R$: "+valor);
	}
	
}

