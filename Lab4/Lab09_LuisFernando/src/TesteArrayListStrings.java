// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2024/1S
// ----------------------------------------

// classe para realização de testes com
// 'ArrayList' contendo objetos 'String'
// -------------------------------------

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;


public class TesteArrayListStrings {

    // atributos: vetor de nomes para uso no 'ArrayList'
    String[] bancoNomes = {"Luis", "Gustavo", "Matheus", "Gabriel"}; // mp mínimo 12
    
    // método da classe para realização do teste
    public void executaTeste() {
        
        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'String' (inicialmente vazio, mas
        // com capacidade previamente definida para 12 elementos)
        ArrayList<String> nomes = new ArrayList<>(12);
        
        // armazenamento no 'ArrayList'
        // - valores arbitrários (nomes)
        // - posição arbitrária em uma dentre 4 inserções
        nomes.add("Luis");
        nomes.add("Gustavo");
        nomes.add("Gabriel");
        nomes.add("Renato");
        // exibição da quantidade de elementos efetivamente armazenados
        
        // exibição do conteúdo do 'ArrayList'
        
        // ordenação dos elementos do 'ArrayList'
        
        // exibição do conteúdo do 'ArrayList'
        
        // realização de buscas por:
        // - nomes efetivamente armazenados no 'ArrayList'
        // - nomes não armazenados no 'ArrayList'
                
        
    }

}

