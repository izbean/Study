### 코틀린에서 클래스를 다루는 방법
1. 클래스와 프로퍼티
2. 생성자와 init
3. 커스텀 getter, setter
4. backing field

---

- 코틀린에서는 필드를 만들면 getter 와 setter 가 자동으로 생긴다
  - 이것을 프로퍼티 라고 부른다
- 코틀린에서는 주 생성자가 필수이다
- 코틀린에서는 constructor 키워드를 사용해 부 생성자를 추가로 만들 수 있다.
  - 단, default parameter 나 정적 팩토리 메소드를 추천한다.
- 실제 메모리에 존재하는 것과 무관하게 custom getter 와 custom setter 를 만들 수 있다.
- custom getter 와 custom setter 에서 무한 루프를 발생 시킬수 있기 때문에 backing field 를 사용한다.