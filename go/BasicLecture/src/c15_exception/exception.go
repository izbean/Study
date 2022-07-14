package main

import (
	"log"
	"os"
)

// Go는 내장 타입으로 error 라는 interface 타입을 갖는다.
// Go 에러는 이 error 인터페이스를 통해서 주고 받게 되는데,
// 이 interface 는 다음과 같은 하나의 메서드를 갖는다.
// 개발자는 이 인터페이스를 구현하는 커스텀 에러 타입을 만들 수 있다

type error interface {
	Error() string
}

func main() {
	f, err := os.Open("C:\\temp\\1.txt")
	if err != nil {
		log.Fatal(err.Error())
	}
	println(f.Name())
}
