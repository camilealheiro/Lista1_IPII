package questao05;

import java.time.LocalDate;

public class TesteVacinaMain {
	
	//imprime os dados da tabela
	public static void Dados(RelacaoVacinados vacinados)
	{
		System.out.printf("%-15s %-17s %-10s %-26s", "CPF", "| Nome", "| Idade ", "| Data Indicada p. 2a Dose\n");
		System.out.println("-----------------------------------------------------------------------");	
		vacinados.listarPessoasQueNaoTomaram2aDose();
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%s %.0f", "Total de vacinados acima de 65 anos: ", vacinados.calcularTotalVacinadosAcimade(65));
		System.out.printf("%s %d", "\nTotal de vacinados que não tomaram a 2a. dose: ", vacinados.getVacinados1a());
		System.out.printf("%s %d", "\nTotal de vacinados que tomaram a 2a. dose: ", vacinados.getVacinados2a());
	}
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("José Maria", "0333787383", "IDOSOS", LocalDate.of(1955, 5, 13));
		Pessoa p2 = new Pessoa("Maria José", "3830333787", "IDOSOS", LocalDate.of(1953, 6, 12));
		Pessoa p3 = new Pessoa("José Silva", "7870333383", "IDOSOS", LocalDate.of(1951, 12, 15));
		Pessoa p4 = new Pessoa("Maria Silva", "3787303383", "IDOSOS", LocalDate.of(1955, 10, 23));
		Pessoa p5 = new Pessoa("Silva Maria", "3483906353", "IDOSOS", LocalDate.of(1945, 9, 21));
		
		Vacina v1 = new Vacina(1, "CORONAVAC", "123");
		Vacina v2 = new Vacina(2, "OXFORD", "456");
		
		RegistroVacina rv1 = new RegistroVacina("123", LocalDate.of(2022, 8, 13), "Rogéria", 1, "DRIVE THRU - UFRPE - UNIVERSIDADE RURAL", p1.getGrupo(), p1, v1);
		RegistroVacina rv2 = new RegistroVacina("456", LocalDate.of(2022, 7, 10), "Roberto", 1, "DRIVE THRU GERALDÃO", p2.getGrupo(), p2, v2);
		RegistroVacina rv3 = new RegistroVacina("789", LocalDate.of(2022, 3, 04), "Alana", 1, "CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO", p3.getGrupo(), p3, v1);
		RegistroVacina rv4 = new RegistroVacina("012", LocalDate.of(2022, 12, 23), "Alana", 1, "CENTRO DE VACINAÇÃO  COMPAZ ARIANO SUASSUNA", p4.getGrupo(), p4, v2);
		RegistroVacina rv5 = new RegistroVacina("345", LocalDate.of(2022, 5, 20), "Rogéria", 1, "DRIVE THRU PARQUE DE EXPOSIÇÃO", p5.getGrupo(), p5, v1);
		RegistroVacina rv6 = new RegistroVacina("678", LocalDate.of(2022, 9, 29), "Rogéria", 2, "DRIVE THRU ARRUDA", p5.getGrupo(), p5, v1);
	
		
		RelacaoVacinados tabela = new RelacaoVacinados();
		
		
		tabela.adicionar(rv1);
		tabela.adicionar(rv2);
		tabela.adicionar(rv3);
		tabela.adicionar(rv4);
		tabela.adicionar(rv5);
		tabela.adicionar(rv6);
		
		
		Dados(tabela);
	}
}
