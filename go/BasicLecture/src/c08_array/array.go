package main

func main() {
	// Golang 은 다른 언어와 같이 0번부터 인덱스를 매긴다.
	var a [3]int
	a[0] = 1
	a[1] = 2
	a[2] = 3
	println(a[0])

	var a1 = [3]int{1, 2, 3}
	var a3 = [...]int{1, 2, 3} // 가변 배열

	for _, a := range a1 {
		println(a)
	}

	for _, a := range a3 {
		println(a)
	}

	// 다차원 배열
	var multiArray [3][4][5]int // 정의
	multiArray[0][1][2] = 10    // 사용

	// 다차원 배열 초기화
	var aa = [2][3]int{
		{1, 2, 3},
		{4, 5, 6}, //끝에 콤마 추가
	}

	println(aa[1][2])

}