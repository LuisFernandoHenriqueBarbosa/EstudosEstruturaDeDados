// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : MÉTODOS GENÉRICOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que implementa os MÉTODOS SOBRECARREGADOS
public class MetodosSobrecarregados {

    // método printArray para imprimir um array de 'int'
    public void printArray(int[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%5s ", element);       // exibe elementos do array
        }
        System.out.println();
    } // fim do método printArray – versão 'int'

    // método printArray para imprimir um array de 'double'
    public void printArray(double[] inputArray) {
        for (double element : inputArray) {
            System.out.printf("%5s ", element);       // exibe elementos do array
        }
        System.out.println();
    } // fim do método printArray – versão 'double'

    // método printArray para imprimir um array de 'String'
    // AQUI ...
    public void printArray(String[] inputArray) {
        for (String element : inputArray) {
            System.out.printf("%5s ", element);       // exibe elementos do array
        }
        System.out.println();
    } // fim do método printArray – versão 'string'

    // método buscaArray para buscar um conteúdo ('key') num array de 'int'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...
    public int buscaArray(int[] inputArray, int key) {

        // busca sobre o vetor
        for( int i = 0; i < inputArray.length; i++ ) {
            // se encontrou, já pode acabar - retorna a posição i
            if ( inputArray[i] == key ) {
                return i;
            }
        }

        // se terminou a busca sem encontrar, retorna -1
        return -1;

    }  // fim do método buscaArray - versão 'int'

    // método buscaArray para buscar um conteúdo ('key') num array de 'double'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...
    public int buscaArray(double[] inputArray, double key) {

        // tolerância: se a diferença estiver abaixo, os números são considerados iguais
        final double TOLERANCIA = 0.00001;

        // busca sobre o vetor
        for( int i = 0; i < inputArray.length; i++ ) {
            // se encontrou, já pode acabar - retorna a posição i
            if ( Math.abs(inputArray[i] - key) < TOLERANCIA) {
                return i;
            }
        }

        // se terminou a busca sem encontrar, retorna -1
        return -1;

    }  // fim do método buscaArray - versão 'double'

    // método buscaArray para buscar um conteúdo ('key') num array de 'String'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...
    public int buscaArray(String[] inputArray, String key) {

        // busca sobre o vetor
        for( int i = 0; i < inputArray.length; i++ ) {
            // se encontrou, já pode acabar - retorna a posição i
            if ( inputArray[i].equals(key)) {
                return i;
            }
        }

        // se terminou a busca sem encontrar, retorna -1
        return -1;

    }  // fim do método buscaArray - versão 'String'

}
