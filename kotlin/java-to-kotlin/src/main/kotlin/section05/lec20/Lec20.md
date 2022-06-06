### 코틀린의 scope function
1. scope function 이란 무엇인가
2. scope function 의 분류
3. 언제 어떤 scope function 을 사용해야 할까
4. scope function 의 가독성
---
- scope function: 일시적인 함수를 생성
  - let
    - 반환: 람다의 결과
    - it: 생략이 불가능한 대신, 다른 이름을 붙일 수 있다.
    - 하나 이상의 함수를 call chain 결과로 호출 할 때
    - non-null 값에 대해서만 code block 을 싱행시킬 때
    - 일회성으로 제한된 영역에 지역 변수를 만들 때
  - run
    - 반환: 람다의 결과
    - this: 생략이 가능한 대신, 다른 이름을 붙일 수 없다.
    - 객체 초기화와 반환값을 바로 계산 해야할때
    - 반복되는 생성 후 처리는 생성자, 프로퍼티, init block 으로 넣는 것이 좋다.
  - also
    - 반환: 객체 그 자체
    - it
    - 객체를 수정하는 로직이 call chain 중간에 필요 할 때
  - apply
    - 반환: 객체 그 자체
    - this
    - 객체 설정을 할 때에
    - 객체를 수정하는 로직이 call chain 중간에 필요 할 때
    - Test Fixture 를 만들 때
  - with(파라미터, 람다)
    - 확장함수가 아님
    - this 를 통해 접근하고 this 는 생략 가능하다.
    - 특정 개체를 다른 객체로 변환해야 하는데, 모듈 간의 의존성에 의해 정적 팩토리 메서드나 toClass 함수를 만들기 어려울때.
- 사용 빈도가 적은 관용구는 코드를 더 복잡하게 만들고 이런 관용구들을 한 문장 내에서 조합해 사용하면 복잡성이 증가한다.
- 적절한 convention 을 적용하면 유용하게 활용 할 수 있다.
---
- 코틀린의 scope function 은 일시적인 영역을 만들어 코드를 더 간결하게 하거나, method chaining 에 유리.
- scope function 을 사용한 코드는 사람에 따라 가독성을 다르게 느낄 수 있기 때문에, 함께 프로덕트를 만들어 가는 팀 끼리 covention 을 잘 정해야 한다.
