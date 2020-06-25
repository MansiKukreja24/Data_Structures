package Stacks.ArrayImplementation;

public class Main {
    public static void main(String[] args){

        Stack arr = new Stack(10);

        arr.push(new Employee("Jane","Doe",123));
        arr.push(new Employee("John","Doe",456));
        arr.push(new Employee("Mary","Smith",789));
        arr.push(new Employee("Mike","Adams",263));

        arr.printStack();
        System.out.println(arr.getSize());
        System.out.println("Peeked:  "+arr.peek());
        System.out.println("Popped:  "+arr.pop());
        arr.printStack();






    }

}
