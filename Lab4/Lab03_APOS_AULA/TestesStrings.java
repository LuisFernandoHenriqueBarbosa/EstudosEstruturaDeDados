
public class TestesStrings {

    // Ação 1
    // Criar uma String para cada palavra do próprio nome
    // Aqui, confunde-se com a própria definição dos atributos (constantes, no caso)
    final String nome1 = "Carlos";
    final String nome2 = "Magnus";
    final String nome3 = "Carlson";
    final String nome4 = "Filho";

    // Ação 2
    // Criar uma nova String que, por concatenação, resulta no nome completo
    private String montaNomeCompleto () {
        return nome1 + " " + nome2 + " " + nome3 + " " + nome4;
    }

    // Ação 3
    // Exibir na tela o seu nome completo e também
    // o respectivo comprimento (quantidade de caracteres)
    private void exibeNomeComprimento( String nomeCompleto) {
        System.out.println("\nO nome completo é " + nomeCompleto + " (" + nomeCompleto.length() + " caracteres, incluindo os espaços em branco).");
    }

    // Ação 4
    // Obter, do teclado, o nome da sua turma (exemplo: "3o_INFO_M")
    // (feito no próprio 'CoordenadorExecucao' para facilitar o uso do Scanner)

    // Ação 5
    // Exibir na tela uma frase que reúne a turma e o seu nome completo
    private void exibeFraseTurmaNome( String nomeTurma, String nomeCompleto ) {
        System.out.println("\nUm dos alunos da turma '" + nomeTurma + "' é " + nomeCompleto + ".");
    }

    // Acionador do métodos acima (este método é chamado pelo 'CoordenadorExecucao')
    public void realizaTestes( String nomeTurma ) {

        // monta o nome completo
        String nomeCompleto = montaNomeCompleto();

        // exibe nome e comprimento
        exibeNomeComprimento( nomeCompleto );

        // exibe frase com turma e nome
        exibeFraseTurmaNome( nomeTurma, nomeCompleto );
        
    }
    
}
