package com.kh.practice.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	private static ServerSocket serverSocket = null;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
	private static Map<String, SocketClient> chatRoom = new HashMap<>();
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Server server = new Server();
		
		
		server.startServer();
		
		while(true) {
			String key = sc.nextLine();
			if(key.equals("q")) {
				break;
			}
			
		}
		
		server.stopServer();
		
	}
	
	public void startServer() {
		Thread thread = new Thread(() -> {
			try {
				serverSocket = new ServerSocket(50001);
				System.out.println("[서버] 시작");
				
				while(true) {
					Socket socket = serverSocket.accept();
					System.out.println("[서버] 클라이언트의 접속 요청을 수락함");
					SocketClient socketClient = new SocketClient(this, socket);
					
					
					threadPool.execute(() -> {
						try(DataInputStream dis = new DataInputStream(socket.getInputStream());
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());) {
						
							while(true) {
								String receiveMessage = dis.readUTF();
								System.out.println("[서버] 받은 메세지" + receiveMessage);
								
								if(receiveMessage.equals("q")) break;  // 클라이언트로 "q" 입력 시 현재 소켓 스레드의 실행 종료
								
								String message = receiveMessage;
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[서버] 받은 메세지 다시 보냄 : " + message);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
				}
				
				
			} catch(IOException e) {}
		});
		thread.start();
	}
		
	public static void stopServer() {
		try {
			threadPool.shutdownNow();
			serverSocket.close();
			System.out.println("[서버] 정상적으로 종료되었습니다.");
		} catch(IOException e) {}
		
		
	}
	
}
