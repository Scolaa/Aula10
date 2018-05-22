package br.com.db1start.calculadora;

public class Multiplicacao implements OperacaoMatematica {

	@Override
	public Double calcula(Double valor1, Double valor2) {
		return valor1 * valor2;
	}

}
