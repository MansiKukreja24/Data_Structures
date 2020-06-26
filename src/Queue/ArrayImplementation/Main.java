package Queue.ArrayImplementation;



public class Main {
    public static void main(String[] args){

        QueueArray arr = new QueueArray(10);

        arr.add(new Employee("Jane","Doe",123));
        arr.add(new Employee("John","Doe",456));
        arr.add(new Employee("Mary","Smith",789));
        arr.add(new Employee("Mike","Adams",263));

        arr.printQueue();
        System.out.println(arr.getSize());
        System.out.println("Peeked:  "+arr.peek());
        System.out.println("Removed:  "+arr.remove());


    }
}
