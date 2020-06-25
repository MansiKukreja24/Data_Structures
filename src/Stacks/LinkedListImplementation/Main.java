package Stacks.LinkedListImplementation;



public class Main {
    public static void main(String[] args){
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeAdams = new Employee("Mike", "Adams", 223);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeAdams);
        stack.printStack();

        System.out.println("Peeked:  "+stack.peek());
        System.out.println("Popped:  "+stack.pop());


    }
}
