package com.andrade.paulo.jsf.primefaces;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.PrimeFaces;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class TesteBean implements Serializable {
	
	private static final long serialVersionUID = -2837870101339275688L;
	
	private String name;
	
	private DadosPessoaDTO dadosPessoaDTO;
	private DadosFilhosDTO dadosFilhoSelecionado;
	
	private List<SelectItem> listaGrauParentesco;
	
	private String acaoCrudFilhos;
	
	@PostConstruct
	public void init() {
		
		dadosPessoaDTO = new DadosPessoaDTO();
		dadosPessoaDTO.setSalario(BigDecimal.ZERO);
		dadosPessoaDTO.setPoupanca(BigDecimal.ZERO);
		dadosPessoaDTO.setSalario(BigDecimal.ZERO);
		dadosPessoaDTO.setLimiteGastos(BigDecimal.ZERO);
		
		dadosPessoaDTO.setFilhos(new ArrayList<>());
//		DadosFilhosDTO filhoTeste = new DadosFilhosDTO();
//		filhoTeste.setNome("Paulo Junior");
//		filhoTeste.setDataNascimento(new Date());
//		filhoTeste.setMesada(new BigDecimal("100.50"));
//		dadosPessoaDTO.getFilhos().add(filhoTeste);
		
		listaGrauParentesco = new ArrayList<>();
		listaGrauParentesco.add(new SelectItem("Pai"));
		listaGrauParentesco.add(new SelectItem("Mãe"));
	}
	
	public void encerrarEdicaoFilhos() {
		dadosFilhoSelecionado = null;
	}
	
	public void excluirFilho() {
		dadosPessoaDTO.getFilhos().remove(dadosFilhoSelecionado);
		dadosFilhoSelecionado = null;
	}
	
	public void aplicarEdicaoFilhos() {
		
		if(dadosFilhoSelecionado.getNome().isEmpty() || dadosFilhoSelecionado.getDataNascimento() == null) {
			
			StringBuilder sb = new StringBuilder();
			if(dadosFilhoSelecionado.getNome().isEmpty()) {
				sb.append("O campo nome é obrigatório \r\n ");
			}
			if(dadosFilhoSelecionado.getDataNascimento() == null) {
				sb.append("O campo data nascimento é obrigatório, ");
			}
			
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, sb.toString(), ""));
			
		} else {
			
			if(acaoCrudFilhos.equals("Adicionar")) {
				dadosPessoaDTO.getFilhos().add(dadosFilhoSelecionado);						
			} else if(acaoCrudFilhos.equals("Alterar")) {
				System.out.println("eu ein");
			}
			PrimeFaces.current().executeScript("PF('dlgEdicaoDadosFilho').hide()");
		}
		dadosFilhoSelecionado = null;
		
	}
	
	public void preAdicionarFilho() {
		this.dadosFilhoSelecionado = new DadosFilhosDTO();
		this.dadosFilhoSelecionado.setMesada(BigDecimal.ZERO);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DadosPessoaDTO getDadosPessoaDTO() {
		return dadosPessoaDTO;
	}

	public void setDadosPessoaDTO(DadosPessoaDTO dadosPessoaDTO) {
		this.dadosPessoaDTO = dadosPessoaDTO;
	}

	public DadosFilhosDTO getDadosFilhoSelecionado() {
		return dadosFilhoSelecionado;
	}

	public void setDadosFilhoSelecionado(DadosFilhosDTO dadosFilhoSelecionado) {
		this.dadosFilhoSelecionado = dadosFilhoSelecionado;
	}

	public List<SelectItem> getListaGrauParentesco() {
		return listaGrauParentesco;
	}

	public void setListaGrauParentesco(List<SelectItem> listaGrauParentesco) {
		this.listaGrauParentesco = listaGrauParentesco;
	}

	public String getAcaoCrudFilhos() {
		return acaoCrudFilhos;
	}

	public void setAcaoCrudFilhos(String acaoCrudFilhos) {
		this.acaoCrudFilhos = acaoCrudFilhos;
	}	
}
