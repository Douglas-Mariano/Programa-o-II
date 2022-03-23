package desafio1;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String situacao;
	
	//metodos construtores
	
	public Aluno() {
			super();
	}
	
	public Aluno(String nome, String endereco, String telefone,
			String matricula, String situacao) {
		super(nome, endereco, telefone);
		this.matricula = matricula;
		this.situacao = situacao;
	}
	
	public String toString() {
		return 	" Aluno - "+
				" Nome: "+ this.getNome()+", "+
				" Endereço: "+ this.getEndereco()+ ", "+
				" Telefone: "+ this.getTelefone()+ ", "+
				" Matrícula: "+ this.getMatricula()+ ", "+
				" Situação: "+ this.getSituacao();
	}
	
	//metodos assessores
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void matricularCurso() {
		
	}
	
	public void trancar() {
		
	}
	
	public void formar() {
		
	}
	
	public void evadir() {
		
	}
	
	public void obterAvaliacoes() {
		
	}
	
	public void emitirHistorico() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Teste da classe Aluno");
		
		Aluno objAluno = new Aluno();
		System.out.println(objAluno);
		
		Aluno objAluno2 = new Aluno("Douglas", "Teresópolis", "(21) 99999-9999", "123", "Apto");
		System.out.println(objAluno2);
		
	}

}
