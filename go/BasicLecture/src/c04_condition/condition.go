package main

func main() {

	k := 1
	// 반드시 Boolean 식으로 표현이 되어야 한다.
	if k == 1 {
		println("One")
	} else if k == 2 {
		println("Two")
	} else {
		println("Other")
	}

	max := 5
	// 조건식을 사용하기 이전에 간단한 문장을 함께 실행 할 수 있다.
	if val := k * 2; val < max {
		println(val)
	}

	// 아래와 같이 사용하면 Scope 를 벗어나 Error
	//val++

	// Switch 뒤에 expression 이 없을 수 있음
	// case 문에 expression 을 쓸 수 있음
	// break 문을 쓰지 않아도 다음 case 로 넘어가지 않음
	// type 에 따라 분기 가능
	switch {
	case max == 5:
		println(1)
		fallthrough
	default:
		println(2)
	}

}
