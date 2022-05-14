package main

import "fmt"

func main() {
	// var, := 키워드를 사용하여 변수를 선언한다.
	// bool, string 같은 경우 초기값을 지정해주지 않을경우 bool: false, str: "" 로 기본 초기화 된다.
	// Go 에서 선언된 변수를 사용하지 않을경우 에러가 발생한다.
	var is bool
	var str string

	fmt.Printf("is: %v, str: %v \n", is, str)

	a, b, c := 1, 2, 3

	fmt.Printf("%v, %v, %v \n", a, b, c)

	var d, f, e = 4, 5, 6

	fmt.Printf("%v, %v, %v \n", d, f, e)

}
