package Queue.ArrayImplementation;

import java.util.NoSuchElementException;

public class QueueArray {
    private Employee[] queue;
    private int front;
    private int back;


    public QueueArray(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(back == queue.length){

            //Resize the array

            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back++] = employee;

        }


        public Employee remove(){
            if(getSize() == 0){
                throw new NoSuchElementException();
            }
            Employee employee = queue[front];
            queue[front] = null;
            front++;
            if(getSize()==0){
                front = 0;
                back =0;
            }

            return employee;
        }

        public Employee peek(){
        if(getSize()==0)
            throw new NoSuchElementException();

        return queue[front];
        }

        public void printQueue(){
        for(int i= front; i<back;i++){
            System.out.println(queue[i]);
        }
        }

        public int getSize(){
        return back - front;
        }

    }


