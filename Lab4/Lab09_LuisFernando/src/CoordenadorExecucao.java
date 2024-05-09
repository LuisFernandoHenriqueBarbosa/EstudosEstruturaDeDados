// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2024/1S
// ------------------------------------
 
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
        final int ARRAYLIST_INTEGERS = 1;
        final int ARRAYLIST_STRINGS  = 2;
        final int ARRAYLIST_EMPREGADOS_COMISSIONADOMAISFIXO = 3;
        final int ARRAYLIST_EMPREGADOS_POLIMORFICO = 4;
        final int SAIR = 9;

        // declaração de variáveis a serem usadas (independentemente da Atividade)
        int escolha;

        // menu de escolha da Atividade a ser executada
        do {
            // apresentação das opções de escolha
            System.out.println("\n");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Atividade 1: Criação e uso de ARRAYLIST contendo elementos 'Integer'");
            System.out.println("2 - Atividade 2: Criação e uso de ARRAYLIST contendo elementos 'String'");
            System.out.println("3 - Atividade 3: Criação e uso de ARRAYLIST contendo elementos 'EmpregadoComissionadoMaisFixo'");
            System.out.println("4 - Atividade 4: Criação e uso de ARRAYLIST contendo elementos 'Empregado' (Processamento POLIMÓRFICO)");
            System.out.println("9 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");
            // coleta da opção digitada
            escolha = teclado.nextInt();
            teclado.nextLine();

            // avaliação da opção e acionamento da respectiva Atividade
            switch (escolha) {

                case ARRAYLIST_INTEGERS:
                    System.out.println("\nAtividade 1: Criação e uso de ARRAYLIST contendo elementos 'Integer'");
                    System.out.println("----------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TesteArrayListIntegers'
                    TesteArrayListIntegers teste1 = new TesteArrayListIntegers();
                    
                    // acionamento do método de 'entrada' da classe 'TesteArrayListIntegers'
                    teste1.executaTeste();

                    break;

                case ARRAYLIST_STRINGS:
                    System.out.println("\nAtividade 2: Criação e uso de ARRAYLIST contendo elementos 'String'");
                    System.out.println("---------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TesteArrayListStrings'
                    TesteArrayListStrings teste2 = new TesteArrayListStrings();
                    
                    // acionamento do método de 'entrada' da classe 'TesteArrayListStrings'
                    teste2.executaTeste();

                    break;

                case ARRAYLIST_EMPREGADOS_COMISSIONADOMAISFIXO:
                    System.out.println("\nAtividade 3: Criação e uso de ARRAYLIST contendo elementos 'EmpregadoComissionadoMaisFixo'");
                    System.out.println("--------------------------------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TesteArrayListEmpregadoComissionadoMaisFixo'
                    TesteArrayListEmpregadoComissionadoMaisFixo teste3 =
                            new TesteArrayListEmpregadoComissionadoMaisFixo();
                    
                    // acionamento do método de 'entrada' da classe 'TesteArrayListEmpregadoComissionadoMaisFixo'
                    teste3.executaTeste();

                    break;

                case ARRAYLIST_EMPREGADOS_POLIMORFICO:
                    System.out.println("\nAtividade 4: Criação e uso de ARRAYLIST contendo elementos 'Empregado' (Processamento POLIMÓRFICO)");
                    System.out.println("----------------------------------------------------------------------------------------------------");

                    // instanciação de um objeto da classe 'TesteArrayListEmpregadoPolimorfico'
                    TesteArrayListEmpregadoPolimorfico teste4 =
                            new TesteArrayListEmpregadoPolimorfico();
                    
                    // acionamento do método de 'entrada' da classe 'TesteArrayListEmpregadoPolimorfico'
                    teste4.executaTeste();

                    break;

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
                "ARRANJOS DINÂMICOS em JAVA",
                "CARLOS MAGNUS CARLSON FILHO",
                "121 092 AAS P NNN");

    } // fim do método 'executaTudo'

} // fim da classe
