/*
2. В тексте каждую букву заменить ее порядковым номером в алфавите. При
выводе в одной строке печатать текст с двумя пробелами между буквами,
в следующей строке внизу под каждой буквой печатать ее номер.
 */
package A_2;

public class Main {
    public static void main(String[] args) {
        String text = "hello world. my name is ilya. and i learn how to be a good dev.";
        replaceCharOnAlphabetIndex(text, "e");
    }

    public static void replaceCharOnAlphabetIndex(String text, String indexOfChar) {
        int res;
        String s = "abcdefghijklmnopqrstuvwxyz";
        res = s.indexOf(indexOfChar);
        System.out.println(text.replace(indexOfChar, Integer.toString(res + 1)));
    }
}
