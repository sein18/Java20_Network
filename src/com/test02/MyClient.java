package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MyClient {
	public static void main(String[] args) throws IOException {
		// 소켓    UDP
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트");

		// 보낼 data
		byte buff[] = "연습입니다.".getBytes();

		// 패킷 생성
		DatagramPacket sendP = 
				new DatagramPacket(buff, 
							buff.length, 
							InetAddress.getByName("localhost"), 9999);

		// 보낸다.(패킷)
		ds.send(sendP);

		ds.close();
		ds.disconnect();
		
	}
}
