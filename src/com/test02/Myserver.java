package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Myserver {
	public static void main(String[] args) throws IOException {
		//���� ����(����)
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("����");
		
		
		//���� �迭 ����
		byte buff[] = new byte[1024];
		
		//��Ŷ�� ����
		DatagramPacket receiveP = new DatagramPacket(buff,buff.length);
		
		ds.receive(receiveP);
		
		System.out.println(new String( receiveP.getData() ));
		
		//����
		ds.close();
		ds.disconnect();
	}
}
	