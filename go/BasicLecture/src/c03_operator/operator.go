package main

import "fmt"

// Golang 은 다른 언어와 비슷하게 산술, 관계, 논리, Bitwise
// 할당, 포인터 연산자 등을 지원한다.
func main() {

	// 산술 연산자
	a := 1
	b := 2
	c := (a + b) / 5
	c++

	fmt.Printf("c: %v\n", c)

	// 관계 연산자
	fmt.Printf("a == b: %v\n", a == b)
	fmt.Printf("a != c: %v\n", a != c)
	fmt.Printf("a >= b: %v\n", a >= b)

	// 논리 연산자
	fmt.Printf("true && false: %v\n", true && false)
	fmt.Printf("true || false: %v\n", true || false)
	fmt.Printf("!true: %v\n", !true)

	// Bitwise 연산자
	d := 1 + 2<<5
	fmt.Printf("d: %v\n", d)

	// 할당 연산자
	var e = 100
	e *= 10
	e >>= 2
	e |= 1
	fmt.Printf("e: %v\n", e)

	// 포인터 연산자
	// Golang 에선 포인터 연산자를 제공하지만 포인터에 덧셈, 뺄셈 기능은 제공하지 않는다.
	f := 10
	g := &f
	*g++

	// f와 g의 값이 동일한것을 볼 수 있다.
	fmt.Printf("f: %v, g: %v", f, *g)
}
