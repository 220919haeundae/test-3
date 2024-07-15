
public class TestNum {
	
	private int num;
	
	public TestNum(int n) {
		num = n;
	}
	
	@Override
	public int hashCode() {
		return num%3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == (((TestNum)obj).num)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int inform() {
		return num;
	}
}
