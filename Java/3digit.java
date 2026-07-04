class Solution{
    public int reverse(int x) {
        if(x < 0){
            return 0;
        }
        int n = x;
        int d = 0;
        int rev = 0;
        while(n > 0){
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        System.out.println(rev);
        return rev;
    }
}