package questao03;

public class Estoque {

	private Produto produto;
	private int qtdAtual;
	private int qtdMinima;
	
	//construtores
	public Estoque()
	{
		this.produto = null;
		this.qtdAtual = 0;
		this.qtdMinima = 0;
	}
	
	public Estoque(Produto produto, int qtdAtual, int qtdMinima)
	{
		this.produto = produto;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	//metodos
	public double mudarQtdMinima(int qtdMinimaNova)
	{
		qtdMinima = qtdMinimaNova;
		return qtdMinima;
	}
	
	public void reporEstoque(int qtd)
	{
		qtdAtual += qtd;
	}
	
	public void darBaixa(int qtd)
	{
		if(qtdAtual >= qtd)
		{
			qtdAtual -= qtd;
		}
		else
		{
			System.out.println("Estoque insuficiente");
		}
		
		if(qtdAtual < qtdMinima)
		{
			System.out.println("Estoque insuficiente");
		}
	}
	
	public String relatorio()
	{
		String relatorio;
		relatorio = String.format("Produto: %s - %s \nQuantidade Atual: %d \nQuantidade Mínima: %d\n", this.produto.getNome(), this.produto.getCodigo(), this.qtdAtual, this.qtdMinima);
		relatorio += "----------------------------";
		return relatorio;
	}
}
