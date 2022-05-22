package main

// 함수 원형 정의
type calculator func(int, int) int

func main() {

	// 익명함수 정의
	sum := func(n ...int) int {
		s := 0
		for _, i := range n {
			s += i
		}

		return s
	}

	// 익명함수 호출
	result := sum(1, 2, 3, 4, 5)
	println(result)

	// 익명함수 할당
	add := func(i int, j int) int {
		return i + j
	}

	// add 익명함수 전달
	r1 := calc(add, 10, 20)
	println(r1)

	// 첫번째 파라미터에 익명함수를 정의
	r2 := calc(func(x int, y int) int { return x - y }, 10, 20)
	println(r2)

	r3 := calc2(func(x int, y int) int { return x * y }, 20, 20)
	println(r3)
}

// Go 에서 함수는 일급함수로써 Go 의 기본 타입과 동일하게 취급된다.
func calc(f func(int, int) int, a int, b int) int {
	result := f(a, b)
	return result
}

func calc2(f calculator, a int, b int) int {
	result := f(a, b)
	return result
}