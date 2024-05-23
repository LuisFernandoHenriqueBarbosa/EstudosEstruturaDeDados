// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : FILAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------
 
// classe para realização de testes com
// 'Fila' contendo objetos 'Livro'
// ------------------------------------

// importação para permitir o uso de 'iterator'
import java.util.Iterator;

public class TesteFilaLivros {

    // método da classe para realização do teste
    // -----------------------------------------
    public void executaTeste() {
        
        // declaração de constante para indicar nível de 'verbosidade'
        final boolean verboso = false;
        
        // PARTE 1 - FILA como HERANÇA de ARRAYLIST
        // -----------------------------------------
        System.out.println("\nPARTE 1 - FILA como HERANÇA de ARRAYLIST");
        System.out.println(  "----------------------------------------");
        
        // instanciação de um objeto da classe 'FilaHeranca'
        // para armazenar 'Livro' (inicialmente vazio)
        FilaHeranca<Livro> livrosH = new FilaHeranca<>();
        
        // instanciação de 5 objetos 'Livro'
        // que serão armazenados num 'array' convencional
        Livro[] livros = new Livro[2];
        
        livros[0] = new Livro( 
            "Estruturas de Dados com Java", 
            "Carlson", 
            "11111", 
            300 );
        
        // criar mais 4 livros
        // ...
        livros[1] = new Livro( 
            "Bancos de Dados super-avançados", 
            "Alguém", 
            "22222", 
            100 );
        
                        
        // armazenamento de 5 objetos 'Livro' na 'FilaHeranca'
        for ( Livro liv : livros ) {
            
            // INSERIR ('enqueue')
            livrosH.enqueue(liv);

            if ( verboso ) {
                System.out.println(" - 'livrosH' -> " + livrosH);
            }

        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("Após incluir todos os livros na fila (versão HERANÇA)...\n");
        System.out.printf("Qtd. livros na Fila                  : %2d\n", livrosH.size());
        System.out.printf("Posição do livro recém-chegado à Fila: %2d\n", livrosH.getChegada());
        System.out.printf("\nPróximo livro a sair da Fila         :%s\n",  livrosH.peek());
        
        // exibição direta do conteúdo da 'Fila' (usa o método 'toString')
        System.out.println("\nExibição direta ('toString')   : " + livrosH);
        
        // exibição do conteúdo da 'Fila' por meio de 'for' convencional
        System.out.print("\nExibição via 'for' convencional: [");
        for ( int i = 0; i < livrosH.size(); i++ ) {
            System.out.printf("%s,",livrosH.get(i));
        }
        System.out.println("]");
        
        // exibição do conteúdo da 'Fila' por meio de 'for' abreviado
        System.out.print("\nExibição via 'for' abreviado   : [");
        for ( Livro n : livrosH ) {
            System.out.printf("%s,",n);
        }
        System.out.println("]");
        
        // exibição do conteúdo da 'Fila' por meio de 'iterator'
        System.out.print("\nExibição via 'iterator'        : [");
        Iterator< Livro > iteradorH = livrosH.iterator();
        while ( iteradorH.hasNext() ) {
            System.out.printf("%s,",iteradorH.next());
        }
        System.out.println("]");
        
        // PARTE 2 - FILA COMPOSTA por ARRAYLIST
        // --------------------------------------
        System.out.println("\nPARTE 2 - FILA COMPOSTA por ARRAYLIST");
        System.out.println(  "-------------------------------------");
        
        // instanciação de um objeto da classe 'FilaComposicao'
        // para armazenar 'Livro' (inicialmente vazio)
        FilaComposicao<Livro> livrosC = new FilaComposicao<>();
        
        // armazenamento de 5 objetos 'Livro' na 'FilaComposicao'
        for ( Livro liv : livros ) { 

            // INSERIR ('enqueue')
            livrosC.enqueue(liv);

            if ( verboso ) {
                System.out.println(" - 'livrosC' -> " + livrosC);
            }
        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("Após incluir todos os livros na fila... (versão COMPOSIÇÃO)\n");
        System.out.printf("Qtd. livros na Fila                  : %2d\n", livrosC.getElementos().size());
        System.out.printf("Posição do livro recém-chegado à Fila: %2d\n", livrosC.getChegada());
        System.out.printf("\nPróximo livro a sair da Fila         : %s\n", livrosC.peek());
        
        // exibição direta do conteúdo da 'Fila' (usa o método 'toString')
        System.out.println("\nExibição direta                : " + livrosC);
        
        // exibição do conteúdo da 'Fila' por meio de 'for' convencional
        System.out.print("\nExibição via 'for' convencional: [");
        for ( int i = 0; i < livrosC.getElementos().size(); i++ ) {
            System.out.printf("%s,",livrosC.getElementos().get(i));
        }
        System.out.println("]");
        
        // exibição do conteúdo da 'Fila' por meio de 'for' abreviado
        System.out.print("\nExibição via 'for' abreviado   : [");
        for ( Livro n : livrosC.getElementos() ) {
            System.out.printf("%s,",n);
        }
        System.out.println("]");
        
        // exibição do conteúdo da 'Fila' por meio de 'iterator'
        System.out.print("\nExibição via 'iterator'        : [");
        Iterator< Livro > iteradorC = livrosC.getElementos().iterator();
        while ( iteradorC.hasNext() ) {
            System.out.printf("%s,",iteradorC.next());
        }
        System.out.println("]");
        
    }

}

