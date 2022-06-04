package section01.lec04;

public class Lec04Main {

    public static void main(String[] args) {
        JavaMoney javaMoney1 = new JavaMoney(1_010L);
        JavaMoney javaMoney2 = new JavaMoney(1_001L);

        if (javaMoney1.compareTo(javaMoney2) > 0) {
            System.out.println("머니 1이 머니 2보다 큽니다.");
        }
    }

}

