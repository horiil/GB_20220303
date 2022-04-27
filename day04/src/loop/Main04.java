package loop;

public class Main04 {

	public static void main(String[] args) {
		// while문으로 구구단 7단 출력
		
		int i = 1;
		int j = 0;
		
		while( i <= 9 ) {
			j =  7 * i;
			System.out.println(j);
			i++;
		}

	}

}
// alt + 방향키 = 해당 줄의 코드 위치 변경