package desafio1;

public class Pessoa {
	
	protected String nome;
	protected String endereco;
	protected String telefone;
	
	//metodos construtores
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	
	public String toString() {
		return 	" Pessoa - "+
				" Nome: "+ this.getNome()+", "+
				" Endereço: "+ this.getEndereco()+ ", "+
				" Telefone: "+ this.getTelefone();
	}
	
	//metodos assessores

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public void cadastrar() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Teste da classe Pessoa");
		
		Pessoa objPessoa = new Pessoa();
		System.out.println(objPessoa);
		
		Pessoa objPessoa2 = new Pessoa("Douglas", "Teresópolis", "(21) 99999-9999");
		System.out.println(objPessoa2);
		
	}


}
