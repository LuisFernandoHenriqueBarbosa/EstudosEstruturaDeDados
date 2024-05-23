// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------

// Classe 'PilhaComposicao' define uma 'Pilha' a partir da
// classe 'ArrayList' (relacionamento de Composicao).
// Deste modo, a classe 'PilhaComposicao' também é GENÉRICA!

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;

public class PilhaComposicao< T > {
    
    // atributos de 'Pilha'
    private ArrayList< T > elementos;  // conteúdos armazenados na 'Pilha' 
    private int topo; // posição ("índice") do elemento do topo da 'Pilha'

    // construtor (supõe sempre que a 'Pilha' é criada VAZIA)
    public PilhaComposicao() {
        elementos = new ArrayList< >();
        topo = -1;
    }

    // configura o valor de 'topo' (PRIVATE para evitar acesso externo!)                                    
    private void setTopo() {
        topo = elementos.size() - 1;  // tamanho do 'ArrayList', mas começa do zero...
    }

    // retorna o valor de 'topo' (a posição)
    public int getTopo() {
        return topo;
    }
    
    // retorna referência para o 'ArrayList' onde estão armazenados os elementos
    public ArrayList<T> getElementos() {
        return elementos;
    }

    // insere elemento na 'Pilha' (sempre no topo)
    public void push( T conteudo ) {
        // armazena o conteúdo fornecido
        elementos.add( conteudo );
        // atualiza o "índice" correspondente ao topo
        setTopo();
    }

    // remove elemento da 'Pilha' (sempre do topo)
    public T pop() {
        // salva o conteúdo a ser retornado
        T conteudo = elementos.remove(topo);
        // atualiza o "índice" correspondente ao topo
        setTopo();
        // retorna o conteúdo removido
        return conteudo;
    }

    // retorna o valor do elemento que está no 'topo' (SEM REMOVÊ-LO)
    public T peek() {
        return elementos.get(topo);
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

    // indica se a 'Pilha' está vazia ('true' indica que está vazia)
    public boolean isEmpty() {
        boolean estahVazia = elementos.size() == 0;
        return  estahVazia;
    }

    // limpa (esvazia) a 'Pilha'
    public void clear() {
        elementos.clear();
        setTopo();
    }

    // exibe conteúdo completo da 'Pilha' (modo DIRETO)
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
