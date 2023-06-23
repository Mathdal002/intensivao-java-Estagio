package entities.enums;

public enum FormaPagamento {
	
	Dinheiro("Dinheiro", 1),
	Cartao_Credito("Cartão de Crédito", 2),
	Cartao_Debito("Cartão de Debito", 3),
	Pix("Pix", 4),
	Cheque("Cheque", 5);
	
	private String nome;
	private int codigo;
	
	private FormaPagamento(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
