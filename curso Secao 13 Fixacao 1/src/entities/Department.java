package entities;

//A classe Department representa um departamento, contendo informa��es sobre o nome do departamento.
public class Department {

// Atributos	
	private String name;
	
// construtor vazio	
	public Department() {
	}

// Construtor com par�metros.	
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