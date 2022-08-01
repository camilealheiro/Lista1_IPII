package questao04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class JavaTime {
	
	//Calculo dos dias úteis
	public static long diasUteis(LocalDate dia1, LocalDate dia2)
	{	
		long difDias = dia1.until(dia2, ChronoUnit.DAYS);
		long diasUteis = 0;
		
		for(int i = 0; i <= difDias; i++)
		{
			if(dia1.plusDays(i).getDayOfWeek().getValue() != 6 && dia1.plusDays(i).getDayOfWeek().getValue() != 7)
			{
				diasUteis++;
			}
		}
		return diasUteis;
	}

	public static void main(String[] args) {
		
		//a)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma data no formato dd/MM/yyyy: ");
		String dataString = scanner.nextLine();
		System.out.println("-------------------------------------------------\n");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(dataString, formatter);
		
		//b)
		LocalDate dataHoje = LocalDate.now();

		long difDias = dataHoje.until(data, ChronoUnit.DAYS);
		
		System.out.println("A diferença em dias entre as datas é: " + difDias);
		System.out.println("-------------------------------------------------\n");
		
		//c)
		LocalDate somaDias = data.plusDays(110);
		System.out.println("Data com mais 110 dias adicionados: " + somaDias);
		System.out.println("-------------------------------------------------\n");
		
		//d)
		LocalDate mesAgosto = somaDias.withMonth(8);
		System.out.println("A data com o mês alterado é: " + mesAgosto);
		System.out.println("-------------------------------------------------\n");
		
		//e)
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String dataFormat = formatador.format(mesAgosto);
		System.out.println("A data formadata fica: " + dataFormat);
		System.out.println("-------------------------------------------------\n");
		
		//f)
		System.out.println("Digite outra data (no formato dd/MM/yyyy): ");
		String data1String = scanner.nextLine();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data1 = LocalDate.parse(data1String, format1);
		
		
		System.out.println("\nDigite mais outra data (no formato dd/MM/yyyy): ");
		String data2String = scanner.nextLine();
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data2 = LocalDate.parse(data2String, format2);
		System.out.println("-------------------------------------------------\n");
		
		long d = diasUteis(data1, data2);
		System.out.println("A quantidade de dias úteis entre os dias é: " + d);
		
		scanner.close();
	}

}
