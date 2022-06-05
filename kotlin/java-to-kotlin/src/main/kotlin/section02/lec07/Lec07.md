1. try catch finally 구문
2. Checked Exception 과 Unchecked Exception
3. try with resources

---

- try catch finally 구문은 문법적으로 완전히 동일하다.
  - Kotlin 에서는 try catch 가 expression 이다.
- Kotlin 에서 모든 예외는 Unchecked Exception 이다.
- Kotlin 에서는 try with resources 구문이 없다. 대신 코틀린의 언어적 특징을 활용해 close 를 호출해준다.