### 코틀린에서 object 키워드를 다루는 방법

1. static 함수와 변수
2. 싱글톤
3. 익명 클래스

--- 

- Java 의 static 변수와 함수를 만드려면 Kotlin 에서는 companion object 를 사용해야한다.
- companion object 도 하나의 객체로 간주 되기 때문에 이름을 붙일 수 있고, 다른 타입을 상속 받을 수도 있다.
- Kotlin 에서 싱글톤 클래스를 만들 때 object 키워드를 사용한다.
- Kotlin 에서 익명 클래스를 만들 때 object : 타입을 사용한다.