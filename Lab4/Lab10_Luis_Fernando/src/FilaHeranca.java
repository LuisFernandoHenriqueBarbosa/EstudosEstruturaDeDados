// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------

// Classe 'FilaHeranca' define uma 'Fila' a partir da
// classe 'ArrayList' (relacionamento de Heranca).
// Deste modo, a classe 'FilaHeranca' também é GENÉRICA!

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;

public class FilaHeranca< T > extends ArrayList< T > {
    
    // atributos específicos de 'Fila'
    private int chegada; // posição ("índice") do elemento recém-chegado à 'Fila'

    // construtor (supõe sempre que a 'Fila' é criada VAZIA)
    public FilaHeranca() {
        //super();
        chegada = -1;
    }

    // configura o valor de 'chegada' (PRIVATE para evitar acesso externo!)                                    
    private void setChegada() {
        //chegada = super.size() - 1;  // tamanho do 'ArrayList', mas começa do zero...
        chegada = this.size() - 1;  // tamanho do 'ArrayList', mas começa do zero...
    }

    // retorna o valor de 'chegada' (a posição)
    public int getChegada() {
        return chegada;
    }

    // insere elemento na 'Fila' (sempre após a posição 'chegada')
    public void enqueue( T conteudo ) {
        // armazena o conteúdo fornecido
        this.add( conteudo );
        // atualiza o "índice" correspondente ao chegada
        setChegada();
    }

    // remove elemento da 'Fila' (sempre da posição ZERO)
    public T dequeue() {
        // salva o conteúdo a ser retornado
        T conteudo = this.remove(0);
        // atualiza o "índice" correspondente ao chegada
        setChegada();
        // retorna o conteúdo removido
        //return super.remove(chegada);
        return conteudo;
    }

    // retorna o valor do próximo elemento a ser atendido (SEM REMOVÊ-LO)
    public T peek() {
        return this.get(0);
    }
    
    // indica se a 'Fila' está vazia ('true' indica que está vazia)
    public boolean isEmpty() {
        boolean estahVazia = ( this.size() == 0 );
        return  estahVazia;
        // poderia ser apenas: return (this.size() == 0);
    }

    // limpa (esvazia) a 'Fila'
    public void clear() {
        super.clear();
        setChegada();
    }

    // exibe conteúdo completo da 'Fila' (modo DIRETO)
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
