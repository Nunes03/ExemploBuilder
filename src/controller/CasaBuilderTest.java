package controller;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Casa;

public class CasaBuilderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testBuild() {
		CasaBuilder casaB = new CasaBuilder();
		
		Casa casa = casaB.criarParede("Parede normal").
		criarTeto("teto normal").
		criarPorta("Porta madeira").
		build();
		
		Casa casa2 = casaB.build();
		
		System.out.println(casa.toString());
		System.out.println(casa2.toString());

	}

}
