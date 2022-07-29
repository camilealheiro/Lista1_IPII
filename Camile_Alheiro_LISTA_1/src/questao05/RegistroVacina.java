package questao05;

import java.time.LocalDate;
import java.util.ArrayList;

public class RegistroVacina {

	private String id;
	private LocalDate data_vacinacao;
	private String atendente;
	private int dose;
	private String local;
	private String grupo;
	private Pessoa pessoa;
	private Vacina vacina;
	
	public RegistroVacina(String id, LocalDate data_vacinacao, String atendente, int dose, String local, String grupo, Pessoa pessoa, Vacina vacina)
	{
		this.id = id;
		this.data_vacinacao = data_vacinacao;
		this.atendente = atendente;
		this.dose = dose;
		this.local = local;
		this.grupo = grupo;
		this.pessoa = pessoa;
		this.vacina = vacina;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public LocalDate getData_vacinacao() {
		return data_vacinacao;
	}
	
	public void setData_vacinacao(LocalDate data_vacinacao) {
		this.data_vacinacao = data_vacinacao;
	}
	
	public String getAtendente() {
		return atendente;
	}
	
	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
	public int getDose() {
		return dose;
	}
	
	public void setDose(int dose) {
		
		ArrayList<Integer> dosePoss = new ArrayList<>();
		dosePoss.add(1);
		dosePoss.add(2);
		
		if(dosePoss.contains(dose));
		{
			this.dose = dose;
		}
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		
		ArrayList<String> locaisPoss = new ArrayList<>();
		locaisPoss.add("DRIVE THRU - UFRPE - UNIVERSIDADE RURAL");
		locaisPoss.add("DRIVE THRU GERALDÃO");
		locaisPoss.add("CENTRO DE VACINAÇÃO PARQUE DE EXPOSIÇÃO");
		locaisPoss.add("CENTRO DE VACINAÇÃO  COMPAZ ARIANO SUASSUNA");
		locaisPoss.add("DRIVE THRU PARQUE DE EXPOSIÇÃO");
		locaisPoss.add("DRIVE THRU ARRUDA");
		
		if(locaisPoss.contains(local))
		{
			this.local = local;
		}
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	
	
}
