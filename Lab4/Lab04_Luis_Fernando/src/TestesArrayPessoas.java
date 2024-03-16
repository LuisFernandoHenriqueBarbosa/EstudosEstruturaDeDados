// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// importação de class para leitura de dados do teclado
import java.util.Scanner;

// classe que realiza os testes solicitados
// ----------------------------------------
public class TestesArrayPessoas {

    // Acionador dos testes (este método é chamado pelo 'CoordenadorExecucao')
    public void realizaTestes() {

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in, "CP850");
        
        // Ação 1
        // Criar um array unidimensional de Pessoa, em que cada elemento é um objeto da classe Pessoa.
        // O array deve permitir o armazenamento de dados de 4 pessoas.
        Pessoa[] pessoas = new Pessoa[4];

        // Ação 2
        // Preencher o conteúdo do array a partir de dados obtidos via teclado, uma pessoa por vez.
        // Utilizar o método construtor para transferir os dados a cada objeto da classe Pessoa.
        String nomeRecebido, cpfRecebido;
        for ( int i = 0; i < pessoas.length; i++ ) {
            // obter o nome desta pessoa
            System.out.print("\nInforme o nome  da pessoa " + (i+1) + ": ");
            nomeRecebido  = teclado.nextLine();
            // obter o RA desta pessoa
            System.out.print("Informe o CPF  da pessoa " + (i+1) + ": ");
            cpfRecebido    = teclado.nextLine();
            // instanciar um objeto da classe 'Pessoa' com estes dados (inicialização via método construtor);
            // este objeto será armazenado no array 'pessoas', na posição i
            pessoas[i] = new Pessoa( nomeRecebido, cpfRecebido );
        }

        // Ação 3
        // Exibir o conteúdo do array utilizando o comando for (convencional, que utiliza um contador)
        // e os métodos ‘getters’ previstos na classe Aluno.
        System.out.println();
        for ( int i = 0; i < pessoas.length; i++ ) {
            System.out.println("Dados da pessoa " + (i+1) + ": " + pessoas[i].getNome() + " - CPF " + pessoas[i].getCpf());
        }

        // Ação 4
        // Por meio dos métodos ‘setters’ previstos na classe Pessoa, alterar os atributos de
        // uma das pessoas cujos dados estão armazenados no array.
        // EXEMPLO: dados da pessoa da posição 2 do array
        // OPCIONALMENTE, pode obter os novos dados via teclado
        pessoas[2].setNome ( "Nome de Teste");
        pessoas[2].setCpf("123456789");

        // Ação 5
        // Exibir o conteúdo do array utilizando o comando for (na versão simplificada, que não exige
        // um contador para iterar) e o método de impressão previsto na classe Pessoa.
        for ( Pessoa p : pessoas ) {
            //p.exibeDadosAluno();
            p.exibeDadosPessoa();
        }

    }

}
