package model;

public class Casa {
	private String parede;
	private String porta;
	private String teto;
	private String piscina;
	private String sauna;
	private String lagoArtificial;
	private String jardim;
	
	
	public Casa(String parede, String porta, String teto, String piscina, String sauna, String lagoArtificial,
			String jardim) {
		this.parede = parede;
		this.porta = porta;
		this.teto = teto;
		this.piscina = piscina;
		this.sauna = sauna;
		this.lagoArtificial = lagoArtificial;
		this.jardim = jardim;
	}
	
	
	
	@Override
	public String toString() {
		return "Casa [parede=" + parede + ", porta=" + porta + ", teto=" + teto + ", piscina=" + piscina + ", sauna="
				+ sauna + ", lagoArtificial=" + lagoArtificial + ", jardim=" + jardim + "]";
	}



	public String getParede() {
		return this.parede;
	}
	
	public void setParede(String parede) {
		this.parede = parede;
	}
	
	public String getPorta() {
		return this.porta;
	}
	
	public void setPorta(String porta) {
		this.porta = porta;
	}
	
	public String getTeto() {
		return this.teto;
	}
	
	public void setTeto(String teto) {
		this.parede = teto;
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
