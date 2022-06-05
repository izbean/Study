package section03.lec09;

public class JavaPerson {

    private final String name;

    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;

        if (this.age <= 0)
            throw new IllegalArgumentException(String.format("나이는 %s 일 수 없습니다.", this.age));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
