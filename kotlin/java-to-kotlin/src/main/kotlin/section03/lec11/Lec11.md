### 코틀린에서 접근 제어를 다루는 방법
1. Java 와 Kotlin 의 가시성 제어
2. 코틀린 파일의 접근 제어
3. 다양한 구성요소의 접근제어
4. Java 와 Kotlin 을 함께 사용 할 경우 주의할 점

---

- Java 와 Kotlin 의 접근 제어 차이
- public == public
- protected -> protected (선언 된 클래스 또는 하위 클래스에서만 접근 가능)
- default -> internal (같은 모듈에서만 접근 가능)
  - 모듈: 한 번에 컴파일 되는 Kotlin 코드
    - IDEA Module
    - Maven Project
    - Gradle Source Set
- private == private

- Java 의 기본 접근 지시어는 default, Kotlin 은 public

2. 코틀린 파일의 접근 제어
- public: 기본 값 어디에서든 접근 할 수 있다
- protected 파일(최상단)에는 사용 불가능
- internal 같은 모듈에서만 접근 가능
- private 같은 파일내에서만 접근 가능

3. 다양한 구성요소의 접근제어
- 클래스 안에 멤버
  - public, protected, internal, private
- 생성자
  - 생성자에 접근 지시어를 붙이려면 constructor 를 붙여 줘야 한다.
- 프로퍼티
  - 가시성 범위는 동일하지만 설정 방법은
    - getter, setter 한번에 접근 지시어를 적용하거나

4. Java 와 Kotlin 을 함께 사용 할 경우 주의할 점
- Internal 은 바이트 코드 상 public 이 된다.
- Java 는 같은 패키지의 Kotlin Protected 멤버에 접근 할 수 있다.

---

- Kotlin 에서 패키지는 namespace 관리 용이기 때문에 protected 는 의미가 달라졌다.
- Kotlin 에서는 default 가 사라지고, 모듈간의 접근을 통제하는 internal 이 새로 생겼다
- 생성자에 접근 지시어를 붙일 때는 constructor 를 명시적으로 써주어야 한다.
- 유틸성 함수를 만들 때는 파일 최 상단을 이용하면 편리하다.
- 프로퍼티의 custom setter 에 접근 지시어를 붙일 수 있다.
- Java 에서 Kotlin 코드를 사용할때는 internal 과 protected 를 주의하여 사용 하여야 한다.