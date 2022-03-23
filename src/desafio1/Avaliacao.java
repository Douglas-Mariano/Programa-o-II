package desafio1;

public class Avaliacao {
	
	private Float nota1;
	private Float nota2;
	private Float notaProvaFinal;
	private Integer frequencia;
	
	//metodos construtores
	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(int nota1, int nota2, int notaProvaFinal, Integer frequencia) {
		super();
		this.nota1 = (float) nota1;
		this.nota2 = (float) nota2;
		this.notaProvaFinal = (float) notaProvaFinal;
		this.frequencia = frequencia;
	}
	
	public String toString() {
		return 	" Avaliacao - "+
				" 1ª Nota: "+ String.valueOf(this.getNota1())+ ", "+
				" 2ª Nota: "+ String.valueOf(this.getNota2())+ ", "+
				" Nota Final: "+ String.valueOf(this.getNotaProvaFinal())+ ", "+
				" Frequência: "+ String.valueOf(this.getFrequencia())+ "%";
	}
	
	//metodos assessores

	public Float getNota1() {
		return nota1;
	}

	public void setNota1(Float nota1) {
		if (nota1 > 0) {
			this.nota1 = nota1;
		}else {
			this.nota1 = (float) 0;
		}
	}

	public Float getNota2() {
		return nota2;
	}

	public void setNota2(Float nota2) {
		if (nota2 > 0) {
			this.nota2 = nota2;
		}else {
			this.nota2 = (float) 0;
		}
	}

	public Float getNotaProvaFinal() {
		return notaProvaFinal;
	}

	public void setNotaProvaFinal(Float notaProvaFinal) {
		if (notaProvaFinal > 0) {
			this.notaProvaFinal = notaProvaFinal;
		}else {
			this.notaProvaFinal = (float) 0;
		}
	}

	public Integer getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Integer frequencia) {
		if (frequencia > 0) {
			this.frequencia = frequencia;
		}else {
			this.frequencia = 0;
		}
	}
	
	public void lancarAvaliacao() {
		
	}

	public void calcularAprovacao() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Teste da classe Avaliacão");
		
		Avaliacao objAvaliacao = new Avaliacao();
		System.out.println(objAvaliacao);
		
		Avaliacao objAvaliacao2 = new Avaliacao(10, 8, 9, 90);
		System.out.println(objAvaliacao2);
		
	}

}
