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

class LinkedList
{
    Node *head;
    public:
    LinkedList()
    {
        head=NULL;
    }
    void createList()
    {
        int no;
        Node *newnode;
        std::cout<<"Enter numbers upto 999 : " ;
        std::cin>>no;
        while(no!=999)
        {
            newnode=new Node(no);
            if(head==NULL)
                head=newnode;
            else
            {
                Node *t=head;
                while(t->next!=NULL)
                    t=t->next;
                t->next=newnode;
            }
            std::cin>>no;
        }
    }
    void display()
    {
        Node *t=head;
        if (head==NULL)
            std::cout<<"\nList is Empty...";
        else
        {
            t=head;
            std::cout<<"\nList is as follows: ";
            while(t->next!=NULL)
            {
                std::cout<<t->data<<"->";
                t=t->next;                
            }
             std::cout<<t->data<<"\n";
        }
    }
    void insertFirst(int element)
    {
        std::cout<<"insert "<<element<<" at first";
        Node *newnode=new Node(element);
        newnode->next=head;
        head=newnode;
    }
    void insertLast(int element)
    {
        Node *newnode=new Node(element);
        Node *t=head;
        std::cout<<"\nInsert "<<element<<" at last";
        while(t->next!=NULL)
            t=t->next;
        t->next=newnode;
    }
    void deleteFirst()
    {
        Node *t=head;
        head=head->next;
        t->next=NULL;
        std::cout<<"\nFirst Node : "<<t->data<<" is deleted successfully...";
        delete t;
    }
    void deleteLast()
    {
        Node *t=head;
        Node *q=t;
        while(t->next!=NULL)
        {
	        q=t;
	        t=t->next;
        }
        q->next=NULL;
        std::cout<<"\nLast Node : "<<t->data<<" is deleted successfully...";
        delete t;

    }
};


int main()
{
    std::cout<<"\nSingly Linked List\n";
    LinkedList list;
    list.createList();
    list.display();
    list.insertFirst(100);
    list.display();
    list.insertLast(600);
    list.display();
    list.deleteFirst();
    list.deleteLast();
    list.display();
    return 0;
}