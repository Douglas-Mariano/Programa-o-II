package desafio1;

public class Disciplina {
	
	private Integer codigo;
	private String descricao;
	private Integer cargaHoraria;
	private String ementa;
	private String bibliografia;
	
	//metodos construtores
	
	public Disciplina() {
		super();
	}
	
	public Disciplina(Integer codigo, String descricao,
			Integer cargaHoraria, String ementa, String bibliografia) {
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setEmenta(ementa);
		this.setBibliografia(bibliografia);
	}
	
	public String toString() {
		return 	" Disciplina - "+
				" Código: "+ String.valueOf(this.getCodigo()) +", " +
				" Descrição: "+ this.getDescricao() +", "+
				" Carga Horária: "+ String.valueOf(this.getCargaHoraria()) +" Horas, " +
				" Ementa: "+ this.getEmenta() +", "+
				" Bibliografia: "+ this.getBibliografia();
	}
	
	//metodos assessores

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		if (codigo > 0) {
		this.codigo = codigo;
	}else {
		this.codigo = 0;
	}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		if (cargaHoraria > 0) {
			this.cargaHoraria = cargaHoraria;
		}else {
			this.cargaHoraria = 0;
		}
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}

	public void cadastrar() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Teste da classe Disciplina");
		
		Disciplina objDisciplina = new Disciplina();
		System.out.println(objDisciplina);
		
		Disciplina objDisciplina2 = new Disciplina(10, "Programação II", 50, "curso de ADS", "Prof: Júlio");
		System.out.println(objDisciplina2);
		
	}

}
