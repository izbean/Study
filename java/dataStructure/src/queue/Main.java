package queue;

class Main {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.add(1);
        System.out.println(queue);
        queue.add(2);
        System.out.println(queue);
        queue.add(3);
        System.out.println(queue);
        queue.add(4);
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
        queue.remove();
        queue.add(6);
        System.out.println(queue);
        System.out.println(queue.contains(6));
        System.out.println(queue.contains(7));
    }
}
