package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
     Map : key에 대한 중복(X), 순서(X)
     HashMap
     TreeMap        
 */


public class MapMain01 {
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, String> members = new HashMap<String, String>();
			
			members.put("aaa", "1111");
			members.put("bbb", "2222");
			members.put("ccc", "3333");
			members.put("ddd", "4444");
			
			System.out.println("-------------------------------");
			System.out.println("비밀번호 변경 서비스");
			System.out.println("-------------------------------");
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			if(!members.containsKey(id)) {
				System.out.println("입력하신 아이디["+id+"] 회원이 존재하지 않습니다.");
				System.out.println("서비스를 종료합니다");
			    System.exit(0);
			}
			
			System.out.print("현재 패스워드를 입력 : ");
			String password = sc.nextLine();
			
			if(!members.get(id).equals(password)) {
				System.out.println("패스워드가 올바르지 않습니다.");
				System.out.println("서비스를 종료합니다");
				System.exit(0);
			}
			
			System.out.print("변경할 패스워드를 입력 : ");
			String newPassword = sc.nextLine();
			members.put(id, newPassword);
			
			System.out.println("패스워드 변경이 완료되었습니다.");
			System.out.println("-------------------------------");
			System.out.println(" ID\tPASSWORD ");
			System.out.println("-------------------------------");
			
			Set<String> keys = members.keySet();
			for(String key : keys) {
				System.out.println(key + "\t" + members.get(key));
			}
		}
		
		/*
		Set<Entry<String, String>> entry = members.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		*/
	}
}

