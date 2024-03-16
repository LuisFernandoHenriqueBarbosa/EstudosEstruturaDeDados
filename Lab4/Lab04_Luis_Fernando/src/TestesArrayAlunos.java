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
public class TestesArrayAlunos {

    // Acionador dos testes (este método é chamado pelo 'CoordenadorExeucao')
    public void realizaTestes() {

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in, "CP850");
        
        // Ação 1
        // Criar um array unidimensional de Aluno, em que cada elemento é um objeto da classe Aluno.
        // O array deve permitir o armazenamento de dados de 4 alunos.
        Aluno[] alunos = new Aluno[4];

        // Ação 2
        // Preencher o conteúdo do array a partir de dados obtidos via teclado, um aluno por vez.
        // Utilizar o método construtor para transferir os dados a cada objeto da classe Aluno.
        String nomeRecebido, raRecebido, cursoRecebido;
        for ( int i = 0; i < alunos.length; i++ ) {
            // obter o nome deste aluno
            System.out.print("\nInforme o nome  do aluno " + (i+1) + ": ");
            nomeRecebido  = teclado.nextLine();
            // obter o RA deste aluno
            System.out.print("Informe o R.A.  do aluno " + (i+1) + ": ");
            raRecebido    = teclado.nextLine();
            // obter o curso deste aluno
            System.out.print("Informe o curso do aluno " + (i+1) + ": ");
            cursoRecebido = teclado.nextLine();
            // instanciar um objeto da classe 'Aluno' com estes dados (inicialização via método construtor);
            // este objeto será armazenado no array 'alunos', na posição i
            alunos[i] = new Aluno( nomeRecebido, raRecebido, cursoRecebido );
        }

        // Ação 3
        // Exibir o conteúdo do array utilizando o comando for (convencional, que utiliza um contador)
        // e os métodos ‘getters’ previstos na classe Aluno.
        System.out.println();
        for ( int i = 0; i < alunos.length; i++ ) {
            System.out.println("Dados do aluno " + (i+1) + ": " + alunos[i].getNome() + " - RA " + alunos[i].getRA() + " - " + alunos[i].getCurso());
        }

        // Ação 4
        // Por meio dos métodos ‘setters’ previstos na classe Aluno, alterar os atributos de
        // um dos alunos cujos dados estão armazenados no array.
        // EXEMPLO: dados do aluno da posição 2 do array
        // OPCIONALMENTE, pode obter os novos dados via teclado
        alunos[2].setNome ( "Nome de Teste");
        alunos[2].setRA   ( "1234567890");
        alunos[2].setCurso("Curso de Teste");

        // Ação 5
        // Exibir o conteúdo do array utilizando o comando for (na versão simplificada, que não exige
        // um contador para iterar) e o método de impressão previsto na classe Aluno.
        for ( Aluno a : alunos ) {
            a.exibeDadosAluno();
        }

    }

}

