package main

import (
	"fmt"
	"os"
)

func main() {
	f, err := os.Open("1.txt")

	defer func() {
		// recover 함수를 통해 panic 함수에 의한 패닉 상태를 정상으로 되돌리는 함수이다.
		if r := recover(); r != nil {
			fmt.Println("OPEN ERROR", r)
		}
	}()

	if err != nil {
		panic(err)
	}

	// defer 키워드를 통해 main 메서드가 종료 되기 이전 지연 로직을 수행 할 수 있다.
	defer func(f *os.File) {
		err := f.Close()
		if err != nil {
			// 현재 함수를 즉시 멈추고 현재 함수의 defer 함수들을 모두 실행한 후 즉시 리턴한다.
			// panic 모드 실행 방식은 상위 함수에도 똑같이 적용되고, 계속 콜스택을 타고 올라가며 적용된다.
			// 마지막으로 프로그램이 에러를 내고 종료 하게 된다.
			panic(err)
		}
	}(f)

	bytes := make([]byte, 1024)
	_, err = f.Read(bytes)
	if err != nil {
		panic(err)
	}

	println(len(bytes))
}
