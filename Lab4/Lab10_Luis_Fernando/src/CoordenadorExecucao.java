// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------
 
// classe principal (faz o papel efetivo de 'main',
// sendo instanciada pelo programa principal do projeto)
// -----------------------------------------------------

// importação para permitir entrada de dados via teclado
import java.util.Scanner;

// classe coordenadora da execução dos testes
public class CoordenadorExecucao {

    // método que realiza todos os testes
    public void executaTudo() {

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in);

        // declaração de constantes para uso no menu
        final int PILHA_INTEGERS = 1;
        final int PILHA_SIMETRIA_STRINGS  = 2;
        final int PILHA_VALIDACAO_SINTATICA = 3;
        final int FILA_INTEGERS = 4;
        final int FILA_LIVROS = 5;
        final int SAIR = 9;

        // declaração de variáveis a serem usadas (independentemente da Atividade)
        int escolha;

        // menu de escolha da Atividade a ser executada
        do {
            // apresentação das opções de escolha
            System.out.println("\n----------------------------------------------------\n");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Atividade 1: Criação e uso de uma PILHA contendo elementos INTEGER");
            System.out.println("2 - Atividade 2: Criação e uso de uma PILHA para verificar SIMETRIA de STRINGs");
            System.out.println("3 - Atividade 3: Criação e uso de uma PILHA para validação sintática de expressão");
            System.out.println("4 - Atividade 4: Criação e uso de uma FILA  contendo elementos INTEGER");
            System.out.println("5 - Atividade 5: Criação e uso de uma FILA  contendo objetos LIVRO");
            System.out.println("9 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");
            // coleta da opção digitada
            escolha = teclado.nextInt();
            teclado.nextLine();

            // avaliação da opção e acionamento da respectiva Atividade
            switch (escolha) {

                case PILHA_INTEGERS:
                    System.out.println("\nAtividade 1: Criação e uso de uma PILHA contendo elementos INTEGER");
                    System.out.println("--------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TestePilhaIntegers'
                    TestePilhaIntegers teste1 = new TestePilhaIntegers();
                    
                    // acionamento do método de 'entrada' da classe 'TestePilhaIntegers'
                    teste1.executaTeste();

                    break;

                case PILHA_SIMETRIA_STRINGS:
                    System.out.println("\nAtividade 2: Criação e uso de uma PILHA para verificar SIMETRIA de STRINGs");
                    System.out.println("----------------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TestePilhaSimetriaStrings'
                    TestePilhaSimetriaStrings teste2 = new TestePilhaSimetriaStrings();
                    
                    // acionamento do método de 'entrada' da classe 'TestePilhaSimetriaStrings'
                    teste2.executaTeste();

                    break;

                case PILHA_VALIDACAO_SINTATICA:
                    System.out.println("\nAtividade 3: Criação e uso de uma PILHA para validação sintática de expressão");
                    System.out.println("-------------------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'estePilhaValidacaoSintatica'
                    TestePilhaValidacaoSintatica teste3 = new TestePilhaValidacaoSintatica();
                    
                    // acionamento do método de 'entrada' da classe 'estePilhaValidacaoSintatica'
                    teste3.executaTeste();

                    break;

                /*case FILA_INTEGERS:
                    System.out.println("\nAtividade 4: Criação e uso de uma FILA  contendo elementos INTEGER");
                    System.out.println("--------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TesteFilaIntegers'
                    TesteFilaIntegers teste4 = new TesteFilaIntegers();
                    
                    // acionamento do método de 'entrada' da classe 'TesteFilaIntegers'
                    teste4.executaTeste();

                    break;

                case FILA_LIVROS:
                    System.out.println("\nAtividade 5: Criação e uso de uma FILA  contendo objetos LIVRO");
                    System.out.println("----------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TesteFilaLivros'
                    TesteFilaLivros teste5 = new TesteFilaLivros();
                    
                    // acionamento do método de 'entrada' da classe 'TesteFilaLivros'
                    teste5.executaTeste();

                    break;*/

                case SAIR:
                    System.out.println("\nSair ...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida !  Tente novamente ...\n");
            }

        } while (escolha != SAIR);

        teclado.close();

        // aciona método para exibição dos dados do autor do trabalho
        Autor autor = new Autor();
        autor.exibeDadosAutor(
                "ESTRUTURAS DE DADOS - 2024/1S",
                "PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA",
                "LUIS FERNANDO HENRIQUE BARBOSA",
                "121 092 231 1 034");

    } // fim do método 'executaTudo'

} // fim da classe 'CoordenadorExecucao'
