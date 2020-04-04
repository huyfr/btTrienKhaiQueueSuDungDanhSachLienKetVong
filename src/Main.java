public class Main {
    public static void main(String[] args) {
        Solution.Queue queue = new Solution.Queue();
        queue.front = queue.rear = null;

        Solution.enQueue(queue, 14);
        Solution.enQueue(queue, 22);
        Solution.enQueue(queue, 6);

        Solution.displayQueue(queue);

        System.out.print("\nDeleted value = " + Solution.deQueue(queue));
        System.out.print("\nDeleted value = " + Solution.deQueue(queue)+"\n");

        Solution.displayQueue(queue);

        Solution.enQueue(queue, 9);
        Solution.enQueue(queue, 20);

        System.out.println();
        Solution.displayQueue(queue);
    }
}
