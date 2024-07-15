package com.kh.practice.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 50001);
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());) {
			while(true) {
				String sendMessage = sc.nextLine();
				
				dos.writeUTF(sendMessage);
				dos.flush();
				
				String receiveMessage = dis.readUTF();
				System.out.println("서버로부터 받은 메세지 : " + receiveMessage);
			}
		} catch(IOException e) {}
			
	}
}
