#include<iostream>

class Node
{
    public:
    int data;
    Node *next;
    Node(int data)
    {
        this->data=data;
        this->next=NULL;
    }
};

class DQueue
{
    Node * front, *rear;
    public:
    DQueue()
    {
        front=NULL;
        rear=NULL;
    }
    void insert(int no)
    {
        std::cout<<"\nInsert "<<no;
        Node *newnode=new Node(no);
        if (isEmpty()==1)
        {
            rear=newnode;
            front=rear;
        }
        else
        {
            rear->next=newnode;
            rear=newnode;
        }
    }
    void remove()
    {
        Node *t=front;
        if (t==NULL)
            std::cout<<"\nQueue is Empty...unable to remove";
        else
        {
            front=front->next;
            t->next=NULL;
            std::cout<<"\n"<<t->data<<" is deleted successfully...";
            delete t;
        }
    }
    int isEmpty()
    {
        if (front==NULL && rear==NULL)
            return 1;
        else    
            return 0;
    }
    int peek()
    {
        if (front==NULL)
            return -1;
        else
            return (front->data);
    }
};

int main()
{
    std::cout<<"---------Dynamic Queue----------";
    DQueue q;
    if (q.isEmpty()==1)
        std::cout<<"\nQueue is empty";
    q.insert(10);
    q.insert(20);
    q.insert(30);
    std::cout<<"\nTopmost element is "<<q.peek();
    q.remove();
    q.remove();
    q.remove();
    q.remove();
    return 0;

}
