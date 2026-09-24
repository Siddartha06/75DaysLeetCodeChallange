class Solution {

    public int search(int  n , int  a, int b){
        if(n==0){
            return a;
        }
    int c = a +b;
      
    return search( n-1, b, c );

    }
    public int fib(int n) {
       int result = search( n, 0, 1);
       return result;
    }


}