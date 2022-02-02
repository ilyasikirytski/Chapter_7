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
        int res = 0;
        String s = "abcdefghijklmnopqrstuvwxyz";
        // TODO а цикл зачем? типо один раз сделать  res = s.indexOf(indexOfChar); недостаточно?))
        //  надо чтобы наверняка 26 раз?)
        for (int i = 0; i < s.length(); i++) {
            res = s.indexOf(indexOfChar);
        }
        System.out.println(text.replace(indexOfChar, Integer.toString(res + 1)));
    }
}
