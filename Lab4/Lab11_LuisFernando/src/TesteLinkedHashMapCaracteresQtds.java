import java.util.LinkedHashMap;
import java.util.Map;

public class TesteLinkedHashMapCaracteresQtds {

    public void executaTeste() {

        String fraseOriginal =
                "O professor Carlos é o professor de Estruturas de Dados no curso de INFO " +
                "e também é o professor de Estruturas de Dados no curso de ADS";


        System.out.printf("\nFrase original:\n%s\n", fraseOriginal);


        char[] frasePreparada = new char[ fraseOriginal.length() ];
        fraseOriginal.getChars(
                0,
                fraseOriginal.length(),
                frasePreparada,
                0 );


        System.out.printf("\nQtd. TOTAL de caracteres da frase: %3d", frasePreparada.length);


        Map<Character, Integer> mapaCaracteresQtd = new LinkedHashMap<>();


        for (char caracter : frasePreparada) {
            mapaCaracteresQtd.put(caracter, mapaCaracteresQtd.getOrDefault(caracter, 0) + 1);
        }


        System.out.printf("\nQtd. de caracteres distintos no LinkedHashMap: %2d", mapaCaracteresQtd.size());


        System.out.println("\nExibição direta do LinkedHashMap:");
        for (Map.Entry<Character, Integer> entrada : mapaCaracteresQtd.entrySet()) {
            System.out.printf("%s: %d\n", entrada.getKey(), entrada.getValue());
        }
    }
}
