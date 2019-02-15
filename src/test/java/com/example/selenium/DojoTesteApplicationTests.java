package com.example.selenium;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.gft.javadojo.corrigerelatorio.CorrigeRelatorioService;
import com.gft.javadojo.corrigerelatorio.dados.FonteDeDados;
import com.gft.javadojo.corrigerelatorio.modelo.LinhaRelatorio;

@RunWith(SpringRunner.class)
public class DojoTesteApplicationTests {

	@InjectMocks
	private CorrigeRelatorioService corrigeRelatorioService;

	@Test
	public void test_corrigirLinhas_EXEMPLO() {
		List<String> linhasComFalha = FonteDeDados.getLinhasComFalha();

		List<LinhaRelatorio> linhasCorrigidas = corrigeRelatorioService.corrigirLinhas(linhasComFalha);
		
		System.out.println("Linhas corrigidas:");
		linhasCorrigidas.forEach(System.out::println);

		assertTrue(linhasCorrigidas.isEmpty());
	}
}

