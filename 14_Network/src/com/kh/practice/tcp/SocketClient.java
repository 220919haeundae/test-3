package com.kh.practice.tcp;

import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
	private Server server;
	private Socket socket;
	private String ip = ((InetSocketAddress)socket.getRemoteSocketAddress()).toString();

	public SocketClient(Server server, Socket socket) {
		
		this.server = server;
		this.socket = socket;
		
	}

}