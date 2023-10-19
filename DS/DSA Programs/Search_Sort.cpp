#include <iostream>
#define SIZE 10
class Arrays
{
   
    public:
     int data[SIZE];
        Arrays()
        {
            for(int i=0;i<SIZE;i++)
                data[i]=10-i;
        }
        int linear_search(int element)
        {
            for(int i=0;i<SIZE;i++)
            {
                if(data[i]==element)
                    return i;
            }
            return -1;
        }
        int binary_search(int element)
        {
            int mid;
            int low=0;
            int high=SIZE;
            
            while(low<high)
            {
                mid=(low+high)/2;
                if (data[mid]==element)
                    return mid;
                else
                if(element>data[mid])
                    low=mid+1;
                else
                    high=mid;
            }
            return -1;
        }
        void print()
        {
            for(int i=0;i<SIZE;i++)
                std::cout<<data[i]<<" ";
        }
        void bubble_sort()
        {
            for(int i=SIZE-1;i>0;i--)
            {
                for(int j=0;j<i;j++)
                {
                    if(data[j]<data[j+1])
                    {
                        int t=data[j];
                        data[j]=data[j+1];
                        data[j+1]=t;
                    }
                }
            }
        }
        void selection_sort()
        {
            for(int i=0;i<SIZE-1;i++)
            {
                for(int j=i+1;j<SIZE;j++)
                {
                    if(data[i]>data[j])
                    {
                        int t=data[i];
                        data[i]=data[j];
                        data[j]=t;
                    }
                }
            }
        }
        void insertion_sort()
        {
            int j,temp;
            for(int i=1;i<SIZE;i++)
            {
                temp=data[i];
                j=i-1;
                while(j>=0 && data[j]>=temp)
                {
                    data[j+1]=data[j];
                    j=j-1;
                }
                data[j+1]=temp;
            }
        }
        void merge(int data[], int si,int mid, int ei)
        {
            int *temp=new int[ei-si+1];
            int i = si;
            int j= mid+1;
            
            int k = 0;
          
            while(i <= mid && j <= ei){
            if(data[i] < data[j]){
                temp[k]=data[i];
                i++;
            }
            else{
                temp[k]=data[j];
                j++;
            }
            k++;
            }

            // if some elements are remain in left side then we have to add them after comparing and adding
            while(i <= mid){
                temp[k++] = data[i++];
            }
// if some elements are remain in right side then we have to add them after comparing and adding
            while(j <= ei){
                temp[k++] = data[j++];
            }
            // copy the whole temp arr into the original array
            for(k=0, i=si; k < (ei-si+1); k++ , i++){
                data[i]=temp[k];
            }
        }
        void mergesort(int data[], int si, int ei)
        {
            if(si >= ei)
                return;
            else
            {
                int mid = si + (ei-si)/2;
                mergesort(data, si, mid);
                mergesort(data,mid+1,ei);
                merge(data,si,mid,ei);
            }
        }
        int partition(int data[], int si, int ei)
        {
            int pivot = data[ei];
          
        int i = si-1; // it will create space for element swapping
        for(int j = si; j <ei; j++){
            if(data[j] <= pivot){
                i++;
                //swapping
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        data[ei] = data[i];
        data[i] = temp;
        return i;

        }
    void quicksort(int arr[] , int si , int ei){
        if(si >=ei){
            return;
        }
        //last element
        int pidx = partition(arr, si, ei);
        //left part
        quicksort(arr, si, pidx-1);
        //right part
        quicksort(arr, pidx+1, ei);
    }
};
int main()
{
    std::cout<<"-----Operations on Array-------\n";
    Arrays a1;
    a1.print();
    int element;
    std::cout<<"\nEnter the element to be search...";
    std::cin>>element;

    std::cout<<"\n----------Using Linear Search--------\n";
    int pos=a1.linear_search(element);
    if (pos!=-1)
        std::cout<<element<<" is found at "<<pos;
    else    
        std::cout<<element<<" not found...";
    std::cout<<"\n----------Using Binary Search--------\n";
    pos=a1.binary_search(element);
    if (pos!=-1)
        std::cout<<element<<" is found at "<<pos;
    else    
        std::cout<<element<<" not found...";
    /*std::cout<<"\n------------Using Bubble Sorting---------------\n";
    a1.bubble_sort();
    a1.print();
    std::cout<<"\n------------Using Selection Sorting---------------\n";
    a1.selection_sort();
    a1.print(); 
    std::cout<<"\n------------Using Insertion Sorting---------------\n";
    a1.insertion_sort();
    a1.print();
    
    std::cout<<"\n------------Using Merge Sorting---------------\n";
    a1.mergesort(a1.data,0,SIZE-1);
    a1.print();*/

    std::cout<<"\n------------Using Quick Sorting---------------\n";
    a1.quicksort(a1.data,0,SIZE-1);
    a1.print();


    return 0;
}