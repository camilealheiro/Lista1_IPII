package questao02;

import java.util.Scanner;

public class Tabuleiro {
	
	public static float cavaloNoTabuleiro(int x, int y, int movimentos)
	{
        int passosPoss = 8;
        int passosFora = 0;
        int passosT = movimentos;
        int aux = 0;
        int linha = x;
    	int coluna = y;
        
        do
        {
        	int rand = (int)(Math.random() * 8 + 1);
        	
        	switch(rand)
        	{
        	case 1:
        		linha++;
        		coluna -= 2;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 2:
        		linha--;
        		coluna -= 2;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 3:
        		linha--;
        		coluna += 2;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 4: 
        		linha++;
        		coluna += 2;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 5:
        		linha += 2;
        		coluna--;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 6:
        		linha += 2;
        		coluna++;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 7:
        		linha -= 2;
        		coluna--;
        		//aux++;
        		
        		if(linha < 0 || linha > 7 || coluna < 0 || linha > 7)
        		{
        			passosFora++;
        		}
        	break;
        	
        	case 8:
        		linha -= 2;
        		coluna++;
        		//aux++;
        		
        		if(linha < 0 && linha > 7 || coluna < 0 && linha > 70)
        		{
        			passosFora++;
        		}
        	break;
        	}
        	
        	aux++;
        	
        }while(aux < movimentos);
        
//        if(passosFora == 0)
//        {
//        	passosFora = 8;
//        }
     
        return(passosFora/passosPoss);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a linha inicial do cavalo: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite coluna inicial do cavalo: ");
		int y = scanner.nextInt();
		
		System.out.println("Digite a quantidade de movimentos do cavalo: ");
		int k = scanner.nextInt();
		
		float f = cavaloNoTabuleiro(x, y, k);
		
		System.out.println("A probabilidade do cavalo estar dentro do tabuleiro é: " + f);
		scanner.close();

	}

}
