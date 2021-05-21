package controller;

import model.Casa;

public class CasaDirector {
	public static Casa criarCasaComPiscinaESauna(String teto, String parede, String porta, String piscina, String sauna, CasaBuilder build) {
		return build.criarParede(parede).
				criarTeto(teto).
				criarPorta(porta).
				criarPiscina(piscina).
				criarSauna(sauna).build();
	}

	public static Casa repetirConstrucao(CasaBuilder baskara) {
		return baskara.build(); 
	}
}
