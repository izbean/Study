package main

import "fmt"

// Go의 Structs 는 필디들의 집합체이며 필드들의 컨테이너이다.
// Go 에서 Structs 는 필드 데이터만을 가지며 메서드를 갖지 않는다.
// 기본적으로 Mutable 속성을 띄고 있으며 객체 메모리에서 직접 변경 된다. 하지만 다른 함수의 파라미터로 넘긴다면
// Pass By Value 에 따라 객체를 복사한다. Pass By Reference 를 사용하기 위해선 포인터로 전달 해야 한다.

// Struct 정의
type person struct {
	name string
	age  int
}

type dict struct {
	data map[int]string
}

// 생성자 함수
// 구조체의 필드가 사용전에 초기화 해야 하는 경우
func newDict() *dict {
	d := dict{}
	d.data = map[int]string{}
	return &d
}

func main() {
	// person 객체 생성
	p := person{}

	// 필드 값 설정
	p.name = "강병헌"
	p.age = 26

	// {강병헌 26}
	fmt.Println(p)

	p2 := person{
		name: "강병헌",
		age:  25,
	}

	// {강병헌 25}
	fmt.Println(p2)

	dic := newDict()
	dic.data[1] = "A"

	// &{map[1:A]}
	fmt.Println(dic)
}
