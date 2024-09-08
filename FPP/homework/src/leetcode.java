import java.util.Arrays;

public class leetcode {
		public static void main(String[] args) {
			int[] a = {1000000000,1000000000};
			System.out.print(maxPossibleScore(a,1000000000));
			
		}
	    static public boolean check (int[] start,long d,long m){
	        long tmp = start[0];
	        for (int i=1;i<start.length;i++){
	            if ((tmp+m)>start[i]+d){
	                return false;
	            }
	            tmp = Math.max(start[i],tmp+m);
	        }
	        return true;
	    }
	    static public long maxPossibleScore(int[] start, int d) {
	        Arrays.sort(start);
	        long s = 0;
	        long e = start[start.length-1]+d;
	        long mid = 0;
	        while(s<e){
	        	mid =  (e-s+1)/2+s;
	            if (check(start,  d,  mid)){
	                s = mid;
	            }else{
	                e = mid-1;
	            }
	        }
	        return s;
	        
	    }
	}

