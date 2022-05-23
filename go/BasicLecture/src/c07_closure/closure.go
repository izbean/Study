package main

// closer 함수를 next 에 할당하고 새로 anotherNext 에 설정 했을때 새로운 함수를 다시 할당하게 된다
// 주소 값이 다른 것을 볼 수 있다.
func main() {
	next := nextValue()

	println(next()) // 1
	println(next()) // 2
	println(next()) // 3
	println(next)   // 주소

	anotherNext := nextValue()

	println(anotherNext()) // 1
	println(anotherNext()) // 2
	println(anotherNext()) // 3
	println(anotherNext)   // 주소
}

func nextValue() func() int {
	i := 0
	return func() int {
		i++
		return i
	}
}
