import java.util.LinkedHashMap;
import java.util.Map;

public class TesteLinkedHashMapCaracteresQtds {

    public void executaTeste() {
        // frase a ser analisada ('String' comum)
        String fraseOriginal =
                "O professor Carlos é o professor de Estruturas de Dados no curso de INFO " +
                "e também é o professor de Estruturas de Dados no curso de ADS";

        // exibição da 'String' com a frase original
        System.out.printf("\nFrase original:\n%s\n", fraseOriginal);

        // frase preparada ('array' convencional 'char[]')
        char[] frasePreparada = new char[ fraseOriginal.length() ];
        fraseOriginal.getChars(
                0,
                fraseOriginal.length(),
                frasePreparada,
                0 );

        // exibição da quantidade TOTAL de caracteres da frase original
        System.out.printf("\nQtd. TOTAL de caracteres da frase: %3d", frasePreparada.length);

        // criar um LinkedHashMap para contar as ocorrências de cada caractere
        Map<Character, Integer> mapaCaracteresQtd = new LinkedHashMap<>();

        // preencher o LinkedHashMap com os caracteres e suas respectivas quantidades
        for (char caracter : frasePreparada) {
            mapaCaracteresQtd.put(caracter, mapaCaracteresQtd.getOrDefault(caracter, 0) + 1);
        }

        // exibição da quantidade de elementos efetivamente armazenados no LinkedHashMap
        System.out.printf("\nQtd. de caracteres distintos no LinkedHashMap: %2d", mapaCaracteresQtd.size());

        // exibição direta do conteúdo do LinkedHashMap
        System.out.println("\nExibição direta do LinkedHashMap:");
        for (Map.Entry<Character, Integer> entrada : mapaCaracteresQtd.entrySet()) {
            System.out.printf("%s: %d\n", entrada.getKey(), entrada.getValue());
        }
    }
}
