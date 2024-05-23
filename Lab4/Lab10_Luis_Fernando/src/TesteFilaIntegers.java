// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : FILAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------
 
// classe para realização de testes com
// 'Fila' contendo objetos 'Integer'
// ------------------------------------

// importação para permitir o uso de 'iterator'
import java.util.Iterator;

public class TesteFilaIntegers {

    // método da classe para realização do teste
    // -----------------------------------------
    public void executaTeste() {
        
        // declaração de variáveis auxiliares para a manipulação da 'Fila'
        int valor;
        int qtdElementos;
        
        // declaração de constante para indicar nível de 'verbosidade'
        final boolean verboso = true;
        
        // instanciação de um objeto da classe 'MetodosAvulsos'
        // para poder acessar o método 'geraNumeroRandomico'
        MetodosAvulsos avulso = new MetodosAvulsos();
        
        // PARTE 1 - FILA como HERANÇA de ARRAYLIST
        // -----------------------------------------
        System.out.println("\nPARTE 1 - FILA como HERANÇA de ARRAYLIST");
        System.out.println(  "----------------------------------------");
        
        // instanciação de um objeto da classe 'FilaHeranca'
        // para armazenar 'Integer' (inicialmente vazio)
        FilaHeranca<Integer> numerosH = new FilaHeranca<>();
        
        // obtenção da quantidade de 'Integer' desejada
        // - valor aleatório entre 11 e 20
        qtdElementos = avulso.geraNumeroRandomico( 11, 20 );
        System.out.printf("Qtd. elementos a armazenar na Fila: %2d\n",qtdElementos);
        
        // armazenamento e manipulação da 'Fila'
        // - valores aleatórios entre 10 e 99
        // - fazer 4 operações de inserção ('enqueue') e uma de remoção ('dequeue')
        for ( int i = 1; i <= qtdElementos; i++ ) {
            
            // verifica se deve inserir ou remover
            if ( (i % 5) != 0 ) {
                
                // INSERIR ('enqueue')
                // obtém o valor a ser armazenado (aleatório)
                valor = avulso.geraNumeroRandomico( 10, 99 );
                if ( verboso ) {
                    System.out.printf("Operação %2d - INSERÇÃO - Valor: %2d",i,valor);
                }
                // na 'Fila' a inserção ocorre sempre na última posição ...
                numerosH.enqueue( valor );
            }
            else {
                
                // REMOVER
                if ( verboso ) {
                    System.out.printf("Operação %2d - REMOÇÃO  - Valor: ",i);
                }
                // na 'Fila' a remoção refere-se sempre ao elemento da posição ZERO
                valor = numerosH.dequeue();
                if ( verboso ) {
                    System.out.printf("%2d",valor);
                }
            }
            if ( verboso ) {
                System.out.println(" - 'numerosH' -> " + numerosH);
            }
        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("Qtd. elementos restantes na Fila        : %2d\n", numerosH.size());
        System.out.printf("Posição do elemento recém-chegado à Fila: %2d\n", numerosH.getChegada());
        System.out.printf("Valor do elemento recém-chegado à Fila  : %2d\n", numerosH.peek());
        
        // exibição direta do conteúdo da 'Fila' (usa o método 'toString')
        System.out.println("Exibição direta                : " + numerosH);
        
        // exibição do conteúdo da 'Fila' por meio de 'for' convencional
        System.out.print("Exibição via 'for' convencional: [ ");
        for ( int i = 0; i < numerosH.size(); i++ ) {
            System.out.printf("%2d, ",numerosH.get(i));
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Fila' por meio de 'for' abreviado
        System.out.print("Exibição via 'for' abreviado   : [ ");
        for ( Integer n : numerosH ) {
            System.out.printf("%2d, ",n);
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Fila' por meio de 'iterator'
        System.out.print("Exibição via 'iterator'        : [ ");
        Iterator< Integer > iteradorH = numerosH.iterator();
        while ( iteradorH.hasNext() ) {
            System.out.printf("%2d, ",iteradorH.next());
        }
        System.out.println(" ]");
        
        // PARTE 2 - FILA COMPOSTA por ARRAYLIST
        // --------------------------------------
        System.out.println("\nPARTE 2 - FILA COMPOSTA por ARRAYLIST");
        System.out.println(  "-------------------------------------");
        
        // instanciação de um objeto da classe 'FilaComposicao'
        // para armazenar 'Integer' (inicialmente vazio)
        FilaComposicao<Integer> numerosC = new FilaComposicao<>();
        
        // obtenção da quantidade de 'Integer' desejada
        // - valor aleatório entre 11 e 20
        qtdElementos = avulso.geraNumeroRandomico( 11, 20 );
        System.out.printf("Qtd. elementos a armazenar na Fila: %2d\n",qtdElementos);
        
        // armazenamento e manipulação da 'Fila'
        // - valores aleatórios entre 10 e 99
        // - fazer 4 operações de inserção ('enqueue') e uma de remoção ('dequeue')
        for ( int i = 1; i <= qtdElementos; i++ ) {
            
            // verifica se deve inserir ou remover
            if ( (i % 5) != 0 ) {
                
                // INSERIR ('enqueue')
                // obtém o valor a ser armazenado (aleatório)
                valor = avulso.geraNumeroRandomico( 10, 99 );
                if ( verboso ) {
                    System.out.printf("Operação %2d - INSERÇÃO - Valor: %2d",i,valor);
                }
                // na 'Fila' a inserção ocorre sempre na última posição ...
                numerosC.enqueue( valor );
            }
            else {
                
                // REMOVER
                if ( verboso ) {
                    System.out.printf("Operação %2d - REMOÇÃO  - Valor: ",i);
                }
                // na 'Fila' a remoção refere-se sempre ao elemento que está na posição ZERO
                valor = numerosC.dequeue();
                if ( verboso ) {
                    System.out.printf("%2d",valor);
                }
            }
            if ( verboso ) {
                System.out.println(" - 'numerosC' -> " + numerosC);
            }
        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("Qtd. elementos restantes na Fila        : %2d\n", numerosC.getElementos().size());
        System.out.printf("Posição do elemento recém-chegado à Fila: %2d\n", numerosC.getChegada());
        System.out.printf("Valor do elemento recém-chegado à Fila  : %2d\n", numerosC.peek());
        
        // exibição direta do conteúdo da 'Fila' (usa o método 'toString')
        System.out.println("Exibição direta                : " + numerosC);
        
        // exibição do conteúdo da 'Fila' por meio de 'for' convencional
        System.out.print("Exibição via 'for' convencional: [ ");
        for ( int i = 0; i < numerosC.getElementos().size(); i++ ) {
            System.out.printf("%2d, ",numerosC.getElementos().get(i));
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Fila' por meio de 'for' abreviado
        System.out.print("Exibição via 'for' abreviado   : [ ");
        for ( Integer n : numerosC.getElementos() ) {
            System.out.printf("%2d, ",n);
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Fila' por meio de 'iterator'
        System.out.print("Exibição via 'iterator'        : [ ");
        Iterator< Integer > iteradorC = numerosC.getElementos().iterator();
        while ( iteradorC.hasNext() ) {
            System.out.printf("%2d, ",iteradorC.next());
        }
        System.out.println(" ]");
        
    }

}

