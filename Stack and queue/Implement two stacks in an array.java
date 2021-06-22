class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        
        if(sq.top1<sq.size/2)
        {
            sq.top1++;
            sq.arr[sq.top1]=x;
        }
        
         
        
        
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        
        if(sq.top2>sq.size/2)
        {
            sq.top2--;
            sq.arr[sq.top2]=x;
        }
        
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        if(sq.top1>=0)
        {
            int yo=sq.arr[sq.top1];
            sq.top1--;
            return yo;
        }
        else
        {
            return -1;
        }
        
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
         if(sq.top2<sq.size)
        {
            int yo2=sq.arr[sq.top2];
            sq.top2++;
            return yo2;
        }
        else
        {
            return -1;
        }
        
    }
}