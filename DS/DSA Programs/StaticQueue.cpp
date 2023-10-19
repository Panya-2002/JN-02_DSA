/***************************************************************************
 *Program to demonstarte static implementation of Queue
*******************************************************************************/

#include <iostream>
#define SIZE 2
using namespace std;

class Queue
{
   int data[SIZE];
   int rear, front;
   
   public:
    Queue()
    {
        front=rear=-1;
    }
    void insert(int element)
    {   
        if (isFull()==1)
            cout<<"Queue is FULL....";
        else
        {
            data[++rear]=element;
            if (front==-1)
                front=0;
        }
    }
    int remove()
    {   
        if (isEmpty()==1)
            return -1;
        else
            return data[front++];
    }
    int isEmpty()
    {
        if (rear==front==-1 || front>rear)
        {
            cout<<"Queue is Empty...";
            return 1;    
        }
        
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
    int peek()
    {
        if (isEmpty()==1)
            return -1;
        else
            return data[front];
    }
};

int main()
{
    cout<<"Static Implementation of Queue \n";
    Queue q;
    q.insert(10);
    q.insert(20);
    q.insert(30);
    cout<<"\nQueue is Empty? "<<q.isEmpty();
    
    cout<<"\nQueue is FUll? "<<q.isFull();
    
    cout<<"\nElement is at Top Position : "<<q.peek();
    cout<<"\nElement removed from Queue : "<<q.remove();
    cout<<"\nElement removed from Queue : "<<q.remove();
    cout<<"\nElement removed from Queue : "<<q.remove();
    q.insert(30);
    return 0;
}
