package com.kh.practice.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		
		// 사용자에게 메시지 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("전송 메시지 입력: ");
		
		String message = sc.nextLine();
		
		// -----------------
		// 서버의 IP주소, 프로그램의 Port번호(8090)
		try (DatagramSocket ds = new DatagramSocket()) {
			
			InetAddress iNet = InetAddress.getLocalHost();
			int port = 8090;
			
			//데이터 통신을 위한 pocket 객체 생성
			DatagramPacket dp = new DatagramPacket(message.getBytes(),
					message.getBytes().length,
					iNet,
					port);
			
			ds.send(dp);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SocketException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}	
}

