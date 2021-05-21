package interfaces;

import controller.CasaBuilder;

public interface CasaBuilderInterface {
	CasaBuilder criarParede(String parede);
	CasaBuilder criarTeto(String teto);
	CasaBuilder criarPorta(String porta);
	CasaBuilder criarPiscina(String piscina);
	CasaBuilder criarLagoArtificial(String lagoArtificial);
	CasaBuilder criarJardim(String jardim);
	CasaBuilder criarSauna(String sauna);
}
