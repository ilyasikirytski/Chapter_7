/*
3. В тексте после буквы Р, если она не последняя в слове,
ошибочно напечатана буква А вместо О. Внести исправления в текст.
 */
package A_3;

public class Main {
    public static void main(String[] args) {
        String wrongText = "Do you think it is a good pasition? i founded a better pasition";
        correctText(wrongText);
    }

    public static void correctText(String wrongText) {
        if (wrongText.contains("pa")) {
            System.out.println(wrongText.replace("pa", "po"));
        }
    }
}
