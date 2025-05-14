
package java128;

public class Queue {
    int front=-1;
    int rear=-1;
    int size=5;
    int[] queue =new int[size];
    void enqueue(int x)
    {
        if(front==0 && rear==size-1)
        {
            System.out.println("queue is full");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            rear++;
            queue[rear]=x;
            System.out.println(x+" "+"is inserted into queue");
        }
    }
    int topele()
    {
        return queue[rear];
    }
    int size()
    {
        return rear+1;
    }
    void dequeue()
    {
      if(front==-1 && rear==-1)
      {
          System.out.println("Queue is empty");
      }
      else if(front==rear)
      {
          System.out.println(queue[front]+" "+"is deleted");
          front=-1;
          rear=-1;
      }
      else
      {
       System.out.println(queue[front]+" "+"is deleted");
       front++;
      }
    }
    boolean isempty()
    {
        if(front==-1 && rear==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.topele());
        System.out.println(q.size());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isempty());
        
    }
    
}
