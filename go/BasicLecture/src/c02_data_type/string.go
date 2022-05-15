package main

import "fmt"

func main() {
	// Back Quote 로 여러줄의 문자열을 선언 할 수 있다.
	// Raw String 그대로의 값을 갖기 떄문에 \n 도 문자열로 인식된다.
	rawLiteral := `
		a\n
		b\n
		c\n
	`

	// Double Quote 로 여러 라인에 걸쳐 쓰기 위해서는 + 연산자를 사용하여 결합한다.
	interLiteral := "a\nb\n" +
		"c"

	fmt.Println(rawLiteral)
	fmt.Println(interLiteral)
}
