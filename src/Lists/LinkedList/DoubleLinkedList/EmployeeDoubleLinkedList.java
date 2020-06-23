package Lists.LinkedList.DoubleLinkedList;


public class EmployeeDoubleLinkedList {

        private EmployeeNode head;
        private EmployeeNode tail;
        private int size;


        public void addToFront(Employee employee){
            EmployeeNode node = new EmployeeNode(employee);
            node.setNext(head);
            if(head == null){
                tail = node;
            }
            else{
                head.setPrev(node);
            }
            head = node;
            size++;

        }
        public void addToTail(Employee employee){
            EmployeeNode node = new EmployeeNode(employee);
            if(tail == null){
                tail = node;
            }
            else{
                tail.setNext(node);
                node.setPrev(tail);
            }
            tail = node;
            size++;


        }

        public boolean isEmpty(){
            return head==null;
        }

        public EmployeeNode removeFromFront(){
            if(isEmpty())
                return null;
            EmployeeNode removeNode = head;
            if(head.getNext()==null)
                tail = null;
            else{
                head.getNext().setPrev(head.getPrev());
            }
            head = head.getNext();
            size--;
            removeNode.setNext(null);
            return removeNode;
        }

        public EmployeeNode removeFromTail(){
            if(isEmpty())
                return null;
            EmployeeNode removeNode = tail;
            if(tail.getNext()==null)
                head = null;
            else{
                tail.getPrev().setNext(tail.getNext());
            }
            tail = tail.getPrev();
            size--;
            removeNode.setPrev(null);
            return removeNode;

        }


        public int getSize() {
            return size;
        }

        public void printList(){
            EmployeeNode current = head;
            System.out.print("head ->");
            while(current!=null){
                System.out.print(current);
                System.out.print("<=>");
                current = current.getNext();
            }
            System.out.println("null");
        }
    }


