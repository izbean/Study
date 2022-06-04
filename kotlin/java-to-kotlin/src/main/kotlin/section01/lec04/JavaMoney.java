package section01.lec04;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney> {
    private Long amount;

    public JavaMoney(Long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaMoney javaMoney = (JavaMoney) o;
        return Objects.equals(amount, javaMoney.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(amount, o.amount);
    }
}
