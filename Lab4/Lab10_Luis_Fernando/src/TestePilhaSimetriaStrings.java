// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------

// classe para realização de testes de
// VERIFICAÇÃO DE SIMETRIA em 'Strings' com 'Pilha'
// -------------------------------------------------
public class TestePilhaSimetriaStrings {

    // método da classe para realização do teste
    // -----------------------------------------
    public void executaTeste() {

        // declaração de variáveis auxiliares para a manipulação da 'Pilha'
        boolean expressaoOK;
        boolean caracterSimetriaJaEncontrado;
        char    caracter, cPop;
        int     tipoErro;

        // declaração de constante para indicar nível de 'verbosidade'
        final boolean verboso = false;

        // dados para teste:
        // 'Strings' para as quais quer-se verificar a
        // simetria em relação ao caracter '0'
        // (admite-se que a string tem NO MÁXIMO UM caracter '0')
        String expressao1 = "9572418630368142759";  // simétrica em relação ao '0'
        String expressao2 = "9572418630123456789";  // '0' está no centro mas não é simétrica - erro tipo 1
        String expressao3 = "9572418633681427505";  // '0' não está no centro - erro tipo 2
        String expressao4 = "9572418633681427590";  // '0' não está no centro - erro tipo 2 (variante)
        String expressao5 = "0957241863368142759";  // '0' não está no centro - erro tipo 3
        String expressao6 = "957241863368142759";   // '0' não existe         - erro tipo 4

        // instanciação de um objeto 'Pilha'
        // para armazenar 'Character' (inicialmente vazio)
        // de acordo com a escolha do desenvolvedor:
        // 1. HERANÇA de ARRAYLIST
        // 2. COMPOSIÇÃO DE ARRAYLIST
        // -----------------------------------------------
        PilhaHeranca<Character> pilhaChar = new PilhaHeranca<>();
        System.out.println("\nPILHA por HERANÇA de ARRAYLIST");
        /*
        PilhaComposicao<Character> pilhaChar = new PilhaComposicao<>();
        System.out.println("\nPILHA por COMPOSICAO de ARRAYLIST");
        */
        System.out.println("---------------------------------");

        // instanciação de um vetor convencional de 'String'
        // para armazenar todas as expressões juntas
        String[] expressoes = { expressao1, expressao2, expressao3, expressao4, expressao5, expressao6 };

        // loop de expressoes a analisar
        for ( String expr : expressoes ) {
            // exibe a expressão sob análise
            System.out.println("\nExpressão a analisar: " + expr);

            // supõe que, "a priori", a expressão passará no teste de simetria
            expressaoOK = true;
            tipoErro = 0;

            // indica que ainda não encontrou o caracter de simetria
            caracterSimetriaJaEncontrado = false;
            
            // "limpa" a 'Pilha' para esta análise
            pilhaChar.clear();

            // para cada caracter da expressão analisada
            for (int i = 0; i < expr.length()  &&  expressaoOK; i++) {

                // separa o caracter
                caracter = expr.charAt(i);

                // se é o caracter de simetria ('0' neste caso)
                if ( caracter == '0' ) {
                    // indica que já encontrou o caracter de simetria
                    caracterSimetriaJaEncontrado = true;
                    if (verboso) {
                        System.out.printf("Operacão %2d - CARACTER DE SIMETRIA EMCONTRADO: %c\n", (i + 1), caracter);
                    }
                } // senão
                else {
                    // se ainda não encontrou o caracter de simetria
                    if ( ! caracterSimetriaJaEncontrado ) {
                        // empilha o caracter atual
                        if (verboso) {
                            System.out.printf("Operacão %2d - INSERÇÃO - Caracter %c\n", (i + 1), caracter);
                        }
                        pilhaChar.push(caracter);
                    }
                    // senão
                    else {
                        // se pilha não está vazia
                        if ( ! pilhaChar.isEmpty() ) {
                            // desempilha o caracter do topo
                            cPop = pilhaChar.pop();
                            if (verboso) {
                                System.out.printf("Operação %2d - REMOÇÃO  - Caracter %c\n", (i+1),cPop);
                            }
                            if ( cPop != caracter ) {
                                // indica que a expressão não passou no teste
                                expressaoOK = false;
                                // indica tipo do erro (1 neste caso)
                                tipoErro = 1;
                            }
                            // senão, deve continuar ... nada a fazer aqui
                        }
                        // senão (pilha está vazia mas a expressão ainda não acabou)
                        else {
                            // indica que a expressão não passou no teste
                            expressaoOK = false;
                            // indica tipo do erro (3 neste caso)
                            tipoErro = 3;
                            
                        }
                    }
                }

            }
            
            // após a expressão analisada...
            // se a expressão ainda for tida como simétrica
            if ( expressaoOK ) {
                // se o caracter de simetria não tiver sido encontrado
                if ( ! caracterSimetriaJaEncontrado ) {
                    // indica que a expressão não passou no teste
                    expressaoOK = false;
                    // indica tipo do erro (4 neste caso)
                    tipoErro = 4;
                }
                // senão
                else {
                    // se a pilha não está vazia
                    if ( ! pilhaChar.isEmpty() ) {
                        // indica que a expressão não passou no teste
                        expressaoOK = false;
                        // indica tipo do erro (2 neste caso)
                        tipoErro = 2;
                    }
                }
            }
            
            // exibe o resultado do teste
            if ( expressaoOK ) {
                System.out.printf(
                    "A expressão %s é simétrica em relação ao dígito '0' !!!\n",
                    expr);
            }
            else {
                System.out.printf(
                    "A expressão %s NÃO É simétrica em relação ao dígito '0' !!! - Erro tipo %d\n",
                    expr, 
                    tipoErro);
                
            }

        }

    }

}
