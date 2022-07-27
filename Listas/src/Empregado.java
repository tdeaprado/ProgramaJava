
public class Empregado {
	
	private Integer Id;
	private String nome;
	private Double salario;
	

	public Empregado(Integer Id,String nome,Double salario) {
		
		setId(Id);
		setNome(nome);
		setSalario(salario);
		
	}
	
	
	
	public Integer getId() {
		return Id;
	}


	private void setId(Integer id) {
		Id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	private void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public void aumentarSalario (double percentage) {
		this.salario = this.salario + this.salario*percentage/100.0;
		
	}


	
	
	

}