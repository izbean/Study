package main

func main() {
	var idMap map[int]string

	// nil map
	idMap = make(map[int]string)

	for key, val := range idMap {
		println(key, val)
	}

	// 리터럴을 통해 초기화 할 수 있다.
	tickers := map[string]string{
		"GOOG": "Google Inc",
		"MSFT": "Microsoft",
		"FB":   "Facebook",
	}

	// map 키 체크
	_, exists := tickers["MSFT"]
	if !exists {
		println("No MSFT ticker")
	}

	for key, val := range tickers {
		println(key, val)
	}

	var m map[int]string

	m = make(map[int]string)
	// 추가 혹은 갱신
	m[901] = "Apple"
	m[134] = "Grape"
	m[777] = "Tomato"

	// 키에 대한 값 읽기
	str := m[134]
	println(str)

	noData := m[999] // 값이 없으면 nil 혹은 zero 리턴
	println(noData)

	// 삭제
	delete(m, 777)

	// for range 문을 사용하여 모든 맵 요소 출력
	// Map 은 unordered 이므로 순서는 무작위
	for key, val := range m {
		println(key, val)
	}

}
