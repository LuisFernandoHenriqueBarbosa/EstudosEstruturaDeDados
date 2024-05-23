// ---------------------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PILHAS E FILAS BASEADAS EM ARRAYLIST em JAVA
// Ano/S: 2024/1S
// ---------------------------------------------------

// Classe 'Livro'
public class Livro {

    private String titulo;
    private String sobrenomeAutor;
    private String isbn;
    private int    qtdPaginas;

    // construtor com quatro argumentos
    public Livro(
            String argTitulo,
            String argAutor,
            String argIsbn,
            int    argPaginas) {

        titulo         = argTitulo;
        sobrenomeAutor = argAutor;
        isbn           = argIsbn;
        qtdPaginas     = argPaginas;

    } // fim do construtor

    // 'getters' e 'setters'
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String argTitulo) {
        this.titulo = argTitulo;
    }

    public String getSobrenomeAutor() {
        return sobrenomeAutor;
    }

    public void setSobrenomeAutor(String argAutor) {
        this.sobrenomeAutor = argAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String argIsbn) {
        this.isbn = argIsbn;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int argPaginas) {
        this.qtdPaginas = ( argPaginas > 0 ) ? argPaginas : 0; // validação mínima
    }

    // retorna a representação de String de um objeto 'Livro'
    // sobrescreve 'toString'
    public String toString() {
        return String.format("\nLivro: %s\nAutor: %s\nISBN : %s\nPágs.: %3d",
                getTitulo(), getSobrenomeAutor(), getIsbn(), getQtdPaginas());
    } // fim do método toString

} // fim da classe 'Livro'
