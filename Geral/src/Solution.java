
public class Solution {
	
	
		private String print;
		
		
	    public void solution(int N) {
	        // write your code in Java SE 8
	    	
	    	for (int i = 1; i <= N; i++) {  		
	    		System.out.println(print(i));
				
			}
	    }

		public String print(int n) {
			print = "";
			
			if(divisibleBy(n, 3, "Fizz") |
				divisibleBy(n, 5, "Buzz") |
				divisibleBy(n, 7, "Woof"))
				return print;
			else
				return new Integer(n).toString();
		}

		public boolean divisibleBy(int n, int i, String text) {
			if(n % i == 0){
				print+=text;
				return true;
			}
			return false;
		}
	}


