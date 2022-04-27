package operator;

public class Main04 {

	public static void main(String[] args) {
		int puls_num = 1;			// 1
		puls_num = puls_num + 1;	// 2
		puls_num += 1;				// 3
		puls_num++;					// 4
		++puls_num;					// 5
		
		System.out.println("plus_num : " + puls_num);
		System.out.println("-----------------------------------");
		
		int minus_num = 5;			// 5
		minus_num = minus_num -1;	// 4
		minus_num -= 1;				// 3
		minus_num--;				// 2
		--minus_num;				// 1
		
		System.out.println("minus_num : " + minus_num);
		
	}

}
