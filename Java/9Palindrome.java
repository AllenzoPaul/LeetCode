class Solution{
    public boolean isPlindrome(int x) {
        if(x < 0){
            return false;
        }
        int n = x;
        int d = 0;
        int rev =0;
        while(n>0){
            d = n % 10;
            rev = rev * 10 + d;
            n = n/10;
        }
        if(x==rev){
            return true;
        }else{
            return false;
        }
    }
}