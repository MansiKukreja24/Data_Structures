package Lists.LinkedList.DoubleLinkedList;


import Lists.LinkedList.SinglyLinkedList.EmployeeLinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeAdams = new Employee("Mike", "Adams", 22);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeAdams);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToTail(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromTail();
        list.printList();
        System.out.println(list.getSize());



    }
}
