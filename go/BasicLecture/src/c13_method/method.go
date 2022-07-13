package main

// Go 메서드는 특별한 형태의 func 함수이다.
// 메소드는 함수 정의에서 func 키워드와 함수명 사이에 "그 함수가 어떤 struct 를 위한 메서드인지 표시하게 된다.
// 흔히 receiver 로 불리우는 이 부분은 메서드가 속한 struct 타입과 struct 변수명을 지정하는데,
// struct 변수명은 함수 내에서 마치 입력 파라미터처럼 사용된다.

// Value receive 는 struct 의 데이타를 복사하여 전달하며,
// 포인터 receiver 는 struct 의 포인터만을 전달한다.
// Value receiver 의 경우 만약 메서드내에서 그 struct 의 필드값이 변경되더라도 호출자의 데이타는 변경되지 않는 반면,
// 포인터 receiver 는 메서드 내의 필드값 변경이 그대로 호출자에서 반영된다.
// 위의 Rect.area() 메서드는 Value receiver 를 표현한 것으로 만약 area() 메서드 내에서 width 나 height 가 변경되더라도 main() 함수의 rect 구조체의 필드값에는 변화가 없다.
// 하지만, 아래와 같이 이를 포인터 receiver 로 변경한다면, 메서드 내 r.width++ 필드 변경분이 main() 함수에서도 반영되기 때문에 출력값이 11, 220 이 된다.

type Rect struct {
	width, height int
}

// Rect 의 area 메소드
func (r Rect) area() int {
	return r.width * r.height
}

func (r *Rect) area2() int {
	r.width++
	return r.width * r.height
}

func main() {
	rect := Rect{10, 20}
	area := rect.area()
	println(area)

	rect2 := new(Rect)
	rect2.width = 9
	rect2.height = 1

	area2 := rect2.area2()

	println(rect2.width, area2)
}
