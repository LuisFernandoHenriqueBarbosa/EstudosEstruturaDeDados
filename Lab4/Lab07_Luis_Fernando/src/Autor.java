// --------------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: CARLOS MAGNUS CARLSON FILHO - FATEC S J Rio Preto
// Lab. : DIVERSOS
// Ano/S: 2024/1S
// --------------------------------------------------------

// código da classe
public class Autor {
    
	// Uso geral - exibição de dados do autor do trabalho
	// --------------------------------------------------
	public void exibeDadosAutor(String dadosDisciplina, String nomeLab, String nomeAutor, String RAAutor) {

		// atributo que ajuda a calcular o tamanho da linha separadora
		// parte fixa + max length(Strings fornecidas)
		int tamanhoLinha = 7 +
			Math.max(dadosDisciplina.length(),
						Math.max(nomeLab.length(),
							Math.max(nomeAutor.length(),RAAutor.length())
						)
					);
	
        // criação de um objeto 'MatodosAvulsos' para acesso a funções utilitárias diversas
        MetodosAvulsos utilitarios = new MetodosAvulsos();

		// identificação do autor do trabalho
		System.out.println();
		System.out.println(utilitarios.criaSeparadora("-",tamanhoLinha));
		System.out.println("Disc.: "+ dadosDisciplina);
		System.out.println("Lab. : " + nomeLab);
		System.out.println(utilitarios.criaSeparadora("-",tamanhoLinha));
		System.out.println("Nome : " + nomeAutor);
		System.out.println("R.A. : " + RAAutor);
		System.out.println(utilitarios.criaSeparadora("-",tamanhoLinha));
		System.out.println();
	
	}

}

