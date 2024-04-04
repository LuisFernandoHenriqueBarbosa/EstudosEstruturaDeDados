// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : MÉTODOS GENÉRICOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que implementa os métodos genéricos
public class MetodosGenericos {

    // método genérico printArray
    public <E> void printArray(E[] inputArray) {
        // exibe elementos do array
        for (E element : inputArray) {
            System.out.printf("%5s ", element);
        }
        System.out.println();
    } // fim do método printArray

    // método genérico buscaArray
    // AQUI ...
    public <E> int buscaArray( E[] inputArray, E key) {

        // busca sobre o vetor
        for (int i = 0; i < inputArray.length; i++) {
            // se encontrou, já pode acabar - retorna a posição i
            if (inputArray[i].equals(key)) {
                return i;
            }
        }

        // se terminou a busca sem encontrar, retorna -1
        return -1;

    } // fim do método buscaArrayString

}
