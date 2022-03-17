package br.com.checkpoint.checkpoint1_micro.model;

import java.math.BigDecimal;

public class Games {
	private Long id;
	private String nome;
	private Integer quantidade;
	private BigDecimal valor;
	private Integer anoLancamento;
	private Integer classificacao;
	
	
	public Games(Long id, String nome, Integer quantidade, BigDecimal valor, Integer anoLancamento,
			Integer classificacao) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.anoLancamento = anoLancamento;
		this.classificacao = classificacao;
	}

	public Games() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public Integer getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	
}
