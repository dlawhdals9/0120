import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		

		ArrayList<String> list = new ArrayList<>();			 // JDK 1.7 버전 이후 코딩 방법
		
		
//		add(value) => ArrayList의 맨 뒤에 value를 추가한다.
		list.add("홍길동");
		System.out.println(list);
		list.add("임꺽정");
		System.out.println(list);
		list.add("장길산");
		System.out.println(list);
		list.add("일지매");
		System.out.println(list);
		
//		size() => ArrayList에 저장된 데이터의 개수를 얻어온다.
		System.out.println(list.size());
		
//		add(index, value) => ArrayList의 index 번째 위치에 value를 삽입한다.
		list.add(1, "이몽룡");
		System.out.println(list);
		
//		set(index, value) => ArrayList의 index번쩨 위치에 데이터를 value로 수정한다.
		list.set(1, "성춘향");
		System.out.println(list);
		
//		get(index) => ArrayList의 index번째 위치의 데이터를 얻어온다.
		for(int i = 0; i < list.size() ; i++ ) {
			System.out.println("list.get(" + i + ") = " + list.get(i));
		}
		
//		remove(index) => ArrayList의 index번째 위치의 데이터를 제거한다.
		list.remove(1);
		System.out.println(list);
//		clear() => ArrayList의 모든 데이터를 제거한다.
		list.clear();
		System.out.println(list.size());
			
			
		

	}

}
