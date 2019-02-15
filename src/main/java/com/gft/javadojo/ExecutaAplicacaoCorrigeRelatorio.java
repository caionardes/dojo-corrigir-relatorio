package com.gft.javadojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gft.javadojo.corrigerelatorio.CorrigeRelatorioService;
import com.gft.javadojo.corrigerelatorio.dados.FonteDeDados;
import com.gft.javadojo.corrigerelatorio.modelo.LinhaRelatorio;

/**
 * Recuperação do relatório:
 * 	
 * Precisamos recuperar os dados de um relatório.
 * Os dados sofreram algumas falhas na formatação que precisam ser corrigidas.
 * 
 * A infomação que temos é que os dados estão formatos no seguinte padrão:
 * ID;NOME;SOBRENOME;DATA
 * 
 * - O relatório corrigido deve ser composto por 3 colunas: [Id], [Nome e Sobrenome], [Data]
 * 
 * - Houve um erro que substituiu os espaços pelo número 1, favor corrigir.
 * 
 * - Na fonte de dados a informação de nome e sobrenome estão separadas, mais não deveriam.
 * 
 * - Os nomes começam com letra maiuscula, demais letras minusculas.
 * 
 * - Linhas inválidas devem ser listadas separadamente ao final do relatório.
 *   Considera-se linha inválida aquelas que não possuírem todas as colunas, ou possuam o tipo de dado invalido,
 *   neste caso o Id deve ser numérico e a Data deve respeitar o padrão AAAA-MM-DD
 *   
 * - No caso de haver linha totalmente igual, apenas a primeira das linhas deve aparecer no relatório.
 * 
 * - Deve ser possível escolher a ordem de listagem dos dados por [Id] ou por [Nome].
 */
@SpringBootApplication
public class ExecutaAplicacaoCorrigeRelatorio {

	public static void main(String[] args) {
		SpringApplication.run(ExecutaAplicacaoCorrigeRelatorio.class, args).close();
	}

	@Autowired
	private CorrigeRelatorioService corrigeRelatorioService;

	@Bean
	public CommandLineRunner run() {
		return args -> {
			List<String> linhasComFalha = FonteDeDados.getLinhasComFalha();
			List<LinhaRelatorio> linhasCorrigidas = corrigeRelatorioService.corrigirLinhas(linhasComFalha);
			
			System.out.println("Linhas corrigidas:");
			linhasCorrigidas.forEach(System.out::println);
		};
	}
}

