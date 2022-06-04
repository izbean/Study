package section01.lec01;

import org.jetbrains.annotations.Nullable;

public class Person {
    private String name;

    private Long age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    @Nullable
    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }
}
