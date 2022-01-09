/*
1. В каждом слове текста k-ю букву заменить заданным символом. Если k
больше длины слова, корректировку не выполнять.
 */
package A_1;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world. My name is ilya. And i learn how to be a good dev.";
        replaceChar(text, "o", "&@$");
    }

    public static void replaceChar(String text, String targetChar, String replaceTo) {
        System.out.println(text.replace(targetChar, replaceTo));
    }
}
