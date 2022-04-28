package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// ���� ����  TCP
		ServerSocket serverSocket = null;
		// ���ӵ� Ŭ���̾�Ʈ ����
		Socket serviceSocket = null;
		// ��� ��ü
		PrintWriter out = null;

		BufferedReader in = null;

		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("client�� ��ٸ��ϴ�.");

			try {
				serviceSocket = serverSocket.accept();
				System.out.println("client�� �����߽��ϴ�.");

				// client���� ���� ������ ���δ����� �о�
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));

				// �߹޾Ҵٶ�� �ٽ� ���� �ְڴ�.
				out = new PrintWriter(serviceSocket.getOutputStream(), true);

				String inputLine = null;
				while ((inputLine = in.readLine()) != null) {
					System.out.println("Ŭ���̾�尡 ���� �޽���" + inputLine);

					out.println(inputLine + " �� �޾Ҿ�!");
				}
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
