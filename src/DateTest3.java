import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		/*
		System.out.print("년, 월, 일 : ");
		int year = scanner.nextInt() - 1900;
		int month = scanner.nextInt() -1 ;
		int day = scanner.nextInt();
		
		
		Date date = new Date(year, month , day);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) hh:mm:ss.SSS");
		System.out.println(sdf.format(date));

		*/
//		substring(a,b) : 문자열의 a번째 문자부터 b-1 번째 문자까지 얻어온다.

		
		System.out.println("주민등록번호 : ");
		String jumin = scanner.next();
		/*
		int year =  (jumin.substring(0, 2).charAt(0) - 48) * 10 + (jumin.substring(0, 2).charAt(1) - '0') ;		
		int month =  (jumin.substring(2, 4).charAt(0) - 48) * 10 + (jumin.substring(2, 4).charAt(1) - '0') - 1 ;		
		int day =  (jumin.substring(4, 6).charAt(0) - 48) * 10 + (jumin.substring(4, 6).charAt(1) - '0') ;				
		 * */
		
//		Integer. parseInt() : 인수로 지정된 문자열을 정수로 바꾼다.
		
		int year = Integer.parseInt(jumin.substring(0, 2));
		int month = Integer.parseInt(jumin.substring(2, 4)) - 1;
		int day = Integer.parseInt(jumin.substring(4, 6));
		
		

		
		String check = jumin.substring(6, 7);
		
		if (jumin.charAt(6) > '2' ) {
			year+=100;
		}
		
		Date date = new Date(year, month , day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
		
		
		
		
	}

}
