package OperadoresTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.calculadora.Divisao;
import br.com.db1start.calculadora.Multiplicacao;
import br.com.db1start.calculadora.OperacaoMatematica;
import br.com.db1start.calculadora.Soma;
import br.com.db1start.calculadora.Subtracao;

public class OperadorTest {
	
	@Test 
	public void calcularTest(){
		OperacaoMatematica operacao = new Soma();
		Assert.assertTrue(32 == operacao.calcula(30d, 2d));
		
		operacao = new Subtracao();
		Assert.assertTrue(28 == operacao.calcula(30d, 2d));
		
		operacao = new Multiplicacao();
		Assert.assertTrue(60 == operacao.calcula(30d, 2d));
		
		operacao = new Divisao();
		Assert.assertTrue(15 == operacao.calcula(30d, 2d));
	}

}
