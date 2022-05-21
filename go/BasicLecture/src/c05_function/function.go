package main

// Go 에서 파라미터를 전달하는 방식은 크게 Pass By Value 와 Pass By Reference 로 나뉜다

func main() {
	msg := "hello"
	say(msg)

	// say function 에서 "heee" 로 수정했음에도 불구하고 "hello" 가 출력된다.
	println(msg)

	// msg 의 주소 값이 출력 된다.
	println(&msg)
	say2(&msg)

	println(msg)

	say3("1", "2", "3")

	total, count := sum(1, 2, 3, 4, 5)
	println(total, count)

	total, count = sum2(1, 2, 3, 4, 5)
	println(total, count)

}

// 리턴이 없으므로 별다른 리턴 타입을 정의하지 않는다.
// Pass By Value
func say(msg string) {
	println(msg)
	// msg 의 주소를 넘기지 않았으므로 실제로 msg 안에 있는 string 값이 변화되지 않는다.
	msg = "heee"
}

func say2(msg *string) {
	println(*msg)
	// 주소 안에 있는 값을 수정하였으므로 해당 주소 안에 있는 값은 heee 로 바뀌었다.
	*msg = "heee"
}

// 가변 인자 함수 n 개의 msg 값을 받을 수 있다.
func say3(msg ...string) {
	for i, m := range msg {
		println(i, m)
	}
}

// golang 은 n 개의 리턴 값을 반환 할 수 있다.
func sum(nums ...int) (int, int) {
	sum := 0
	count := 0

	for _, m := range nums {
		sum += m
		count++
	}

	return sum, count
}

// 아래와 같이도 사용 할 수 있다.
func sum2(nums ...int) (sum int, count int) {
	for _, m := range nums {
		sum += m
	}

	count = len(nums)

	return
}
