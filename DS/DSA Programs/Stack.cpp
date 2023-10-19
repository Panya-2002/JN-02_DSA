//Static implementation of Stack
#include<iostream>
#define SIZE 3

//define statck
class Stack
{
    int top;
    int data[SIZE];
    public:
        Stack()
        {
            top=-1;
        }
        void push(int element)
        {
            if (isFull()==1)
                std::cout<<"\nStack is full....unable to insert "<<element;
            else
            {
                top++;
                data[top]=element;
                std::cout<<element<<" is inserted successfully....\n";
            }
        }
        int isFull()
        {
            if (top==SIZE-1)
                return 1;
            else
                return 0;
        }
        int isEmpty()
        {
            if (top==-1)
                return 1;
            else
                return 0;
        }
        int pop()
        {
            int no=-1;
            if (isEmpty()==1)
                std::cout<<"\nStack is empty...";
            else
                no=data[top--];
            return no;            
        }
        int peek()
        {
            return data[top];
        }
};

int main()
{
    Stack st;
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    std::cout<<"\nElement at the top of stack is "<<st.peek(); 
    while(st.isEmpty()!=1)
        std::cout<<"\nElement removed from statck is "<<st.pop();
    
    st.pop();
    return 0;
}