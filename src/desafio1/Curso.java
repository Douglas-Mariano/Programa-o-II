package desafio1;

public class Curso {
	
	private Integer codigo;
	private String descricao;
	
	//metodos construtores
	
		public Curso() {
			super();
		}
		
		public Curso(Integer codigo, String descricao) {
			super();
			this.setCodigo(codigo);
			this.setDescricao(descricao);
		}
		
		
		public String toString() {
			return 	" Curso - "+
					" Código: "+ String.valueOf(this.getCodigo()) +", " +
					" Descrição:  " + this.getDescricao();
		}
		
		//metodos assessores
		
		public void setCodigo(Integer valor) {
			if (valor > 0) {
				this.codigo = valor;
			}else {
				this.codigo = 0;
			}
		}
		
		public Integer getCodigo() {
			return this.codigo;
		}
		
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			return this.descricao;
		}
		
		
			
		public void cadastrar() {
			
		}
		
		
		public static void main(String[] args) {
			System.out.println("Teste da classe Curso");
			
			Curso objCurso = new Curso();
			System.out.println(objCurso);
			
			Curso objCurso2 = new Curso(10, "ADS");
			System.out.println(objCurso2);
			
		}

}
