public class queue{
    int front;
    int rear;
    int data;
    int size;
    int[] arr;
    queue(int size){
        this.data=data;
        this.front=-1;
        this.size=size;
        this.rear=-1;
        this.arr=new int[size];
    }
    public void enqueue(int data){
        if(rear==size-1){
            System.out.println("queue is full");
        }
        
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            arr[rear]=data;
        }
    }public void dequeue(){
        if(rear==-1||front>rear){
            System.out.println("queue is empty");
        }
        else
        {
            int data=arr[front];
        front++;
        System.out.println("dequeued element is "+data);
        }
        if(front>rear){
            front=-1;
            rear=-1;
        }
    }
    public void display(){
        if(rear==-1&&front==-1){
            System.out.println("queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"->");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q=new queue(10);
        q.enqueue(1);
        q.enqueue(2);  
        q.enqueue(3);
        q.enqueue(4);     
        q.dequeue();
        q.display();
        
        
    }
}