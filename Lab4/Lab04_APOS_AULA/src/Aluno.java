// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2024/1S
// -------------------------------------

// classe que modela a entidade 'Aluno'
public class Aluno {

	// Atributos
	// ---------
	String nome;

	// Método Construtor
	// -----------------

	// Métodos 'getters' e 'setters' (sempre 'private')
	// ------------------------------------------------

	// Outros métodos ('public' ou 'private', conforme a necessidade
	// -------------------------------------------------------------

	// método para exibição dos dados do Aluno
	void exibeDadosAluno() {
	
		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Aluno: " + nome); // nome  do aluno
		System.out.println("R.A. : ..."); // R.A.  do aluno
		System.out.println("Curso: ..."); // curso do aluno
		System.out.println("---------------------------------");
		System.out.println();
	
		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;	
	}
    
}
