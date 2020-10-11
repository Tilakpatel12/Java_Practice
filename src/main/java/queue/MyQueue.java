package queue;

public class MyQueue {

    QNode first;

    MyQueue(){
        first =null;
    }

    class QNode{
        int data;
        QNode next;

        QNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean add(int new_element){
        boolean flag = false;
        if(first == null){
            //it created new node
            QNode newNode = new QNode(new_element);

            //pointing new node to the first pointer
            first = newNode;
            flag = true;
        }
        else{
            QNode newNode = new QNode(new_element);
            QNode temp = first;
            //iterate the queue and insert at last
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            flag = true;
        }
        return flag;
    }
    public void print(){
        QNode temp= first;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int remove(){
        //first is null then print list is empty
        //move first pointer to its next node
        if(first == null){
            System.out.println("List is empty");
            return 0;
        }
        else{
            int dataFirst = first.data;
            first = first.next;
            return dataFirst;
        }
    }

    public int peek(){
        if(first == null){
            System.out.println("List is empty");
            return 0;
        }
        else{
            int firstData = first.data;
            return firstData;
        }
    }

    public static void main(String[] args) {
        MyQueue newQueue = new MyQueue();
        newQueue.add(10);
        newQueue.add(20);
        newQueue.add(30);
        newQueue.add(40);
        newQueue.add(50);

        int dataRemoved = newQueue.remove();
        System.out.println("The removed data is " + dataRemoved);

        int dataPeek= newQueue.peek();
        System.out.println("The peeked data is " + dataPeek);

        //newQueue.print();

    }


}
