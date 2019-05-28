package main;

public class Pastel implements Receita {

	@Override
	public String prato() {
		return "Pastel de Carne e Queijo";
	}

	@Override
	public String receita() {
		return "prepare o guisado; abra a massa de pastel; coloque o guisado na massa; frite";
	}
}
