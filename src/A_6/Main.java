/*
6. В зависимости от признака (0 или 1) в каждой строке текста удалить указанный символ везде,
где он встречается, или вставить его после k-гo символа.
 */
package A_6;

public class Main {
    public static void main(String[] args) {
        String text = "Do you think it is a good position? i founded a better position";
        insertSub(text, 0, "t", "#");
    }

    public static void insertSub(String text, int insertOrDelete, String insertAfter, String charToInsert) {
        if (insertOrDelete == 1) {
            System.out.println(text.replaceAll(insertAfter, insertAfter + charToInsert));
        } else {
            System.out.println(text.replaceAll(insertAfter, ""));
        }
    }
}
