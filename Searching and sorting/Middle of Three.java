class Solution{
    int middle(int A, int B, int C){
        int a[]=new int[3];
        a[0]=A;
        a[1]=B;
        a[2]=C;
        Arrays.sort(a);
        return a[1];
    }
}