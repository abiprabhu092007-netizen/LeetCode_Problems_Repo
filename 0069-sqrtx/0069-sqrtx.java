class Solution {
    public int mySqrt(int x) {
      int j =0;
      for(int i=1; i<=x; i++){
        if((long)i*i <= x){
           j = i;
        }
        else{
            break;
        }
        
      }
      return j;
      }
    }
