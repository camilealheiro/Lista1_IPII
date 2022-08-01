package questao02;

import java.util.Scanner;

public class Tabuleiro {
	
	//Conferir se o cavalo está fora do tabuleiro
	public static boolean foraTabuleiro(int linha, int coluna)
	{
		return(linha < 0 || linha > 7 || coluna < 0 || coluna > 7);
	}
	
	public static double cavaloNoTabuleiro(int x, int y, int k)
	{
		//Variáveis 
		int cLinhas[] = {-2, -2, -1, -1, 1, 1, 2, 2};;
		int cColunas[] = {1, -1, 2, -2, 2, -2, 1, -1};
		double cPoss[][][] = new double[8][8][k + 1];
        
		//Caso as posições iniciais estejam fora do tabuleiro
        if(foraTabuleiro(x,y))
        {
        	return 0;
        }
        
        //Caso a quantidade de movimentos for 0
        if(k == 0)
        {
        	return 1;
        }
        
        //Calculo da probabilidade
        for(int n = 0; n < 8; n++)
        {
        	for(int m = 0; m < 8; m++)
        	{
        		cPoss[n][m][0] = 1;
        	}
        }
        
        for(int i = 1; i <= k; i++)
        {
        	for(int n = 0; n < 8; n++)
        	{
        		for(int m = 0; m < 8; m++)
        		{
        			double probabilidade = 0;
        			
        			for(int j = 0; j < 8; j++)
        			{
        				int cl = n + cLinhas[j];
        				int cc = m + cColunas[j];
        				
        				if(cl >= 0 && cl < 8 && cc >= 0 && cc < 8)
        				{
        					probabilidade += cPoss[cl][cc][i - 1] / 8; 
        				}
        			}
        			
        			cPoss[n][m][i] = probabilidade;
        		}
        	}
        }
        
        return cPoss[x][y][k];
	}

	public static void main(String[] args) {
		
		//Pedir para escolher a posição e os movimentos
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a linha inicial do cavalo: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite coluna inicial do cavalo: ");
		int y = scanner.nextInt();
		
		System.out.println("Digite a quantidade de movimentos do cavalo: ");
		int k = scanner.nextInt();
		
		double f = cavaloNoTabuleiro(x, y, k);
		
		System.out.printf("%s %.3f", "A probabilidade do cavalo estar dentro do tabuleiro é: ", f);
		scanner.close();

	}

}
