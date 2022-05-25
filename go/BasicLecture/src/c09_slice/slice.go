package main

import "fmt"

func main() {
	// 동적 배열을 선언 할 수 있다.
	var a []int        // 슬라이스 변수 선언
	a = []int{1, 2, 3} // 슬라이스에 리터럴값 지정
	a[1] = 10
	fmt.Println(a) // [1, 10, 3]출력

	// make 를 통해 길이와 최대 용량을 설정 할 수 있다.
	s := make([]int, 5, 10)
	println(len(s), cap(s)) // len 5, cap 10

	var nilSlice []int

	if nilSlice == nil {
		println("Nil Slice")
	}
	println(len(nilSlice), cap(nilSlice)) // 모두 0

	partSlice := []int{0, 1, 2, 3, 4, 5}
	// 배열 index 2 ~ 5 까지 재 정의 할 수 있다.
	partSlice = partSlice[2:5]
	fmt.Println(partSlice) // 2,3,4 출력

	lastSlice := []int{0, 1, 2, 3, 4, 5}
	lastSlice = lastSlice[2:5] // 2, 3, 4
	lastSlice = lastSlice[1:]  // 3, 4
	fmt.Println(lastSlice)     // 3, 4 출력

	appendSlice := []int{0, 1}

	// 하나 확장
	appendSlice = append(appendSlice, 2) // 0, 1, 2
	// 복수 요소들 확장
	appendSlice = append(appendSlice, 3, 4, 5) // 0,1,2,3,4,5

	fmt.Println(appendSlice)

	// len=0, cap=3 인 슬라이스
	sliceA := make([]int, 0, 3)

	// 계속 한 요소씩 추가
	for i := 1; i <= 15; i++ {
		sliceA = append(sliceA, i)
		// 슬라이스 길이와 용량 확인
		fmt.Println(len(sliceA), cap(sliceA))
	}

	fmt.Println(sliceA) // 1 부터 15 까지 숫자 출력

	sliceAA := []int{1, 2, 3}
	sliceBB := []int{4, 5, 6}

	sliceAA = append(sliceAA, sliceBB...)
	//sliceA = append(sliceA, 4, 5, 6)

	fmt.Println(sliceAA) // [1 2 3 4 5 6] 출력

}
