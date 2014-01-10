package br.com.webagenda.convenio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="convenio")
public class Convenio implements Serializable {
	
	@Id
	@GeneratedValue
	private int idConvenio;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="sigla")
	private String sigla;
	
	//@OneToOne
	//@JoinColumn(name=""idTabela)
	//private Tabela tabela
	
	@Column(name="tipo_pagamento")
	private String tipoPagamento;
	
	@Column(name="usa_guia_tiss")
	private Boolean usaGuiaTiss;
	
	@Column(name="mais_uma_guia_sadt")
	private Boolean maisUmaGuiaSadt;
	
	@Column(name="impressao_total_guia")
	private Boolean impressaoTotalGuia;
	
	@Column(name="controla_intervalo_guia")
	private Boolean controlaIntervaloGuia;
	
	@Column(name="numero_guia_inicial")
	private long numeroGuiaInicial;
	
	@Column(name="numero_guia_final")
	private long numeroGuiaFinal;
	
	@Column(name="validade_senha")
	private Integer validadeSenha;
	
	@Column(name="digitos_matricula")
	private Integer digitosMatricula;
	
	@Column(name="digitos_guia")
	private Integer digitosGuia;
	
	@Column(name="suspenso")
	private Boolean suspenso;
	
	@Column(name="gerar_guia")
	private Boolean gerarGuia;
	
	@Column(name="varias_guias")
	private Boolean varias_guias;
	
	@Column(name="cid_obrigatorio")
	private Boolean cidObrigatorio;
	
	@Column(name="comentario")
	private String comentario;
	
	@Column(name="razao_social")
	private String razaoSocial;
	
	@Column(name="convenio_cnpj")
	private String convenioCnpj;
	
	@Column(name="inscricao_estadual")
	private String inscricaoEstadual;
	
	@Column(name="inscricao_municipal")
	private String inscricaoMunicipal;
	
	@Column(name="fone_1")
	private String fone1;
	
	@Column(name="fone_2")
	private String fone2;
	
	@Column(name="convenio_cep")
	private Integer convenio_cep;
	
	@Column(name="convenio_endereco")
	private String convenioEndereco;
	
	@Column(name="convenio_bairro")
	private String convenioBairro;
	
	@Column(name="convenio_cidade")
	private String convenioCidade;
	
	@Column(name="convenio_uf")
	private String convenioUF;
	
	@Column(name="convenio_numero")
	private String conevioNumero;
	
	@Column(name="convenio_complemento")
	private String convenioComplemento;

	public int getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Boolean getUsaGuiaTiss() {
		return usaGuiaTiss;
	}

	public void setUsaGuiaTiss(Boolean usaGuiaTiss) {
		this.usaGuiaTiss = usaGuiaTiss;
	}

	public Boolean getMaisUmaGuiaSadt() {
		return maisUmaGuiaSadt;
	}

	public void setMaisUmaGuiaSadt(Boolean maisUmaGuiaSadt) {
		this.maisUmaGuiaSadt = maisUmaGuiaSadt;
	}

	public Boolean getImpressaoTotalGuia() {
		return impressaoTotalGuia;
	}

	public void setImpressaoTotalGuia(Boolean impressaoTotalGuia) {
		this.impressaoTotalGuia = impressaoTotalGuia;
	}

	public Boolean getControlaIntervaloGuia() {
		return controlaIntervaloGuia;
	}

	public void setControlaIntervaloGuia(Boolean controlaIntervaloGuia) {
		this.controlaIntervaloGuia = controlaIntervaloGuia;
	}

	public long getNumeroGuiaInicial() {
		return numeroGuiaInicial;
	}

	public void setNumeroGuiaInicial(long numeroGuiaInicial) {
		this.numeroGuiaInicial = numeroGuiaInicial;
	}

	public long getNumeroGuiaFinal() {
		return numeroGuiaFinal;
	}

	public void setNumeroGuiaFinal(long numeroGuiaFinal) {
		this.numeroGuiaFinal = numeroGuiaFinal;
	}

	public Integer getValidadeSenha() {
		return validadeSenha;
	}

	public void setValidadeSenha(Integer validadeSenha) {
		this.validadeSenha = validadeSenha;
	}

	public Integer getDigitosMatricula() {
		return digitosMatricula;
	}

	public void setDigitosMatricula(Integer digitosMatricula) {
		this.digitosMatricula = digitosMatricula;
	}

	public Integer getDigitosGuia() {
		return digitosGuia;
	}

	public void setDigitosGuia(Integer digitosGuia) {
		this.digitosGuia = digitosGuia;
	}

	public Boolean getSuspenso() {
		return suspenso;
	}

	public void setSuspenso(Boolean suspenso) {
		this.suspenso = suspenso;
	}

	public Boolean getGerarGuia() {
		return gerarGuia;
	}

	public void setGerarGuia(Boolean gerarGuia) {
		this.gerarGuia = gerarGuia;
	}

	public Boolean getVarias_guias() {
		return varias_guias;
	}

	public void setVarias_guias(Boolean varias_guias) {
		this.varias_guias = varias_guias;
	}

	public Boolean getCidObrigatorio() {
		return cidObrigatorio;
	}

	public void setCidObrigatorio(Boolean cidObrigatorio) {
		this.cidObrigatorio = cidObrigatorio;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getConvenioCnpj() {
		return convenioCnpj;
	}

	public void setConvenioCnpj(String convenioCnpj) {
		this.convenioCnpj = convenioCnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getFone1() {
		return fone1;
	}

	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}

	public String getFone2() {
		return fone2;
	}

	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}

	public Integer getConvenio_cep() {
		return convenio_cep;
	}

	public void setConvenio_cep(Integer convenio_cep) {
		this.convenio_cep = convenio_cep;
	}

	public String getConvenioEndereco() {
		return convenioEndereco;
	}

	public void setConvenioEndereco(String convenioEndereco) {
		this.convenioEndereco = convenioEndereco;
	}

	public String getConvenioBairro() {
		return convenioBairro;
	}

	public void setConvenioBairro(String convenioBairro) {
		this.convenioBairro = convenioBairro;
	}

	public String getConvenioCidade() {
		return convenioCidade;
	}

	public void setConvenioCidade(String convenioCidade) {
		this.convenioCidade = convenioCidade;
	}

	public String getConvenioUF() {
		return convenioUF;
	}

	public void setConvenioUF(String convenioUF) {
		this.convenioUF = convenioUF;
	}

	public String getConevioNumero() {
		return conevioNumero;
	}

	public void setConevioNumero(String conevioNumero) {
		this.conevioNumero = conevioNumero;
	}

	public String getConvenioComplemento() {
		return convenioComplemento;
	}

	public void setConvenioComplemento(String convenioComplemento) {
		this.convenioComplemento = convenioComplemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cidObrigatorio == null) ? 0 : cidObrigatorio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convenio other = (Convenio) obj;
		if (cidObrigatorio == null) {
			if (other.cidObrigatorio != null)
				return false;
		} else if (!cidObrigatorio.equals(other.cidObrigatorio))
			return false;
		return true;
	}
	
	
	
	
	
	

}
