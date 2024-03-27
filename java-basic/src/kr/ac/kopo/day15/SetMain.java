package kr.ac.kopo.day15;

// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    set 특징 - 중복(X), 순서(X)
         - HashSet
         - TreeSet 
 */
public class SetMain {

	public static void main(String[] args) {

//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();

		System.out.println("add() 전 원소의 총 개수 : " + set.size());
		System.out.println("\"one\" 삽입여부 : " + set.add("one"));
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("add() 전 원소의 총 개수 : " + set.size());
		System.out.println("\"one\" 삽입여부 : " + set.add("one"));
		System.out.println("add() 전 원소의 총 개수 : " + set.size());

		System.out.println("< 전체 데이터 출력 - toArray() >");
		Object[] objArr = set.toArray();
		for (int i = 0; i < objArr.length; i++) {
			@SuppressWarnings("unused")
			String str = (String) objArr[i];
			System.out.println(objArr[i] + "length : " + ((String) objArr[i]).length());
		}

		System.out.println("< 전체 데이터 출력 - 1.5버전의 for문 >");
		for (String str : set) {
			System.out.println(str);
		}

		/*
		 * Iterator 주요메소드 hasNext() : 다음 데이터 존재 여부 판단 next() : 데이터
		 */
		System.out.println("< 전체 데이터 출력 - iterator() >");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
