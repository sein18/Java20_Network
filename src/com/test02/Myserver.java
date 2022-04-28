package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Myserver {
	public static void main(String[] args) throws IOException {
		//서버 생성(소켓)
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("서버");
		
		
		//받을 배열 생성
		byte buff[] = new byte[1024];
		
		//패킷을 받음
		DatagramPacket receiveP = new DatagramPacket(buff,buff.length);
		
		ds.receive(receiveP);
		
		System.out.println(new String( receiveP.getData() ));
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
	