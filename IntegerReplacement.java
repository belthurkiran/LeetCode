public class IntegerReplacement {
    public int integerReplacement(int n) {
        int count =0;
        while(n!=1){
            if(n%2==0){
                n>>>=1;
            }
            else{
                if(n==3 || ((n&3)==1)){
                n-=1;
                }
                else{
                    n+=1;
                }
            }
            count++;
        }
        return count;
    }
}
