public class Main {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(5);
        CustomStack DStack = new DynamicStack(5);

        DStack.push(1);
        DStack.push(2);
        DStack.push(3);
        DStack.push(4);
        DStack.push(5);
//        DStack.push(6);

        System.out.println("Stack First In Last Out: ");
        System.out.println("removed from stack: " + DStack.pop());
        System.out.println("removed from stack: " + DStack.pop());
        System.out.println("removed from stack: " + DStack.pop());
        System.out.println("removed from stack: " + DStack.pop());
        System.out.println("removed from stack: " + DStack.pop());
//        System.out.println("removed from stack: " + DStack.pop());

        System.out.println();

        CustomeQueue queue = new CustomeQueue(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Queue First In First Out: ");
        System.out.println("Removed From Queue: " + queue.poll());
        System.out.println("Removed From Queue: " + queue.poll());
        System.out.println("Removed From Queue: " + queue.poll());
        System.out.println("Removed From Queue: " + queue.poll());
        System.out.println("Removed From Queue: " + queue.poll());

        System.out.println();

//        System.out.println("removeFirst() Method: " + queue.removeFirst());
//        System.out.println("removeLast() Method: " + queue.removeLast());
//        System.out.println("getFirst() Method: " + queue.getFirst());
//        System.out.println("getLast() Method: " + queue.getLast());

    }
}

