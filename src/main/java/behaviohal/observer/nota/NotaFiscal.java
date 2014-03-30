package behaviohal.observer.nota;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private Calendar dataEmissao;
	private String observacoes;
	private List<ItemDaNota> itens;

	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double impostos, Calendar dataEmissao, String observacoes, List<ItemDaNota> itens) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataEmissao = dataEmissao;
		this.observacoes = observacoes;
		this.itens = itens;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cNPJ) {
		cnpj = cNPJ;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}
}
