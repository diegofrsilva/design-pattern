package creational.builder.nota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private Calendar dataEmissao;
	private String observacoes;
	private List<ItemDaNota> itens;

	public NotaFiscalBuilder() {
		this.dataEmissao = Calendar.getInstance();
		this.itens = new ArrayList<ItemDaNota>();
	}
	
	public NotaFiscalBuilder comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota item) {
		this.itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comData(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscal criar() {
		return new NotaFiscal(razaoSocial, cnpj, valorBruto, impostos, dataEmissao, observacoes, itens);
	}
}
