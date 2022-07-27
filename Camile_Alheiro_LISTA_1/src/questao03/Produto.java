package questao03;

public class Produto {

	//atributos
	private String codigo;
	private String nome;
	
	//construtor
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
	
	//métodos
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
