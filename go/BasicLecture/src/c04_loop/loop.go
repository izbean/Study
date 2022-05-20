package main

func main() {
	sum := 0

	// 일반적인 for
	for i := 1; i <= 100; i++ {
		sum += i
	}

	println(sum)

	n := 1

	// 조건식만 사용하는 for
	for n < 100 {
		n *= 2
	}

	println(n)

	// 무한 루프
	//for {
	//	println("Infinite loop")
	//}

	// for Range
	names := []string{"홍길동", "이순신", "강감찬"}

	for i, name := range names {
		println(i, name)
	}
 
	var a = 1
	for a < 15 {
		if a == 5 {
			a += a
			continue // for 시작으로
		}
		a++
		if a > 10 {
			break // 루프 빠져나옴
		}
	}
	if a == 11 {
		goto END // goto 사용예
	}

	println(a)

END:
	println("End")

	i := 0

L1:
	for {

		if i == 0 {
			// for 문을 빠져나와 L1 레이블로 이등한 후 for 문을 건너 뛰고 다음 라인으로 이동한다.
			break L1
		}
	}

	println("OK")

}
