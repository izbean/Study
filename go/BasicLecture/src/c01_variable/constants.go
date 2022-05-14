package main

import "fmt"

func main() {
	// 상수는 const 를 사용하여 선언한다.
	const c int = 10
	const s string = "Hi"

	fmt.Printf("c: %v, s: %v\n", c, s)

	// 위와 같이 타입을 지정해서 사용할 수 있지만,
	// 아래와 같이 할당 값을 보고 추론 하는 기능이 자주 사용된다.
	const cc = 10
	const ss = "Hi"

	fmt.Printf("cc: %v, ss: %v\n", cc, ss)

	// 괄호로 묶어서 상수 선언을 할 수 있다.
	const (
		Visa   = "Visa"
		Master = "MasterCard"
		Amex   = "American Express"
	)

	fmt.Printf("Visa: %v, Master: %v, Amex: %v\n", Visa, Master, Amex)

	// 상수값을 0부터 순차적으로 부여하기 위해 iota 라는 identifier 를 사용 할 수 있다.
	const (
		Apple  = iota // 0
		Grape         // 1
		Orange        // 2
	)

}
