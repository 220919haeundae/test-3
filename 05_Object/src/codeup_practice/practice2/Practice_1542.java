package codeup_practice.practice2;

public class Practice_1542 {
	
	int n;
	
	public Practice_1542() {}
	
	public String prime_Composite(int n) {
		
		this.n = n;
		
		int count = 0;
		
		for(int i = 1; i <= n/Math.sqrt(n); i++) {
			if(n%i == 0) {
				count += 1;
			}
		}
		
		if(count > 1) {
			return "composite";
		} else {
			return "prime";
		}
		
	}
}