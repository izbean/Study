package section01.lec02;

public class Lec02Main {

    public static void main(String[] args) {

    }

    public static boolean startsWithA1(String str) {
        if (str == null)
            throw new IllegalArgumentException("null 이 들어왔습니다.");

        return str.startsWith("A");
    }

    public static Boolean startsWithA2(String str) {
        if (str == null)
            return null;

        return str.startsWith("A");
    }

    public static boolean startsWithA3(String str) {
        if (str == null)
            return false;

        return str.startsWith("A");
    }

}
