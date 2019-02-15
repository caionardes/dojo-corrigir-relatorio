package com.gft.javadojo.corrigerelatorio;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gft.javadojo.corrigerelatorio.modelo.LinhaRelatorio;

@Service
public class CorrigeRelatorioService {
	
	/**
	 * @param linhasComFalha a lista de linhas com falhas.
	 * @return linhas corrigidas.
	 */
	public List<LinhaRelatorio> corrigirLinhas(List<String> linhasComFalha) {
		
		return Collections.emptyList();
	}
}
