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

class DStack
{
    Node * top;
    public:
    DStack()
    {
        top=NULL;
    }
    void push(int no)
    {
        std::cout<<"\nPush "<<no;
        Node *newnode=new Node(no);
        newnode->next=top;
        top=newnode;
    }
    void pop()
    {
        Node *t=top;
        if (top==NULL)
            std::cout<<"\nStack is Empty...unable to pop";
        else
        {
            top=top->next;
            t->next=NULL;
            std::cout<<"\nFirst Node : "<<t->data<<" is deleted successfully...";
            delete t;
        }
    }
    int isEmpty()
    {
        if (top==NULL)
            return 1;
        else    
            return 0;
    }
    int peek()
    {
        if (top==NULL)
            return -1;
        else
            return (top->data);
    }
};

int main()
{
    std::cout<<"---------Dynamic Stack----------";
    DStack st;
    if (st.isEmpty()==1)
        std::cout<<"\nStack is empty";
    st.push(10);
    st.push(20);
    st.push(30);
    std::cout<<"\nTopmost element is "<<st.peek();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    
    return 0;

}
