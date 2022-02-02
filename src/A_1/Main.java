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

    // TODO а зачем этот метод? он мало того что ничего не делает, так еще и нарушает Single Responsibility principle
    //  можно же было этот вызов прямо в той строчке и оставить, раз сам реализацию не писал
    //  System.out.println(text.replace("o", "&@$"));
    public static void replaceChar(String text, String targetChar, String replaceTo) {
        System.out.println(text.replace(targetChar, replaceTo));
    }
}
