package com.kh.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Date : 날짜, 시간 관련 클래스
		Date date = new Date();
		
		System.out.println((date.getMonth()+1) // => .getMonth() : int => 0 ~ 11까지 월 정보를 반환
						+ "/" + date.getDate());
		//java.time.LocalDateTime
		/* [객체 생성]
		 *  - 현재 날짜시간 기준으로 생성 : LocalDateTime.now();
		 *  - 년, 월, 일 입력하여 생성 : LocalDateTime.of(LocalDate.of(int year, int month, int dayOfMonth),
		 *  										LocalTime.of(int hour, int minute));
		 *  [날짜정보 조회]
		 *  - 월(month) : 변수명.getMonth()		//영어로 월 정보를 반환
		 *  				변수명.getMonthValue 		// 숫자로 월 정보를 반환
		 *  - 일(day)	: 변수명.getDayOfMonth()	//월 기준 일 정보를 반환
		 *  			: 변수명.getDayOfYear()	//연 기준 일 정보를 반환
		 */ 
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date2.getMonth());
		System.out.println(date2.getMonthValue() + "/" + date2.getDayOfMonth());
		
		
		//생일 출력
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(1997, 1, 2), LocalTime.of(16, 0));
		System.out.println("[1]" + birth);
		
		// ---------------------------
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
		System.out.println("[2]" + sdf.format(date));
		
		// 1) LocalDateTime -> Date 변경 후 포맷 적용
		
		Date dateOfBirth = java.sql.Timestamp.valueOf(birth);
		System.out.println("[3]" + sdf.format(dateOfBirth));
		
		// 2) DateTimeFormatter 이용
		
		System.out.println("[4]" + birth.format(DateTimeFormatter.ofPattern("YYY-MM-dd hh:mm:ss")));
		
		
		// 오늘 퇴근까지 몇 시간 남았는지?
		LocalDateTime today = LocalDateTime.now();

		System.out.println("올해는" + (366-today.getDayOfYear()) + "일 남았구나...");
		
		//오늘 퇴근까지 몇시간 남았는지?
		System.out.println("오늘 퇴근까지 " + (18 - today.getHour()) + "시간 남았구나.");
		
		
		
	}

}