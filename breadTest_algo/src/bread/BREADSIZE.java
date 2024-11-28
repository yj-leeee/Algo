package bread;

import java.util.Stack;

public class BREADSIZE {

	//빵 수량 20개씩 채우고 수량 출력
		public void breadSize() {
		//20개까지 수량 채우기
		int top = 1;
		Stack<Integer> sand= new Stack<>(); 
		Stack<Integer> cake= new Stack<>(); 
		Stack<Integer> dan= new Stack<>(); 
		Stack<Integer> sobo= new Stack<>(); 
		Stack<Integer> pizza= new Stack<>(); 
		final int breadSize = 20;
		
		
		
		
		//반복문 사용해서 스택 채우기 
		for (int i = 0; i<breadSize; i++) { //재귀 사용 가능할 거 같은뎅 > 더 길어서 반복문으로 하는게 나을듯
			sand.push(i+1);
			cake.push(i+1);
			dan.push(i+1);
			sobo.push(i+1);
			pizza.push(i+1);
			
		}
//		breadSizeArray[0] = sand.size();
//		breadSizeArray[1] = cake.size();
//		breadSizeArray[2] = sobo.size();
//		breadSizeArray[3] = dan.size();
//		breadSizeArray[4] = pizza.size();
	
		
		System.out.println("남은 샌드위치 수량 : " + sand.size());
		System.out.println("남은 딸기케이크 수량 : " + cake.size());
		System.out.println("남은 튀김소보로 수량 : " + sobo.size());
		System.out.println("남은 단팥빵 수량 : " + dan.size());
		System.out.println("남은 피자빵 수량 : " + pizza.size());
		
		return;
		
		
	}
}

//int[] breadsizearray = breadSize.breadSizeArray;
//public static void main(String[] args) {
//    // Create an instance of the ArrayHolder class
//    ArrayHolder arrayHolder = new ArrayHolder();
//
//    // Access the array using the instance
//    int[] retrievedArray = arrayHolder.aa;
//
//    // Print the elements of the array
//    System.out.println("Array elements:");
//    for (int value : retrievedArray) {
//        System.out.println(value);
//    }
//}
