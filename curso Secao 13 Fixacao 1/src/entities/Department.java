package entities;

//A classe Department representa um departamento, contendo informações sobre o nome do departamento.
public class Department {

// Atributos	
	private String name;
	
// construtor vazio	
	public Department() {
	}

// Construtor com parâmetros.	
	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}