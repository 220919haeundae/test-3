package com.kh.practice.list.library.view;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	
	public static void main(String[] args) {
		
		
		//	InetAddress : IP주소를 표현하고, 호스트 이름과 IP 주소 간의 변환을 처리한다.
		try {
			InetAddress ia = InetAddress.getLocalHost();
			String host = ia.getHostName();
			String ip = ia.getHostAddress();
			String host_ip = ia.toString();
			
			System.out.println(host);
			System.out.println(ip);
			System.out.println(host_ip);
		} catch(Exception e) {}
		
		
		//	SocketAddress (상속)-> InetSocketAddress : 소켓의 주소를 나타내며,
		// 											특정 프로토콜의 주소를 표현한다..
		SocketAddress sa = new InetSocketAddress(50001);
		

		//	Socket : 네트워크 통신을 위한 클라이언트와 서버 간의 접점을 제공하는 클래스로, 데이터 전송을 담당한다.
		
		
		// ServerSocket : 클라이언트의 연결 요청을 수락하고, 연결을 처리할 때 사용
		try {
			ServerSocket serverSocket = new ServerSocket(50001);
			Socket socket = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}

