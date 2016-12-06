package scj28.java.atividadefinal.vo;

import java.time.LocalDate;

import scj28.java.atividadefinal.enumeration.TipoDeOrdenacao;

/**
 * É apenas um POJO criado para trafegar dados necessarios
 * para executar as ações.
 * 
 * @author cliente
 */
public class TweetVO {

	private String hashTag;

	private LocalDate dataInicio;

	private LocalDate dataAgora;

	private TipoDeOrdenacao tipoDeOrdenacao;

	public TipoDeOrdenacao getTipoDeOrdenacao() {
		return tipoDeOrdenacao;
	}

	public TweetVO setTipoDeOrdenacao(TipoDeOrdenacao tipoDeOrdenacao) {
		this.tipoDeOrdenacao = tipoDeOrdenacao;
		return this;
	}

	public String getHashTag() {
		return hashTag;
	}

	public TweetVO setHashTag(String hashTag) {
		this.hashTag = hashTag;
		return this;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public TweetVO setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
		return this;
	}

	public LocalDate getDataAgora() {
		return dataAgora;
	}

	public TweetVO setDataAgora(LocalDate dataAgora) {
		this.dataAgora = dataAgora;
		return this;
	}
}
