// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que modela a entidade 'Aluno'
public class Pessoa {

	// Atributos
	// ---------
	String nome;
	String cpf;

	// Método Construtor
	// -----------------
	public Pessoa(String nomeRecebido, String cpfRecebido){
		nome  = nomeRecebido;
		cpf    = cpfRecebido;
	}

	// Métodos 'getters' e 'setters' (sempre 'private')
	// ------------------------------------------------
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nomeRecebido) {
		this.nome = nomeRecebido;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpfRecebido) {
		this.cpf = cpfRecebido;
	}

	// Outros métodos ('public' ou 'private', conforme a necessidade
	// -------------------------------------------------------------

	// método para exibição dos dados do Aluno
	void exibeDadosPessoa() {
	
		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Pessoa: " + nome); // nome  do aluno
		System.out.println("CPF : " + cpf); // R.A.  do aluno
		System.out.println("---------------------------------");
		System.out.println();
	
		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;	
	}
    
}
