//Program to convert infix expression into prefix
#include <iostream>
#include<string.h>
#define SIZE 20
using namespace std;

class Stack{
    char data[SIZE];
    int top;
    
    public:
    Stack()
    {
        top=-1;
    }
    void push(char element){
        if (isFull()==1)
            cout<<"Stack is full !!!";
        else
            data[++top]=element;
    }
    char pop(){
        if (isEmpty()==1)
            return '*';
        else
            return data[top--];
    }
     int isEmpty(){
        if (top==-1)
            return 1;
        else
            return 0;
    }
    int isFull(){
        if (top==SIZE-1)
            return 1;
        else
            return 0;
    }
    char peek(){
        if (isEmpty()==1)
            return '*';
        return data[top];
    }
};

int getPrecedence(char ch)
{
    if(ch=='+'  || ch=='-')
        return 1;
    else if (ch=='*' || ch=='/')
        return 2;
    else if (ch=='^')
        return 3;
    else
        return 0;
}
int isOperator(char ch)
{
    if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^')
        return 1;
    else
        return 0;
}

int main()
{
    char infix[20], prefix[20];
    cout<<"-------------Infix to Prefix-----------------";
    Stack st;
    cout<<"Enter the infix expression : ";
    cin>>infix;
    int i=0, j=0;
    //Reverse a string
    strcpy(infix,strrev(infix));
   
    cout<<"Infix : "<<infix;
    j=0;
    for(int i=0;infix[i]!='\0';i++)
    {
        char symbol = infix[i];
        if (isalpha(symbol) || isdigit(symbol))
            prefix[j++]=symbol;
        else if (symbol==')')
            st.push(symbol);
        else if (symbol=='(')
        {
            while(st.peek()!=')' )
                prefix[j++]=st.pop();
            st.pop();
        }
        else if (isOperator(symbol)==1)
        {
            if (st.isEmpty()==1)
                st.push(symbol);
            else if (st.peek()==')')
                st.push(symbol);
            else if (getPrecedence(symbol)>=getPrecedence(st.peek()))
                st.push(symbol);
            else
            {
                while(getPrecedence(symbol)<getPrecedence(st.peek()) && st.isEmpty()!=1)
                {
                    prefix[j++]=st.pop();
                }
                st.push(symbol);
            }            
        }
        
    }
    while(st.isEmpty()!=1)
    {
        prefix[j++]=st.pop();
    }
    prefix[j]='\0';


   strcpy(prefix,strrev(prefix));
    cout<<"\nPrefix Expression is : "<<prefix;
    return 0;
}