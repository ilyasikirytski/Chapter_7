/*
4. В тексте после k-го символа вставить заданную подстроку
 */
package A_4;

public class Main {
    public static void main(String[] args) {
        String text = "Do you think it is a good position? i founded a better position";
        correctText(text, "t", "###");
    }

    public static void correctText(String text, String insertAfter, String charToInsert) {
        System.out.println(text.replaceAll(insertAfter, insertAfter + charToInsert));
    }
}