package Lists.LinkedList.SinglyLinkedList;


public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);


        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        System.out.println("Size:  "+list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println("Size:  "+list.getSize());
        list.printList();


    }

}
