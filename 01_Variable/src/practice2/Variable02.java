package practice2;

import java.util.Calendar;

public class Variable02 {

	public static void main(String[] args) {
		
		//1. 대소문자가 구분된다.(길이 제한이 없다.)
		int num = 10;
		int nuM = 20;
		
		System.out.println(num);
		System.out.println(nuM);
		
		//2. 예약어(true, final, String)을 사용하면 안 된다.
		//int class;
		
		//3. 숫자로 시작하면 안 된다.
		//int 1age;
		int age1;
		
		//4. 특수문자는"_", "$"만을 허용한다.
		//String sh@rp;
		String sh$rp;
		
		//5. 카멜케이스 : 소문자로 시작하여 다음 단어들의 첫 글자들을 대문자로 작성하는 관례적 작성법
		//회원이름
		String userName; // O
		String username; // X (문법상 오류는 아니나, 추후 어떤 환경에서는 문제가 발생할 가능성이 있음)
		
		
		//제품(product)의 번호(id) => 정수형
		int productId;
		
		//책(book) 제목(title) => 문자열
		String bookTitle;

		
		
	}
}
