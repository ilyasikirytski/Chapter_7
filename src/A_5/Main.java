/*
5. После каждого слова текста, заканчивающегося заданной подстрокой,
вставить указанное слово.
 */
package A_5;

public class Main {
    public static void main(String[] args) {
        String text = "Do you think it is a good position? i founded a better position";
        insertSub(text, "?");
    }

    public static void insertSub(String text, String endsWith) {
        String[] splitText = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : splitText) {
            if (s.endsWith(endsWith)) {
                result.append(s).append("# ");
            } else {
                result.append(s).append(" ");
            }
        }
        System.out.println(result);
    }
}
