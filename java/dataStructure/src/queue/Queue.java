package queue;

public interface Queue<E> {

    // 맨 뒤에 전달된 요소를 삽입. 큐에 여유 공간이 없어서 삽입이 실패하면 IllegalStateException.
    boolean add(E e);

    // 맨 뒤에 전달된 요소를 삽입.
    boolean offer(E e);

    // 맨 앞에 있는 요소를 반환하고, 큐에서 제거.
    E poll();

    // 큐의 맨 앞에 있는 요소를 반환.
    E peek();

    // 큐의 맨 앞에 있는 요소를 제거
    E remove();

    // 큐의 현재 크기를 반환.
    int size();

    // 큐가 비어 있는지 확인.
    boolean isEmpty();

    //  큐에 전달 받은 값이 존재하는지 확인.
    boolean contains(E e);

    // 큐를 초기화.
    void clear();

}
