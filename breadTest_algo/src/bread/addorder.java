package bread;

import java.util.Scanner;
//추가 주문 관련
public class addorder {
//	SHOWMENU showmenu = new SHOWMENU();
//	static finish finishAddOrder = new finish();
	static SELECTMENU selectmenuAddOrder = new SELECTMENU(); //선택 메뉴 불러오기
	public static void addorder() {
		System.out.println("이어서 주문하시겠습니까?\n1.네 \n2.아니요" );
		Scanner scanner = new Scanner(System.in);
		int addselect = scanner.nextInt();
		
		
	
	switch(addselect) {
	case 1: 
		selectmenuAddOrder.selectMenu();
		break;
	case 2:
		finish finishAddOrder = new finish();
		break;
	
		default : 
			System.out.println("잘못된 선택입니다");
		break;
	}
	}
}
