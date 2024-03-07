// classe que contém métodos de uso geral

// código da classe
public class MetodosAvulsos {
    
	// Uso geral - geração de número randômico inteiro num certo intervalo [min,max)
	// Observação: min (inclusive), max (exclusive)
	// -------------------------------------------------------------------
	public int geraNumeroRandomico( int min, int max ) {

		// geração do número
		int numeroRandomico = (int)(Math.random() * (max+1));  // [min,max]

		// finalização
		return numeroRandomico;
	}

}
