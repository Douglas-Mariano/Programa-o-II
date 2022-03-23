package desafio1;

public class Professor extends Pessoa {
	
	private String titulacaoMaxima;
	
	//metodos construtores
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, String endereco, 
			String telefone, String titulacaoMaxima) {
		super(nome, endereco, telefone);
		this.titulacaoMaxima = titulacaoMaxima;
	}
	
	public String toString() {
		return 	" Professor - "+
				" Nome: "+ this.getNome()+", "+
				" Endereço: "+ this.getEndereco()+ ", "+
				" Telefone: "+ this.getTelefone()+ ", "+
				" Titulo: "+ this.getTitulacaoMaxima();
	}
	
	//metodos assessores

	public String getTitulacaoMaxima() {
		return titulacaoMaxima;
	}

	public void setTitulacaoMaxima(String titulacaoMaxima) {
		this.titulacaoMaxima = titulacaoMaxima;
	}

	public void cadastrar() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Teste da classe Professor");
		
		Professor objProfessor = new Professor();
		System.out.println(objProfessor);
		
		Professor objProfessor2 = new Professor("Júlio", "Teresópolis", "(21) 99999-9999", "Professor");
		System.out.println(objProfessor2);
		
	}

}
