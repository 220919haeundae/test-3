package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) {
		try {
			InetAddress ia1 = InetAddress.getLocalHost();
			System.out.println(ia1.getHostAddress());
			System.out.println(ia1.getHostName());  // 도메인 네임
			InetAddress ia2 = InetAddress.getByName("www.naver.com");
			System.out.println(ia2.getHostName());  // 도메인 네임
			System.out.println(ia2.getCanonicalHostName()); 
			System.out.println(ia2.getHostAddress());
			InetAddress ia3 = InetAddress.getLoopbackAddress();
			
			System.out.println(ia3.getCanonicalHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
