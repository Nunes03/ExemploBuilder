package controller;

import interfaces.CasaBuilderInterface;
import model.Casa;

public class CasaBuilder implements CasaBuilderInterface{
	private String parede;
	private String porta;
	private String teto;
	private String piscina;
	private String sauna;
	private String lagoArtificial;
	private String jardim;
	
	
	@Override
	public CasaBuilder criarParede(String parede) {
		this.parede = parede;
		return this;
	}

	@Override
	public CasaBuilder criarTeto(String teto) {
		this.teto = teto;
		return this;
	}

	@Override
	public CasaBuilder criarPorta(String porta) {
		this.porta = porta;
		return this;
	}

	@Override
	public CasaBuilder criarPiscina(String piscina) {
		this.piscina = piscina;
		return this;
	}

	@Override
	public CasaBuilder criarLagoArtificial(String lagoArtificial) {
		this.lagoArtificial = lagoArtificial;
		return this;
	}

	@Override
	public CasaBuilder criarJardim(String jardim) {
		this.jardim = jardim;
		return this;
	}

	@Override
	public CasaBuilder criarSauna(String sauna) {
		this.sauna = sauna;
		return this;
	}
	
	public Casa build() {
		return new Casa(parede, porta, teto, piscina, sauna, lagoArtificial, jardim);
	}
	
	public String getParede() {
		return parede;
	}

	public void setParede(String parede) {
		this.parede = parede;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getTeto() {
		return teto;
	}

	public void setTeto(String teto) {
		this.teto = teto;
	}

	public String getPiscina() {
		return piscina;
	}

	public void setPiscina(String piscina) {
		this.piscina = piscina;
	}

	public String getSauna() {
		return sauna;
	}

	public void setSauna(String sauna) {
		this.sauna = sauna;
	}

	public String getLagoArtificial() {
		return lagoArtificial;
	}

	public void setLagoArtificial(String lagoArtificial) {
		this.lagoArtificial = lagoArtificial;
	}

	public String getJardim() {
		return jardim;
	}

	public void setJardim(String jardim) {
		this.jardim = jardim;
	}
}
