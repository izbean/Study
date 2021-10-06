package generic;

public class Main {
    public static void main(String[] args) {
        GenericBox<String, Integer> genericBox = new GenericBox<>();
        genericBox.setKey("파랑");
        genericBox.setValue(1);

        GenericBox<Integer, String> genericBox1 = new GenericBox<>();
        genericBox1.setKey(1);
        genericBox1.setValue("상자");

        System.out.println("genericBox: " + genericBox);
        System.out.println("genericBox1: " + genericBox1);
    }
}
