#include <iostream>
#define SIZE 6
using namespace std;

class Stack
{
    int data[SIZE];
    int top;

public:
    Stack()
    {
        top = -1;
    }
    void push(int element)
    {
        if (isFull() == 1)
            cout << "Stack is Full...";
        else
            data[++top] = element;
    }
    int pop()
    {
        if (isEmpty() == 1)
            return -1;
        else
            return data[top--];
    }
    int isEmpty()
    {
        if (top == -1)
            return 1;
        else
            return 0;
    }
    int isFull()
    {
        if (top == SIZE - 1)
            return 1;
        else
            return 0;
    }
    int peek()
    {
        if (isEmpty() == 1)
            return -1;
        else
            return data[top];
    }
};

int main()
{
    cout << "Static Implementation of Stack";
    Stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6)
    cout << "\nStack is Empty? " << st.isEmpty();
    cout << "\nStack is Full? " << st.isFull();
    cout << "\nElement is at Top Position: " << st.peek();
    cout << "\nElement removed from stack: " << st.pop();

    return 0;
}

