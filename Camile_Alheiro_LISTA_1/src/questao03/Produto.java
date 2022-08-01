package questao03;

public class Produto {

	//Atributos
	private String codigo;
	private String nome;
	
	//Construtores
	public Produto()
	{
		codigo = "0";
		nome = "Produto";
	}
	
	public Produto(String codigo, String nome)
	{
		this.codigo = codigo;
		this.nome = nome;
	}
	
	//Métodos
	public String mudarNome(String nomeNovo)
	{
		nome = nomeNovo;
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
