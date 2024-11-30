package bread;

import java.util.ArrayList;

public class ready {
	static ArrayList<Integer> readypeople = new ArrayList<>();
	
	
	private static void addreadypeople() {
		 readypeople.add(readypeople.size() + 1); //대기인원 추가 메서드
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("현재대기인원은 " + readypeople.size() + "명입니다.");
		addreadypeople();
		System.out.println("당신의 순서는 " + readypeople.size() +"번입니다. \n감사합니다");
	}



	
}
