package com.andrade.paulo.jsf.primefaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DadosFilhosDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8975415274785811110L;
	private Long id;
	private String nome;
	private Date dataNascimento;
	private BigDecimal mesada;
	private BigDecimal poupanca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public BigDecimal getMesada() {
		return mesada;
	}
	public void setMesada(BigDecimal mesada) {
		this.mesada = mesada;
	}
	public BigDecimal getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(BigDecimal poupanca) {
		this.poupanca = poupanca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
