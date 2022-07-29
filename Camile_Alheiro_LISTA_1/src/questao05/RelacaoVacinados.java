package questao05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RelacaoVacinados {

	private RegistroVacina[] vacinados = new RegistroVacina[200];
	private int indice;

	public RelacaoVacinados(RegistroVacina[] vacinados)
	{
		this.vacinados = vacinados;
		this.indice = 0;
	}
	

	public RegistroVacina[] getVacinados() {
		return vacinados;
	}

	public void setVacinados(RegistroVacina[] vacinados) {
		this.vacinados = vacinados;
	}


	public void adicionar(RegistroVacina registro)
	{
		vacinados[this.indice] = registro;
		this.indice++;
	}
	
	public void remover(RegistroVacina registro)
	{
		vacinados[this.indice] = null;
		this.indice++;
	}
	
	
	public double calcularTotalVacinadosAcimade(int idade)
	{
	    double pessVacinadas = 0;
		for(RegistroVacina total: vacinados)
		{
			if(total.getPessoa().calcularIdade() > idade)
			{
				if(total.getDose() == 2 || total.getDose() == 1)
				{
					pessVacinadas++;
				}
			}
		}
		return pessVacinadas;
	}
	
	public void totalDeIdososQueTomaram2aDose()
	{
		int idososVacinados = 0;
		for(RegistroVacina total: vacinados)
		{
			if(total.getPessoa().calcularIdade() >= 65)
			{
				if(total.getDose() == 2)
				{
					idososVacinados++;
				}
			}
		}
		
		System.out.println(idososVacinados);
	}
	
	public int vacinadosQueNaoTomaram2aDose()
	{
		int primeiraD = 0;
		
		
		
		return primeiraD;
	}
	
	public void listarPessoasQueNaoTomaram2aDose()
	{
		int vacinados2a = 0;
		int vacinados1a = 0;
		
		//System.out.printf("%-15s %-17s %-10s %-24s", "CPF", "| Nome ", "| Idade ", "| Data Indicada p. 2a Dose\n");
		//System.out.println("-----------------------------------------------------------------------");
		
		for(RegistroVacina total: vacinados)
		{		
			if(total.getDose() == 1)
			{
				vacinados1a++;
				LocalDate data2aDose = total.getData_vacinacao().plusDays(21);
				DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.printf("%-15s | %-15s | %8d | %20s%n", total.getPessoa().getCpf(), total.getPessoa().getNome(), total.getPessoa().calcularIdade(), data2aDose.format(formatador));
			}
			
			if(total.getDose() == 2)
			{
				vacinados2a++;
			}	
			
		}
		//System.out.println("-------------------------------------------------------------");
		//System.out.printf("%s %d", "Total de vacinados acima de 65 anos: ", vacinadosIdosos);
		//System.out.printf("%s %d", "\nTotal de vacinados que não tomaram a 2a. dose: ", vacinados1a);
		//System.out.printf("%s %d", "\nTotal de vacinados que tomaram a 2a. dose: ", vacinados2a);
		
	}
}
