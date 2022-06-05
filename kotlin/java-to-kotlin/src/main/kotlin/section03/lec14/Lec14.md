### 코틀린에서 다양한 클래스를 다루는 방법
1. Data Class
2. Enum Class
3. Sealed Class, Sealed Interface

---

- Data Class: 계층간에 데이터를 전달하기 위한 DTO (Data Transfer Object)
  - 데이터
  - 생성자, getter, setter
  - equals, hashcode
  - toString
  - Java: IDE 를 활용 할수도 있고, Lombok 을 활용 할 수도 있지만, 클래스가 장황해지거나, 클래스 생성 이후 추가적인 처리를 해줘야하는 단점이 있다.
  - Kotlin: 클래스 앞에 data 키워드를 붙여주면 equals, hashcode, toString 을 자동으로 만들어준다.
- Enum Class
  - Java: 클래스를 상속 받을 수 없고, 각 코드가 싱글턴이다
  - when 은 Enum Class 혹은 Sealed Class 와 함께 사용할 경우, 더욱더 진가를 발휘한다.
  - Enum 에 변화가 있으면 알 수 있다.
- Sealed Class, Sealed Interface: 상속이 가능하도록 클래스를 만들고 싶은데 외부에서 상속 받지 못하게 하고싶다.
  - 컴파일 타임 때 하위 클래스 타입을 모두 기억한다.
  - 런타임때 클래스 타입이 추가 될 수 없다.
  - 하위 클래스는 같은 패키지에 있어야 한다.
  - Enum 과 다른점
    - Class 를 상속 받을 수 있다
    - 하위 클래스는 멀티 인스턴스가 가능하다

---

- Kotlin 의 Data Class 를 사용하면 equals, hashCode, toString 을 자동 작성 해준다
- Kotlin 의 Enum Class 는 Java 의 Enum Class 와 동일하지만, when 과 함께 사용함으로써 큰 장점을 갖게 된다.
- Enum Class 보다 유연하지만, 하위 클래스를 제한하는 Sealed Class 역시 when 과 함께 주로 사용된다.

