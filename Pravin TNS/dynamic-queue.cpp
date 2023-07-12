//demonstrate the program of dynamic queue
#include<iostream.h>
#include<conio.h>

struct node
{
      int data;
      node *next;
};

class queue
{
      node *rear,*front;
public:
      queue()
      { rear=NULL;front=NULL;}
      void qinsert();
      void qdelete();
      void qdisplay();
      ~queue();
};

void queue::qinsert()
{
      node *temp;
      temp=new node;
      cout<<"Data :";
      cin>>temp->data;
      temp->next=NULL;
      if(rear==NULL)
      {
            rear=temp;
            front=temp;
      }
      else
      {
            rear->next=temp;
            rear=temp;
      }
}

void queue::qdelete()
{
      if(front!=NULL)
      {
            node *temp=front;
            cout<<front->data<<"deleted \n";
            front=front->next;
            delete temp;
            if(front==NULL)
                  rear=NULL;
      }
      else
            cout<<"Queue Empty..";
}

void queue::qdisplay()
{
      node *temp=front;
      while(temp!=NULL)
      {
            cout<<temp->data<<endl;
            temp=temp->next;
      }
}

queue::~queue()
{
      while(front!=NULL)
      {
            node *temp=front;
            front=front->next;
            delete temp;
      }
}

void main()
{
      queue obj; char ch;
      do
      {
            cout<< "i. insert\nd. Delete\ns. Display\n q. quit ";
            cin>>ch;
            switch(ch)
            {
                  case 'i' : obj.qinsert();break;
                  case 'd' : obj.qdelete();break;
                  case 's' : obj.qdisplay();
            }
      }while(ch!='q');
}