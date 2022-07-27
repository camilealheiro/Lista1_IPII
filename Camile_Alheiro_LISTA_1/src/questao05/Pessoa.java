package questao05;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String cpf;
	private String grupo;
	private LocalDate datadeNascimento;
	
	
	public int calcularIdade()
	{
		LocalDate dataHoje = LocalDate.now();
		Period periodo = Period.between(dataHoje, getDatadeNascimento());
		int idade = periodo.getYears();
		
		return idade;
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
		this.grupo = grupo;
	}
	public LocalDate getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(LocalDate datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	
}
