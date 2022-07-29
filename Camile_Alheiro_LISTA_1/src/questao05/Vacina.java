package questao05;

import java.util.ArrayList;

public class Vacina {

	private int codigo;
	private String nome;
	private String lote;
	
	
	public Vacina(int codigo, String nome, String lote)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.lote = lote;
	}
	
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
//		else 
//		{
//			System.out.println("Você digitou uma vacina inválida");
//		}
	}
	
	public String getLote() {
		return lote;
	}
	
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
}
