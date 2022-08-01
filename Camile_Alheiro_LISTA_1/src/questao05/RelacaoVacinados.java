package questao05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RelacaoVacinados {

	//Atributos
	private RegistroVacina[] vacinados;
	private int vacinados1a = 0;
	private int vacinados2a = 0;

	
	//Construtor
	public RelacaoVacinados()
	{
		this.vacinados = new RegistroVacina[100];
	}
	
	
	//Métodos
	public int getVacinados1a() {
		return vacinados1a;
	}
	
	public int getVacinados2a() {
		return vacinados2a;
	}

	public RegistroVacina[] getVacinados() {
		return vacinados;
	}

	public void setVacinados(RegistroVacina[] vacinados) {
		this.vacinados = vacinados;
	}

	
	//Método adicionar
	public void adicionar(RegistroVacina registro)
	{
		for(int n = 0; n < vacinados.length; n++)
		{
			if(vacinados[n] == null)
			{
				vacinados[n] = registro;
				break;
			}
			else if(registro.getPessoa().getCpf() == vacinados[n].getPessoa().getCpf() && registro.getDose() == 2)
			{
				vacinados[n].setDose(2);
				break;
			}
		}
	}
	
	
	//Método de calcular vacinados a partir de uma determinada idade
	public double calcularTotalVacinadosAcimade(int idade)
	{
	    double pessVacinadas = 0;
		for(int i = 0; i < vacinados.length; i++)
		{
			if(vacinados[i] != null && vacinados[i].getPessoa().calcularIdade() > idade)
			{
				if(vacinados[i].getDose() == 2 || vacinados[i].getDose() == 1)
				{
					pessVacinadas++;
				}
			}
		}
		return pessVacinadas;
	}
	
	
	//Método de calcular idosos que tomaram a 2a dose
	public void totalDeIdososQueTomaram2aDose()
	{
		int idososVacinados = 0;
		for(int i = 0; i < vacinados.length; i++)
		{
			if(vacinados[i] != null && vacinados[i].getPessoa().calcularIdade() >= 65 )
			{
				if(vacinados[i].getDose() == 2)
				{
					idososVacinados++;
				}
			}
		}
		
		System.out.println(idososVacinados);
	}
	
	
	//Método de listar pessoas
	public void listarPessoasQueNaoTomaram2aDose()
	{
		for(int i = 0; i < vacinados.length; i++)
		{		
			if(vacinados[i] != null && vacinados[i].getDose() == 1)
			{
				vacinados1a++;
				LocalDate data2aDose = vacinados[i].getData_vacinacao().plusDays(21);
				DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.printf("%-15s | %-15s | %8d | %24s%n", vacinados[i].getPessoa().getCpf(), vacinados[i].getPessoa().getNome(), vacinados[i].getPessoa().calcularIdade(), data2aDose.format(formatador));
			}
			
			else if(vacinados[i] != null && vacinados[i].getDose() == 2)
			{
				vacinados2a++;
			}	
		}
	}
}
