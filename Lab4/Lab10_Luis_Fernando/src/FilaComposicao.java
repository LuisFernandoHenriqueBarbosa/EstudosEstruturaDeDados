// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------

// Classe 'FilaComposicao' define uma 'Fila' a partir da
// classe 'ArrayList' (relacionamento de Composicao).
// Deste modo, a classe 'FilaComposicao' também é GENÉRICA!

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;

public class FilaComposicao< T > {
    
    // atributos de 'Fila'
    private ArrayList< T > elementos;  // conteúdos armazenados na 'Fila' 
    private int chegada; // posição ("índice") do elemento recém-chegado à 'Fila'

    // construtor (supõe sempre que a 'Fila' é criada VAZIA)
    public FilaComposicao() {
        elementos = new ArrayList< >();
        chegada = -1;
    }

    // configura o valor de 'chegada' (PRIVATE para evitar acesso externo!)                                    
    private void setChegada() {
        chegada = elementos.size() - 1;  // tamanho do 'ArrayList', mas começa do zero...
    }

    // retorna o valor de 'chegada' (a posição)
    public int getChegada() {
        return chegada;
    }
    
    // retorna referência para o 'ArrayList' onde estão armazenados os elementos
    public ArrayList<T> getElementos() {
        return elementos;
    }

    // insere elemento na 'Fila' (sempre na última posição)
    public void enqueue( T conteudo ) {
        // armazena o conteúdo fornecido
        elementos.add( conteudo );
        // atualiza o "índice" correspondente ao chegada
        setChegada();
    }

    // remove elemento da 'Fila' (sempre da posição ZERO)
    public T dequeue() {
        // salva o conteúdo a ser retornado
        T conteudo = elementos.remove(0);
        // atualiza o "índice" correspondente ao chegada
        setChegada();
        // retorna o conteúdo removido
        //return super.remove(chegada);
        return conteudo;
    }

    // retorna o valor do próximo elemento a ser removido (SEM REMOVÊ-LO)
    public T peek() {
        return elementos.get(0);
    }

    /* Os dois métodos a seguir são desnecessários porque
       é oferecido nesta classe o método 'getElementos' */
    /*
    // retorna a qtd. de elementos atualmente armazenados
    public int size() {
        return elementos.size();
    }

    // retorna o valor do elemento de uma posição específica
    public T get( int posicao ) {
        return elementos.get(posicao);
    }
    */

    // indica se a 'Fila' está vazia ('true' indica que está vazia)
    public boolean isEmpty() {
        boolean estahVazia = ( elementos.size() == 0 );
        return  estahVazia;
    }

    // limpa (esvazia) a 'Fila'
    public void clear() {
        elementos.clear();
        setChegada();
    }

    // exibe conteúdo completo da 'Fila' (modo DIRETO)
    // sobrescreve 'toString'
    public String toString() {
        
        // declaração e inicialização da 'String' a ser retornada
        String str;
        
        // monta a 'String' ecorrendo ao 'toString' do 'ArrayList'
        str = String.format("%s", elementos.toString());
        str = str.replace("[", "[ ");
        str = str.replace("]", " ]");
        
        // retorna a 'String'
        return str;
    }

}
