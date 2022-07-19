package main

import (
	"fmt"
	"runtime"
	"sync"
	"time"
)

func say(s string) {
	for i := 0; i < 10; i++ {
		fmt.Println(s, "***", i)
	}
}

// Go 루틴은 비동기 처리를 지원하는 경량 스레드 이다.
// Go 루틴은 실행 순서가 일정하지 않으므로 결과의 순서가 다를 수 있다.
func main() {
	// 4 개의 CPU 사용
	runtime.GOMAXPROCS(4)
	say("Sync")

	go say("Async1")
	go say("Async2")
	go say("Async3")

	time.Sleep(time.Second * 3)

	var wait sync.WaitGroup
	wait.Add(2)

	go func() {
		defer wait.Done()
		fmt.Println("Hello")
	}()

	go func(msg string) {
		defer wait.Done()
		fmt.Println(msg)
	}("Hi")

	wait.Wait() // Go 루틴이 모두 종료 될 때 까지 대기
}
