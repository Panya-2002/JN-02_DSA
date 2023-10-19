#include<iostream>
#define SIZE 5
class Queue
{
    int data[SIZE];
    int front, rear;
    public:
        Queue()
        {
            front=rear=-1;
        }
        int isEmpty()
        {
            if (front==-1 && rear==-1 || front==SIZE)
                return 1;
            else    
                return 0;
        }
        int isFull()
        {
            if (rear==SIZE-1)
                return 1;
            else
                return 0;
        }
        void insert(int element)
        {
            if (isFull()==1)
                std::cout<<"\nQueue is Full...unable to insert "<<element;
            else
            {
                if (isEmpty()==1)
                    front++;
                rear++;
                data[rear]=element;
                std::cout<<"\n"<<element<<" is inserted successfully....";             
            }
        }
        int remove()
        {
            int no=-1;
            if (isEmpty()==1)
                std::cout<<"\nQueue is Empty....unable to remove";
            else
            {
                no=data[front];
                front++;
            }
            return no;
        }
};


int main()
{
    std::cout<<"---------------Static QUEUE----------";
    Queue q;
    q.insert(10);
    q.insert(20);
    q.insert(30);
    q.insert(40);
    q.insert(50);
    q.insert(60);
   
    std::cout<<"\n";
    std::cout<<"\nElement removed from Queue : "<<q.remove();
    std::cout<<"\nElement removed from Queue : "<<q.remove();
    std::cout<<"\nElement removed from Queue : "<<q.remove();
    std::cout<<"\nElement removed from Queue : "<<q.remove();
    std::cout<<"\nElement removed from Queue : "<<q.remove();
    std::cout<<"\nElement removed from Queue : "<<q.remove();

}