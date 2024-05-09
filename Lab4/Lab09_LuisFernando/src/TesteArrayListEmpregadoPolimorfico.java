// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRANJOS DINÂMICOS em JAVA
// Ano/S: 2024/1S
// ----------------------------------------
 
// classe para realização de testes com
// 'ArrayList' contendo objetos 'EmpregadoPolimorfico'
// ---------------------------------------------------

// importação para permitir o uso de 'ArrayList'
import java.util.ArrayList;
import java.util.Iterator;


public class TesteArrayListEmpregadoPolimorfico {
    
    // método da classe para realização do teste
    public void executaTeste() {
        
        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'String' (inicialmente vazio)
        
        // armazenamento no 'ArrayList'
        // - 4 objetos da classe 'Empregado', um de cada tipo
        // - lembrar que cada 'Empregado...' tem uma 'dataNascimento'

        // cria objetos das subclasses
        EmpregadoAssalariado assalariado
                = new EmpregadoAssalariado(
                    "Carlos", 
                    "Filho", 
                    "111.111.111-11",
                    13,
                    8,
                    1979,
                    800.00);

        EmpregadoHorista horista
                = new EmpregadoHorista(
                    "Marcos", 
                    "Neto", 
                    "222.222.222-22",
                    33,
                    5,
                    1991,
                    16.75, 
                    40);

        EmpregadoComissionado comissionado
                = new EmpregadoComissionado(
                        "Renato",
                        "Sobrinho", 
                        "333.333.333-33",
                        5,
                        13,
                        1998,
                        10000,
                        .06);

        EmpregadoComissionadoMaisFixo comissionadoMaisFixo
                = new EmpregadoComissionadoMaisFixo(
                        "Robert",
                        "Junior",
                        "444.444.444-44",
                        25,
                        10,
                        2001,
                        5000,
                        .04,
                        300);

        // instanciação de um objeto da classe 'ArrayList'
        // para armazenar 'Empregado' (inicialmente vazio)
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();

        // armazena, no 'ArrayList', empregados dos tipos existentes (um para cada subclasse)
        empregados.add(assalariado);
        empregados.add(horista);
        empregados.add(comissionado);
        empregados.add(comissionadoMaisFixo);

        System.out.println("\nConteúdo do ArrayList de objetos de subclasses de 'Empregado' (usando ITERATOR):");
        Iterator< Empregado > iterador = empregados.iterator();
        while ( iterador.hasNext() ) {
            Empregado emp = iterador.next();
            System.out.printf("\n%s\nVencimentos: R$%,.2f\n", emp, emp.vencimentos()); // POLIMORFISMO !!!
            System.out.printf("Este Empregado é um %s\n", emp.getClass().getName());
        }
        System.out.println();

        System.out.println("\nConteúdo do ArrayList de objetos de subclasses de 'Empregado' (usando FOR e GET(index)):");
        for ( int i = 0; i < empregados.size(); i++ ) {
            Empregado emp = empregados.get(i);
            System.out.printf("\n%s\nVencimentos: R$%,.2f\n", emp, emp.vencimentos());  // POLIMORFISMO !!!
            System.out.printf("Este Empregado é um %s\n", emp.getClass().getName());
        }

        // a verificar a necessidade...
        /*
        // cria um array de 'Empregado' de quatro elementos
        Empregado empregados[] = new Empregado[4];

        // inicializa o array com empregados dos tipos existentes
        empregados[0] = assalariado;
        empregados[1] = horista;
        empregados[2] = comissionado;
        empregados[3] = comissionadoMaisFixo;
        */
        
        // exibição via métodos de 'Empregado...'
        /*
        System.out.printf("%s\n%s: R$%,.2f\n\n",
            assalariado, "Vencimentos", assalariado.vencimentos());
        System.out.printf("%s\n%s: R$%,.2f\n\n",
            horista, "Vencimentos", horista.vencimentos());
        System.out.printf("%s\n%s: R$%,.2f\n\n",
            comissionado, "Vencimentos", comissionado.vencimentos());
        System.out.printf("%s\n%s: R$%,.2f\n\n",
            comissionadoMaisFixo,
            "Vencimentos", comissionadoMaisFixo.vencimentos());
        
        */
        
        /*
        // processamento polimórfico
        System.out.println("Empregados processados polimorficamente::\n");

        // processa genericamente cada elemento no array 'empregados'
        for (Empregado empregadoAtual : empregados) {

            System.out.println(empregadoAtual); // invoca toString

            System.out.printf(
                  "Vencimentos $%,.2f\n\n", empregadoAtual.vencimentos());
         }
        */
        /*
        System.out.println("Nome da classe efetiva de cada Empregado:\n");

        // obtém o nome do tipo de cada objeto no array 'empregados'
        for (int j = 0; j < empregados.length; j++) {
            System.out.printf("Empregado %d is a %s\n", j,
                                empregados[j].getClass().getName());
        }
        */


        


        
        // exibição do conteúdo do 'ArrayList'
                
        
    }

}

