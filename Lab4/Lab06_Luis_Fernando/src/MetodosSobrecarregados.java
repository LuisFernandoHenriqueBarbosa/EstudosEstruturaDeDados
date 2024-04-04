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

    // método buscaArray para buscar um conteúdo ('key') num array de 'int'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...

    // método buscaArray para buscar um conteúdo ('key') num array de 'double'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...

    // método buscaArray para buscar um conteúdo ('key') num array de 'String'
    // retorna a posição em que o conteúdo foi encontrado no array ou -1 se não encontrou
    // AQUI ...

}
