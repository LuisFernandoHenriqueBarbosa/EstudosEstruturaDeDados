// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------
 
// classe para realização de testes com
// 'Pilha' contendo objetos 'Integer'
// ------------------------------------

// importação para permitir o uso de 'iterator'
import java.util.Iterator;

public class TestePilhaIntegers {

    // método da classe para realização do teste
    // -----------------------------------------
    public void executaTeste() {
        
        // declaração de variáveis auxiliares para a manipulação da 'Pilha'
        int valor;
        int qtdElementos;
        
        // declaração de constante para indicar nível de 'verbosidade'
        final boolean verboso = true;
        
        // instanciação de um objeto da classe 'MetodosAvulsos'
        // para poder acessar o método 'geraNumeroRandomico'
        MetodosAvulsos avulso = new MetodosAvulsos();
        
        // PARTE 1 - PILHA como HERANÇA de ARRAYLIST
        // -----------------------------------------
        System.out.println("\nPARTE 1 - PILHA como HERANÇA de ARRAYLIST");
        System.out.println(  "-----------------------------------------");
        
        // instanciação de um objeto da classe 'PilhaHeranca'
        // para armazenar 'Integer' (inicialmente vazio)
        PilhaHeranca<Integer> numerosH = new PilhaHeranca<>();
        
        // obtenção da quantidade de 'Integer' desejada
        // - valor aleatório entre 11 e 20
        qtdElementos = avulso.geraNumeroRandomico( 11, 20 );
        System.out.printf("Qtd. elementos a armazenar na Pilha: %2d\n",qtdElementos);
        
        // armazenamento e manipulação da 'Pilha'
        // - valores aleatórios entre 10 e 99
        // - fazer 4 operações de inserção ('push') e uma de remoção ('pop')
        for ( int i = 1; i <= qtdElementos; i++ ) {
            
            // verifica se deve inserir ou remover
            if ( (i % 5) != 0 ) {
                
                // INSERIR ('push')
                // obtém o valor a ser armazenado (aleatório)
                valor = avulso.geraNumeroRandomico( 10, 99 );
                if ( verboso ) {
                    System.out.printf("Operação %2d - INSERÇÃO - Valor: %2d",i,valor);
                }
                // na 'Pilha' a inserção ocorre sempre no topo ...
                numerosH.push( valor );
            }
            else {
                
                // REMOVER
                if ( verboso ) {
                    System.out.printf("Operação %2d - REMOÇÃO  - Valor: ",i);
                }
                // na 'Pilha' a remoção refere-se sempre ao elemento que está no topo ...
                valor = numerosH.pop();
                if ( verboso ) {
                    System.out.printf("%2d",valor);
                }
            }
            if ( verboso ) {
                System.out.println(" - 'numerosH' -> " + numerosH);
            }
        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("Qtd. elementos restantes na Pilha   : %2d\n", numerosH.size());
        System.out.printf("Posição do elemento do topo da Pilha: %2d\n", numerosH.getTopo());
        System.out.printf("Valor do elemento do topo da Pilha  : %2d\n", numerosH.peek());
        
        // exibição direta do conteúdo da 'Pilha' (usa o método 'toString')
        System.out.println("Exibição direta                : " + numerosH);
        
        // exibição do conteúdo da 'Pilha' por meio de 'for' convencional
        System.out.print("Exibição via 'for' convencional: [ ");
        for ( int i = 0; i < numerosH.size(); i++ ) {
            System.out.printf("%2d, ",numerosH.get(i));
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Pilha' por meio de 'for' abreviado
        System.out.print("Exibição via 'for' abreviado   : [ ");
        for ( Integer n : numerosH ) {
            System.out.printf("%2d, ",n);
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Pilha' por meio de 'iterator'
        System.out.print("Exibição via 'iterator'        : [ ");
        Iterator< Integer > iteradorH = numerosH.iterator();
        while ( iteradorH.hasNext() ) {
            System.out.printf("%2d, ",iteradorH.next());
        }
        System.out.println(" ]");
        
        // PARTE 2 - PILHA COMPOSTA por ARRAYLIST
        // --------------------------------------
        System.out.println("\nPARTE 2 - PILHA COMPOSTA por ARRAYLIST");
        System.out.println(  "--------------------------------------");
        
        // instanciação de um objeto da classe 'PilhaComposicao'
        // para armazenar 'Integer' (inicialmente vazio)
        PilhaComposicao<Integer> numerosC = new PilhaComposicao<>();
        
        // obtenção da quantidade de 'Integer' desejada
        // - valor aleatório entre 11 e 20
        qtdElementos = avulso.geraNumeroRandomico( 11, 20 );
        System.out.printf("Qtd. elementos a armazenar na Pilha: %2d\n",qtdElementos);
        
        // armazenamento e manipulação da 'Pilha'
        // - valores aleatórios entre 10 e 99
        // - fazer 4 operações de inserção ('push') e uma de remoção ('pop')
        for ( int i = 1; i <= qtdElementos; i++ ) {
            
            // verifica se deve inserir ou remover
            if ( (i % 5) != 0 ) {
                
                // INSERIR ('push')
                // obtém o valor a ser armazenado (aleatório)
                valor = avulso.geraNumeroRandomico( 10, 99 );
                if ( verboso ) {
                    System.out.printf("Operação %2d - INSERÇÃO - Valor: %2d",i,valor);
                }
                // na 'Pilha' a inserção ocorre sempre no topo ...
                numerosC.push( valor );
            }
            else {
                
                // REMOVER
                if ( verboso ) {
                    System.out.printf("Operação %2d - REMOÇÃO  - Valor: ",i);
                }
                // na 'Pilha' a remoção refere-se sempre ao elemento que está no topo ...
                valor = numerosC.pop();
                if ( verboso ) {
                    System.out.printf("%2d",valor);
                }
            }
            if ( verboso ) {
                System.out.println(" - 'numerosC' -> " + numerosC);
            }
        }
        
        // exibição da quantidade de elementos efetivamente armazenados
        System.out.printf("Qtd. elementos restantes na Pilha   : %2d\n", numerosC.getElementos().size());
        System.out.printf("Posição do elemento do topo da Pilha: %2d\n", numerosC.getTopo());
        System.out.printf("Valor do elemento do topo da Pilha  : %2d\n", numerosC.peek());
        
        // exibição direta do conteúdo da 'Pilha' (usa o método 'toString')
        System.out.println("Exibição direta                : " + numerosC);
        
        // exibição do conteúdo da 'Pilha' por meio de 'for' convencional
        System.out.print("Exibição via 'for' convencional: [ ");
        for ( int i = 0; i < numerosC.getElementos().size(); i++ ) {
            System.out.printf("%2d, ",numerosC.getElementos().get(i));
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Pilha' por meio de 'for' abreviado
        System.out.print("Exibição via 'for' abreviado   : [ ");
        for ( Integer n : numerosC.getElementos() ) {
            System.out.printf("%2d, ",n);
        }
        System.out.println(" ]");
        
        // exibição do conteúdo da 'Pilha' por meio de 'iterator'
        System.out.print("Exibição via 'iterator'        : [ ");
        Iterator< Integer > iteradorC = numerosC.getElementos().iterator();
        while ( iteradorC.hasNext() ) {
            System.out.printf("%2d, ",iteradorC.next());
        }
        System.out.println(" ]");
        
    }

}

