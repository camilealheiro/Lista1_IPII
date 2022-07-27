package questao03;

public class TesteEstoqueMain {

	public static void main(String[] args) {
		
		//Produtos
		Produto produto01 = new Produto("1", "Teclado");
		Produto produto02 = new Produto("2", "Mouse");
		
		//Estoques
		Estoque estoque1 = new Estoque(produto01, 20, 15);
		Estoque estoque2 = new Estoque(produto02,30, 10);
		
		//Operações 
		estoque1.darBaixa(10);
		estoque2.reporEstoque(19);
		
		System.out.println(estoque1.relatorio());
		System.out.println(estoque2.relatorio());
		
		produto01.mudarNome("Teclado Virtual");
		
		System.out.println(estoque1.relatorio());
		
		
	}

}
