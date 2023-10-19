//Program to demonstrate Singly Linked List

#include <iostream>
class Node
{
    public:
        int data;
        Node *next;
    
        Node(int no)
        {
            data=no;
            next=NULL;
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
    void create(){
        int no;
        Node *newnode, *t;
        std::cout<<"Enter the numbers upto 999 : "  ;
        std::cin>>no;
        while(no!=999)
        {
            newnode=new Node(no);
            if (head==NULL)
                head=newnode;
            else
            {
                t=head;
                while(t->next!=NULL)
                    t=t->next;
                t->next=newnode;
            }
            std::cin>>no;
        }
    }
    void display(){
        Node *t=head;
        if (head==NULL)
            std::cout<<"\nList is Empty.....";
        while(t!=NULL)
        {
            std::cout<<t->data<<"->";
            t=t->next;
        }
    }
    void insertFirst(int no)
    {
        Node *newnode;
        newnode=new Node(no);
        newnode->next=head;
        head=newnode;
    }
    void insertLast(int no)
    {
        Node *newnode, *t;
        newnode=new Node(no);
        t=head;
        while(t->next!=NULL)
            t=t->next;
        t->next=newnode;
    }
    void deleteFirst()
    {
        Node *t;
        t=head;
        head=head->next;
        std::cout<<"\n"<<t->data<<" is deleting....";
        delete t;
    }
    void deleteLast()
    {
        Node *t, *p;
        t=head;
        p=t;
        while(t->next!=NULL)
        {
            p=t;
            t=t->next;
        }
        p->next=NULL;
        std::cout<<"\n"<<t->data<<" is deleting....";
        delete t;
    }
    void insertAfterGivenNode(int no, int n)
    {
        Node *newnode,*t;
        newnode=new Node(no);
        if (head==NULL)
        {
            std::cout<<"***************";
            head=newnode;
        }
        else
        {
            t=head;
            while(t->data!=n && t!=NULL)
            {
                t=t->next;
            }
            if (t==NULL)
                std::cout<<"Given node not present in the list...";
            else
            {
                newnode->next=t->next;
                t->next=newnode;
            }
        }
    }

};
int main() {
    int no,n;
    std::cout << "--------------Singly LinkedList-------------!";
    LinkedList list;
    list.create();
    std::cout<<"\nList is as follows : \n";
    list.display();
    std::cout<<"Enter the number to be inserted at the begining : ";
    std::cin>>no;
    list.insertFirst(no);
    std::cout<<"\nList is as follows : \n";
    list.display();
    std::cout<<"Enter the number to be inserted at the End : ";
    std::cin>>no;
    list.insertLast(no);
    std::cout<<"\nList is as follows : \n";
    list.display();
    list.deleteFirst();
    std::cout<<"\nList is as follows : \n";
    list.display();
    list.deleteLast();
    std::cout<<"\nList is as follows : \n";
    list.display();
    std::cout<<"Enter the number to be inserted : ";
    std::cin>>no;
    std::cout<<"Enter the number after which newnode to be inserted : ";
    std::cin>>n;
    list.insertAfterGivenNode(no,n);
    std::cout<<"\nList is as follows : \n";
    list.display();
    return 0;
}