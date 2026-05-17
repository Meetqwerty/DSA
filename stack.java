public class stack{
    int top;
    int data;
    int maxsize;
    int arr[];
    stack(int maxsize){
        this.top=-1;
        this.data=data;
        this.maxsize=maxsize;
        arr=new int[maxsize];
    }
    public void push(int data){
        if(top>=arr.length-1){
            System.out.println("Stack overflow");
        }else{
            top++;
            arr[top]=data;
        }
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }public void pop(){
        if(top!=-1){
            System.out.println("Popped element: "+arr[top--]);   
        };
    }
    
    public static void main(String[] args) {
        stack s=new stack(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(11);
        s.display();
        s.pop();
        s.display(); // This will cause stack overflow
    }
}