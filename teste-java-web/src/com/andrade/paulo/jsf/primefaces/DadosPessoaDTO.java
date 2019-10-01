package com.andrade.paulo.jsf.primefaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class DadosPessoaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4207927629501227207L;
	private Long id;
	private String nome;
	private Date dataNascimento;
	private String grauParecentescoFilhos;
	private BigDecimal salario;
	private BigDecimal poupanca;
	private BigDecimal limiteGastos;
	private List<DadosFilhosDTO> filhos;
	
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
	public String getGrauParecentescoFilhos() {
		return grauParecentescoFilhos;
	}
	public void setGrauParecentescoFilhos(String grauParecentescoFilhos) {
		this.grauParecentescoFilhos = grauParecentescoFilhos;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public BigDecimal getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(BigDecimal poupanca) {
		this.poupanca = poupanca;
	}
	public BigDecimal getLimiteGastos() {
		return limiteGastos;
	}
	public void setLimiteGastos(BigDecimal limiteGastos) {
		this.limiteGastos = limiteGastos;
	}
	public List<DadosFilhosDTO> getFilhos() {
		return filhos;
	}
	public void setFilhos(List<DadosFilhosDTO> filhos) {
		this.filhos = filhos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	} 		
}
