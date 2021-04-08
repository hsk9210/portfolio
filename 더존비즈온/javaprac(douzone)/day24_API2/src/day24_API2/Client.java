package day24_API2;

import java.util.ArrayList;

//회원정보가 담긴 객체
class ClientInfo{
	
	private String name,addr,phone;
	
	public ClientInfo() {
		
	}	
	public ClientInfo(String name,String addr,String phone){
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
	// 다 리턴하는게 필요하네...
	public String getAll() {
		return name+" 이고, "+addr+" 에 살고, "+phone;
	}
}


public class Client {
	
	//콘솔확인용도.
	public static void print1(Object o) {
		System.out.println(o);
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// "회원정보" 타입으로 제한을 걸면 다른 방법으로 넣는데 제약이 걸릴 듯.
		ArrayList<ClientInfo> _client  =new ArrayList<>();
		ClientInfo kim = new ClientInfo();
		//문제는 getter setter 방식의 귀차니즘.
		kim.setName("김김김?");
		kim.setAddr("부산");
		kim.setPhone("000-0000-0000");
		//고객리스트에 김을 추가하고.
		_client.add(kim);
		print1(_client.get(0).getAll());
		ClientInfo park = new ClientInfo();
		
		//리스트 수정하기 전, 객체를 수정하는 기능도 합치는게 나을까?
		park.setName("박박박.");
		_client.set(0,park);
		print1(_client.get(0).getAll());
		//삭제.
		print1(_client.remove(0));
		print1("라는 해당 주소의 내용이 삭제됨?");
		
		ClientInfo ham = new ClientInfo("함승균","부산","000-0000-000");
		_client.add(ham);
		print1(_client.get(0).getAll());
		

	}

}
