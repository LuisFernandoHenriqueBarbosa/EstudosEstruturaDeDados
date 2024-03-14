
public class TestesArrays {

    // Ação 1
    // Criar um array unidimensional de String, em que cada elemento é uma palavra do seu nome.
    // Utilizar o comando for (convencional, que utiliza um contador) e a propriedade length
    // para exibir o seu nome completo.
    private void exibeNomeCompleto() {

        // declaração do array de Strings
        String[] nomes = { "Luis", "Fernando", "Henrique", "Barbosa" };

        // percurso do array para exibição do nome (for convencional)
        System.out.print("\nMeu nome completo é");
        // AQUI ...
        for (int i = 0; i < nomes.length; i++){
            System.out.print(" " + nomes[i] );
        }
        System.out.println(".");

    }
    
    // Ação 2
    // Criar um array unidimensional (vetor), inicialmente vazio, que pode armazenar
    // 10 números inteiros. Preencher os elementos desse vetor com números randômicos entre 10 e 50.
    // Utilizar o comando for (na versão simplificada, que não exige um contador para iterar)
    // para exibir o conteúdo do vetor.
    private void exibeArrayInt() {

        // declaração do array de int
        // AQUI ...
        int[] numeros = new int[10]; 
        
        // criação de uma instância (objeto) da classe 'MetodosAvulsos' para permitir o acesso
        // aos respectivos métodos
        // AQUI ...
        MetodosAvulsos avulso = new MetodosAvulsos();
        
        // preenchimento dos valores dos elementos do array com números randômicos (for convencional)
        // AQUI ...
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = avulso.geraNumeroRandomico(10, 50);
        }
        
        // percurso do array para exibição dos números (for abreviado)
        System.out.print("\nOs números gerados foram:");
        // AQUI ...
        for (int num : numeros){
            System.out.print( " " + num);
        }
        System.out.println();

    }

    // Ação 3
    // Criar um array bidimensional (matriz) de 3 linhas e 4 colunas,
    // já preenchido com valores arbitrários. Utilizar o comando for
    // (convencional, que utiliza um contador) e a propriedade length
    // para exibir o conteúdo da matriz.
    private void exibeArrayBidimensional() {

        // declaração do array bidimensional 3x4 de int
        int matriz[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };

        // percurso do array bidimensional para exibição dos números
        System.out.println("\nOs números armazenados na matriz são:");
        // AQUI ...
        System.out.println();

    }

    // Ação 4
    // Criar um array bidimensional (matriz) de 3 linhas e 2 colunas,
    // inicialmente vazio, para armazenar objetos 'String'.
    // Cada linha corresponde a um aluno.
    // A primeira coluna armazena o RA e a segunda armazena o nome.
    // Preencha a matriz com valores arbitrários.
    // Utilizar o comando 'for' (convencional, que utiliza um contador)
    // e a propriedade 'length' para exibir o conteúdo da matriz.
    private void exibeArrayBidimensionalStrings() {

        // declaração do array bidimensional 3x2 de 'String', inicialmente vazio
        String[][] alunos = new String[3][2];

        // preenchimento com valores arbitrários
        // AQUI...

        // percurso do array bidimensional para exibição dos dados dos alunos
        System.out.println("\nOs dados dos alunos armazenados na matriz são:");
        // AQUI ...
        System.out.println();

    }

    // Acionador do métodos acima (este método é chamado pelo 'CoordenadorExeucao')
    public void realizaTestes() {

        // Ação 1 - monta array de String e exibe o nome completo
        exibeNomeCompleto();

        // Ação 2 - exibe array de números inteiros gerados randomicamente
        exibeArrayInt();

        // Ação 3 - exibe array bidimensional
        exibeArrayBidimensional();
        
        // Ação 4 - exibe array bidimensional de 'String'
        exibeArrayBidimensionalStrings();
    }
    
}
