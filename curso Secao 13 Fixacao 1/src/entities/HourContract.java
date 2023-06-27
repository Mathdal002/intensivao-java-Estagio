package entities;

import java.util.Date;

/* A classe HourContract representa um contrato de horas, contendo informa��es sobre a data do contrato,
 * o valor pr hora e a quatidade de horas trabalhadas .
 */
public class HourContract {

// Atributos	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
//Construtor vazio	
	public HourContract() {
	}

//Construtor com par�metros para inicializar todas as informa��es do contrato de horas.	
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

// Define a quantidade de horas trabalhadas no contrato.	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
// Calcula o valor total do contrato de horas.	
	public double totalValue() {
		return valuePerHour * hours;
	}
}