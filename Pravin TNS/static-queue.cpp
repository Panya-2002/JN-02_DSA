

#include <iostream>
#define SIZE 4
using namespace std;

class Queue
{
    int data[SIZE];
    int front;
    int rear;

public:
    Queue()
    {
        front = -1;
        rear = -1;
    }
    void insert(int element)
    {
        if (isFull() == 1)
            cout << "Queue is Full...";
        else
        {
            if (isEmpty() == 1)
                front = 0;
            rear = (rear + 1) % SIZE;
            data[rear] = element;
        }
    }
    int remove()
    {
        if (isEmpty() == 1)
            return -1;
        else
        {
            int element = data[front++];
            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
                front = (front + 1) % SIZE;
            return element;
        }
    }
    int isEmpty()
    {
        if (front == -1 && rear == -1)
            return 1;
        else
            return 0;
    }
    int isFull()
    {
        if ((rear + 1) % SIZE == front)
            return 1;
        else
            return 0;
    }
    int peek()
    {
        if (isEmpty() == 1)
            return -1;
        else
            return data[front];
    }
};

int main()
{
    cout << "Static Implementation of Queue";
    Queue q;
    q.insert(10);
    q.insert(20);
    q.insert(30);
    q.insert(40);
    q.insert(50);
    cout << "\nQueue is Empty? " << q.isEmpty();
    cout << "\nQueue is Full? " << q.isFull();
    cout << "\nElement is at Front: " << q.peek();
    cout << "\nElement removed from queue: " << q.remove();
    cout << "\nElement removed from queue: " << q.remove();
    cout << "\nElement removed from queue: " << q.remove();

    return 0;
}

