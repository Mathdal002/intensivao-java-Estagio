package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;
/* A classe Worker representa um trabalhador com informa��es b�sicas, n�vel de habilidade,
 * sal�rio base, departamento e contratos de horas.
 */
public class Worker { 
// Atributos
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
// Construtor Vazio
	public Worker() {
	}

// Construtor com par�metros para inicializar todas as informa��es do trabalhador.	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

// Obt�m os contratos de horas do trabalhador.	
	public List<HourContract> getContracts() {
		return contracts;
	}

// Adiciona um contrato de horas � lista de contatos do trabalhador.	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
// Remove um contrato de horas da lista de contratos do trabalhador.	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
// Calcula a renda do trabalhador para um determinado ano e m�s.	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}