import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		
		TestNum tn1 = new TestNum(10);
		TestNum tn2 = new TestNum(20);
		TestNum tn3 = new TestNum(30);
		TestNum tn4 = new TestNum(40);
		TestNum tn5 = new TestNum(50);
		TestNum tn6 = new TestNum(60);
		TestNum tn7 = new TestNum(70);
		TestNum tn8 = new TestNum(80);
		TestNum tn9 = new TestNum(90);
		TestNum tn10 = new TestNum(100);
		
		
		Set<TestNum> set = new HashSet<>();
		
		set.add(tn1);
		set.add(tn2);
		set.add(tn3);
		set.add(tn4);
		set.add(tn5);
		set.add(tn6);
		set.add(tn7);
		set.add(tn8);
		set.add(tn9);
		set.add(tn10);
		
		Iterator<TestNum> strIter = set.iterator();
		while (true) {
			if(strIter.hasNext()) {
				System.out.println(strIter.next().inform());
			} else {
				break;
			}
			
		}
		
	}

}
