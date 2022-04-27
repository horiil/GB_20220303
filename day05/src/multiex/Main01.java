package multiex;

public class Main01 {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int odd_number = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {	
				odd_number += i;
			}
			
		} System.out.println("1 ~ 10 까지 홀수 값의 합 : " + odd_number);
		System.out.println("-------------------------------------");
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		
		int even_number = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				even_number += i;
			}
		} System.out.println("1 ~ 10 까지 짝수 값의 합 : " + even_number);
		System.out.println("--------------------------------------");
		
		/*
		 * 문제 3. ★하나만가지고 반복문으로 아래의 모양 출력
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		
		for(int h = 0; h < 8; h++) {		// 높이
			for(int l = 0; l < 7; l++) {		// 넓이
				System.out.print('★');
				
			}System.out.println('★');
		}
		System.out.println("---------------------------------------");
		
		/*
		 * 문제 4. 
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
// 너무 여렵게 생각하지 말자. (고생)
		for(int h = 0; h < 8; h++) {
			for(int l = 8; l > h; l--) {
				System.out.print('★');
			} System.out.println("");
/* 이런식으로도 할 수 있다.
 * 		for(int i = 0; i <= 7; i++){
 * 			for(int i = j; i <= 7; i++){
 * 				System.out.println('★');
 * 			}
 * 			System.out.println("");
 * 		}
 */
		} System.out.println("---------------------------------------");
		
		/*
		 * 문제 5.
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		
		
		for(int h = 0; h < 8; h++) {
			for(int l = 0; l < h; l++) {
				System.out.print('★');
			}System.out.println("");
		  // System.out.println('★');

/*     //이렇게도 가능
 *		for(int j = 7; j >= 0 ; j--) {
			for(int i = j; i <= 7; i++) {
				System.out.print('★');
			}
			System.out.println("");
 */
		} System.out.println("---------------------------------------");		
	
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
		
		// 2중 for문
		int multiplication_table1;
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				multiplication_table1 = i * j;
				System.out.println(i + " * " + j + " = " + multiplication_table1);
			}System.out.println("----------------------------------------");

		} System.out.println("for문 구구단----------------------------------------------------");
		
		// 2중 while
		int mulitplication_table2;
		int i = 1;
		while(i < 9) {
			i++;
			int j = 1;
			while(j < 10) {
				mulitplication_table2 = i * j;
				System.out.println(i + " * " + j + " = " + mulitplication_table2);
				j++;
			}System.out.println("----------------------------------------");
		} System.out.println("while문 구구단--------------------------------------------------");
		
	}
}
