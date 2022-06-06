### 코틀린의 이모저모
1. Type Alias 와 as import
2. 구조분해와 componentN 함수
3. Jump 와 Label
4. TakeIf 와 TakeUnless
---
- Type Alias 와 as import
  - 긴 이름의 클래스 혹은 함수 타입이 있을때 축약 하거나 더 좋은 이름을 쓸 수 있다.
  - as import: 함수 import 시 같은 함수명에 대해 별명을 지정해 줄 수 있다.
- 구조분해 와 componentN 함수
  - 구조분해: 복합적인 값을 분해하여 여러 변수를 한 번에 초기화 하는 것
  - Data Class 는 componentN 함수도 같이 생성해준다.
    - Data Class 는 기본적으로 가지고 있는 property 에 대해 component1, 2, .. 를 생성해준다.
---
- 타입에 대한 별칭을 줄 수 있는 typealias 라는 키워드가 존재한다.
- Import 당시 이름을 바꿀 수 있는 as import 기능이 존재한다
- 변수를 한 번에 선언 할 수 있는 구조 분해 기능이 있으며 componentN 함수를 사용한다.
- for, while 문과 달리 forEach 에는 break 와 continue 를 사용 할 수 없다.
- takeIf 와 takeUnless 를 활용해 코드 양을 줄이고 method channing 을 활용 할 수 있다.