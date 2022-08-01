package questao05;

import java.util.ArrayList;

public class Vacina {

	//Atributos
	private int codigo;
	private String nome;
	private String lote;
	
	
	//Construtor
	public Vacina(int codigo, String nome, String lote)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.lote = lote;
	}
	
	
	//Métodos
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		ArrayList<String> nomesPoss = new ArrayList<>();
		nomesPoss.add("CORONAVAC");
		nomesPoss.add("OXFORD");
		
		if(nomesPoss.contains(nome))
		{
			this.nome = nome;
		}
	}
	
	public String getLote() {
		return lote;
	}
	
	public void setLote(String lote) {
		this.lote = lote;
	}
}
