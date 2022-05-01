# 네트워크 (Network)

* __네트워크 (network)__ : 여러 대의 컴퓨터를 통신 회선으로 연결한 것(홈 네트워크, 지역 네트워크, 인터넷 등이 해당)
* __서버와 클라이언트__
  * 네트워크로 연결된 컴퓨터간의 관계를 역할(role)로 구분한 개념 
  * 서버는 서비스를 제공하는 프로그램으로 클라이언트의 연결을 수락하고 요청 내용을 처리 후 응답을 보내는 역할 
  * 클라이언트는 서비스를 받는 프로그램으로 네트워크 데이터를 필요로 하는 모든 어플리케이션이 해당 됨

* __IP주소__
  * 네트워크 상에서 컴퓨터를 식별하는 번호로 네트워크 어댑터(랜카드)마다 할당 되어 있다.

* __포트(Port)__
  * 같은 컴퓨터 내에서 프로그램을 식별하는 번호로 클라이언트는 서버 연결 요청 시 IP주소와 포트 번호를 알아야 함

---

* __InetAddress 클래스__

  * IP주소를 다루기 위해 자바에서 제공하는 클래스

  |                   __메소드__                   |                          __설명__                          |
  | :--------------------------------------------: | :--------------------------------------------------------: |
  |              byte[] getAddress()               |                  IP주소를 byte배열로 리턴                  |
  | static InetAddress[] getAllByName(String host) | 도메인 명에 지정된 모든 호스트의 IP주소를 배열에 담아 반환 |
  |  static InetAddress getByAddress(byte[] addr)  |              byte배열을 통해 IP주소를 얻는다.              |
  |   static InetAddress getByName(String host)    |             도메인 명을 통해 IP주소를 얻는다.              |
  |          String getCanonicaHostName()          |         FQDN(Full Qualified Domain Name)을 얻는다.         |
  |            String getHostAddress()             |                호스트의 IP주소를 반환한다.                 |
  |              String getHostName()              |                 호스트의 이름을 반환한다.                  |
  |       static InetAddress getLocalHost()        |              지역호스트의 IP주소를 반환한다.               |
  |          boolean isMulticastAddress()          |           IP주소가 멀티캐스트 주소인지 알려준다.           |
  |          boolean isLoopbackAddress()           |      IP주소가 loopback 주소(127.0.0.1)인지 알려준다.       |

---



* __소켓 프로그래밍__ : 소켓을 이용한 통신 프로그래밍

  * __소켓__ : 프로세스 간의 통신에 사용되는 양쪽 끝 단

  * __TCP__

    데이터 전송 속도가 느리지만 정확하고 안정적으로 전달할 수 있는 연결 지향적 프로토콜

  * __UDP__

    데이터 전송 속도가 빠르지만 신뢰성 없는 데이터를 전송하는 비연결 지향적 프로토콜

---

* __TCP 소켓 프로그래밍__
  * 클라이언트와 서버간의 1:1 소켓 통신 
  * 서버가 먼저 실행 되어 클라이언트의 요청을 기다려야 하고 서버용 프로그램과 클라이언트용 프로그램을 따로 구현해야 함 
  * 자바에서는 TCP 소켓 프로그래밍을 위해 java.net패키지에서 ServetSocket과 Socket클래스 제공



* __UDP 소켓 프로그래밍__
  * UDP는 연결 지향적이지 않기 때문에 연결 요청을 받아줄 서버 소켓이 필요 없음 
  * java.net패키지에서 제공하는 두 개의 DatagramSocket간에 DatagramPacket으로 변환된 데이터 주고 받음