// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------

// Classe 'PilhaHeranca' define uma 'Pilha' a partir da
// classe 'ArrayList' (relacionamento de Heranca).
// Deste modo, a classe 'PilhaHeranca' também é GENÉRICA!

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;

public class PilhaHeranca< T > extends ArrayList< T > {
    
    // atributos específicos de 'Pilha'
    private int topo; // posição ("índice") do elemento do topo da 'Pilha'

    // construtor (supõe sempre que a 'Pilha' é criada VAZIA)
    public PilhaHeranca() {
        //super();  DESNECESSÁRIO, pois a ordem de execução do construtor é sempre base->derivada
        topo = -1;
    }

    // configura o valor de 'topo' (PRIVATE para evitar acesso externo!)                                    
    private void setTopo() {
        topo = this.size() - 1;  // tamanho do 'ArrayList', mas começa do zero...
    }

    // retorna o valor de 'topo' (a posição)
    public int getTopo() {
        return topo;
    }

    // insere elemento na 'Pilha' (sempre no topo)
    public void push( T conteudo ) {
        // armazena o conteúdo fornecido
        this.add( conteudo );
        // atualiza o "índice" correspondente ao topo
        setTopo();
    }

    // remove elemento da 'Pilha' (sempre do topo)
    public T pop() {
        // salva o conteúdo a ser retornado
        T conteudo = this.remove(topo);
        // atualiza o "índice" correspondente ao topo
        setTopo();
        // retorna o conteúdo removido
        return conteudo;
    }

    // retorna o valor do elemento que está no 'topo' (SEM REMOVÊ-LO)
    public T peek() {
        return this.get(topo);
    }
    
    // indica se a 'Pilha' está vazia ('true' indica que está vazia)
    public boolean isEmpty() {
        boolean estahVazia = this.size() == 0;
        return  estahVazia;
    }

    // limpa (esvazia) a 'Pilha'
    public void clear() {
        super.clear();
        setTopo();
    }

    // exibe conteúdo completo da 'Pilha' (modo DIRETO)
    // sobrescreve 'toString'
    public String toString() {
        
        // declaração e inicialização da 'String' a ser retornada
        String str;
        
        // monta a 'String' ecorrendo ao 'toString' do 'ArrayList'
        str = String.format("%s", super.toString());
        str = str.replace("[", "[ ");
        str = str.replace("]", " ]");
        
        // retorna a 'String'
        return str;
    }

}
