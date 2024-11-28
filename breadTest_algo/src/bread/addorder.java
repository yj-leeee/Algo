package bread;

import java.util.Scanner;
//추가 주문 관련
public class addorder {
//	public static void selectmenuAddOrder() {
//		selectmenuAddOrder.selectMenu();
//	}
	
	public boolean addorder(SELECTMENU selectmenuMain) {
		System.out.println("이어서 주문하시겠습니까?\n1.네 \n2.아니요" );
		Scanner scanner = new Scanner(System.in);
		int addselect = scanner.nextInt();
		
		
	
		 switch (addselect) {
         case 1: // 추가 주문
             System.out.println("메뉴로 돌아갑니다.");
             return true;

         case 2: // 주문 종료
             System.out.println("주문이 종료되었습니다. 감사합니다.");
             return false;

         default: // 잘못된 입력 처리
             System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
             return false;
     }
	}
}
