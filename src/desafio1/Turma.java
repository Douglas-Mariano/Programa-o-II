package desafio1;

public class Turma {
	
	private Integer ano;
	private Integer semestre;
	private Integer diaSemana;
	private String horario;
	
	//metodos construtores
	
	public Turma() {
		super();
	}
	
	public Turma(Integer ano, Integer semestre, Integer diaSemana, String horario) {
		super();
		this.setAno(ano);
		this.setSemestre(semestre);
		this.setDiaSemana(diaSemana);
		this.setHorario(horario);
	}
	
	public String toString() {
		return 	"Turma - "+
				" Ano: "+ String.valueOf(this.getAno()) +", " +
				"Semestre: "+ String.valueOf(this.getSemestre()) +"º"+", " +
				"Dia da Semana: "+ String.valueOf(this.getDiaSemana()) +"ª Feira"+", " +
				"Horário: " + this.getHorario();
	}
	
	//metodos assessores
	
	public void setAno(Integer valor) {
		if (valor > 0) {
			this.ano = valor;
		}else {
			this.ano = 0;
		}
	}
	
	public Integer getAno() {
		return this.ano;
	}
	
	public void setSemestre(Integer valor) {
		if (valor > 0) {
			this.semestre = valor;
		}else {
			this.semestre = 0;
		}
	}
	
	public Integer getSemestre() {
		return this.semestre;
	}
	
	public void setDiaSemana(Integer valor) {
		if (valor > 0) {
			this.diaSemana = valor;
		}else {
			this.diaSemana = 0;
		}
	}
	
	public Integer getDiaSemana() {
		return this.diaSemana;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getHorario() {
		return this.horario;
	}
	
	
	public void abrirTurma() {
		
	}
	
	public void alocarProfessor() {
		
	}
	
	public void matricularAluno() {
		
	}
	
	public void emitirDiario() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Teste da classe Turma");
		
		Turma objTurma = new Turma();
		System.out.println(objTurma);
		
		Turma objTurma2 = new Turma(2022, 2, 5, "18 hrs");
		System.out.println(objTurma2);
		
	}

}
