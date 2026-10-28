package Queue;

public class Queue_Implementation {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enQueue(5);
        q1.enQueue(4);
        q1.enQueue(3);
        q1.enQueue(2);
        q1.enQueue(1);
        q1.show();
    }
}

class Queue{
    int[] queue = new int[5];
    int size;
    int front;
    int rare;
    public void enQueue(int data){
        queue[rare] = data;
        rare = rare + 1;
        size = size + 1;
    }
    public void show(){
        for(int i = 0; i < size; i++){
            System.out.print(queue[i] + ", ");
        }
    }
}
