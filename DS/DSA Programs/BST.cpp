// Write C++ code for Binary Search Tree(BST)
#include <iostream>

class Node {
public:
    int data;
    Node* left;
    Node* right;
    
    Node(int value)
    {
        data=value;
        left=NULL;
        right=NULL;
    }
};

class BST
{
  private:
    Node *root;
    
  public:
     BST()
     {
         root=NULL;
     }
    Node * createBST()
    {
        int no;
        Node *t;
        std::cout<<"Enter the numbers upto 999";
        std::cin>>no;
        while(no!=999)
        {
            Node * newnode=new Node(no);
            if (root==NULL)
                root=newnode;
            else
            {
                t=root;
                while(true)
                {
                    if(no<t->data)
                    {
                        if(t->left==NULL)
                        {
                            t->left=newnode;
                            break;
                        }
                        else
                            t=t->left;
                    }
                    else
                    {
                        if(t->right==NULL)
                        {
                            t->right=newnode;
                            break;
                        }
                        else
                            t=t->right;
                    }
                }//while
            }//else
            std::cin>>no;
        }//while      
        return root;
    }//createBST
    
    void preorder(Node *t)
    {
        if(t!=NULL)
        {
            std::cout<<t->data<<"-->";
            preorder(t->left);
            preorder(t->right);
        }
    }
      void inorder(Node *t)
    {
        if(t!=NULL)
        {
            inorder(t->left);
            std::cout<<t->data<<"-->";
            inorder(t->right);
        }
    }
      void postorder(Node *t)
    {
        if(t!=NULL)
        {
            postorder(t->left);
            postorder(t->right);
            std::cout<<t->data<<"-->";
        }
    }
    
};


int main() {
    // Write C++ code here
    std::cout << "----------------Binary Search Tree--------------- ";
    BST tree;
    std::cout<<"\n";
    Node * root=tree.createBST();
    std::cout<<"\nInorder Traversal : ";
    tree.inorder(root);
    std::cout<<"\nPreorder Traversal : ";
    tree.preorder(root);
    std::cout<<"\nPostorder Traversal : ";
    tree.postorder(root);
  
    return 0;
}

