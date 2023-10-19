/***************************************************************************
 *Program to demonstarte static implementation of Stack
*******************************************************************************/

#include <iostream>
#define SIZE 2
using namespace std;

class Stack
{
   int data[SIZE];
   int top;
   
   public:
    Stack()
    {
        top=-1;
    }
    void push(int element)
    {   
        if (isFull()==1)
            cout<<"Stack is FULL....";
        else
            data[++top]=element;
    }
    int pop()
    {   
        if (isEmpty()==1)
            return -1;
        else
            return data[top--];
    }
    int isEmpty()
    {
        if (top==-1)
            return 1;
        else
            return 0;
        
    }
    int isFull()
    {
        if (top==SIZE-1)
            return 1;
        else
            return 0;
    }
    int peek()
    {
        if (isEmpty()==1)
            return -1;
        else
            return data[top];
    }
};

int main()
{
    cout<<"Static Implementation of Stack \n";
    Stack st;
    st.push(10);
    st.push(20);
    st.push(30);
    cout<<"\nStack is Empty? "<<st.isEmpty();
    
    cout<<"\nStack is FUll? "<<st.isFull();
    
    cout<<"\nElement is at Top Position : "<<st.peek();
    cout<<"\nElement removed from stack : "<<st.pop();
    cout<<"\nElement removed from stack : "<<st.pop();
    cout<<"\nElement removed from stack : "<<st.pop();

    return 0;
}
