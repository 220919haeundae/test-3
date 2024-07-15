package com.kh.practice.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MapPractice {
	/*
	 * * Map<K, V> 특징
	 *   : key - value 형식으로 데이터를 저장(관리)
	 *   	+ key에 해당하는 데이터 : 중복 허용하지 않음 (Set 방식)
	 *   	+ value에 해당하는 데이터 : key값이 중복되지 않은 경우 중복 허용 (List방식)
	 *   
	 * * Map의 메소드
	 *   [1] 데이터 추가 : put(키에 해당하는 값, 밸류에 해당하는 값) 	// C
	 *   [2] 데이터 삭제 : remove(키에 해당하는 값)				// D
	 *   [3] 데이터 조회 : get(키에 해당하는 값)					// R
	 *   [4] 키 목록 조회 : KeySet()							// R
	 *   [5] 데이터 길이 조회 : size()							// R
	 */
	public static void main(String[] args) {
//		hashMapTest();
		propertiesTest();
		
	}
	
	public static void hashMapTest() {
		// HashMap 객체 선언 및 생성
		// key - 정수형 데이터, Value - 문자열 데이터
		Map<Integer, String> hashMap = new HashMap<>();
		
		// Map 구조에 데이터를 저장(추가) : put(key, value);
		hashMap.put(1000, "프리티엄..");
		hashMap.put(1001, "종군당");
		hashMap.put(1002, "ㄸ피하 기다운 로드");
		
		// 키 목록 조회 : KeySet()
		Set<Integer> keySet = hashMap.keySet();
		for(Integer key : keySet) {
			System.out.println(key);
		}
		
		for(Integer key : keySet) {
			System.out.println(key + " : " + hashMap.get(key));
		}
		
		// "E피하 기다운 로드" 데이터 제거
		hashMap.remove(1002);
		
		//Iterator 객체를 사용하여 조회
		
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i + hashMap.get(i));
		}
		
		// entrySet() : key + value 세트의 집합
		
		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		
		Iterator<Entry<Integer, String>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Entry<Integer, String> entry = entryIt.next();
			System.out.println(entry);
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
	}
	
	public static void propertiesTest() {
		//Properties : Map 계열의 콜렉션 --> key + value 한 쌍으로 데이터 저장(관리)
		Properties prop = new Properties();
		
		prop.put("List", "ArrayList");
		prop.put("Set", "HashSet");
		prop.put("Map", "HashMap");
		prop.put("Map", "Properties");
		
		System.out.println(prop);
		// => 저장 순서 x, key 값은 중복되지 않음! (같은 키값인 경우 덮어씌워짐)
		
		/*
		 * Properties : 주로 저장된 데이터를 파일에 출력 또는 입력하여 사용
		 * - store(), load() 메소드를 사용
		 */
		
		Properties prop2 = prop;
		
		try {
			// store : Properties에 저장된 데이터(key=value)를 파일형태로 저장할 때 사용하는 메소드
			prop2.store(new FileOutputStream("test.properties"), "propertiesTest");
			prop2.storeToXML(new FileOutputStream("test.xml"), "xmlTest", "UTF-8");
			prop2.load(new FileInputStream("test.properties"));
			prop2.loadFromXML(new FileInputStream("test.xml"));
		}catch(IOException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
		
		
		
	}

}
