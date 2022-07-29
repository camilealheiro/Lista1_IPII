package questao05;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String grupo;
	private LocalDate datadeNascimento;
	
	
	public Pessoa(String nome, String cpf, String grupo, LocalDate dataDeNascimento)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.grupo = grupo;
		this.datadeNascimento = dataDeNascimento;
	}
	
	public int calcularIdade()
	{
		LocalDate dataHoje = LocalDate.now();
		Period periodo = Period.between(getDatadeNascimento(), dataHoje);
		int idade = periodo.getYears();
		
		return idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String grupo) {
		ArrayList<String> gruposPoss = new ArrayList<>();
		gruposPoss.add("IDOSOS");
		gruposPoss.add("TRABALHADORES DA SAÚDE");
		gruposPoss.add("OUTRAS PRIORIDADES");
		
		if(gruposPoss.contains(grupo))
		{
			this.grupo = grupo;
		}
	}
	
	public LocalDate getDatadeNascimento() {
		return datadeNascimento;
	}
	
	public void setDatadeNascimento(LocalDate datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	
}
