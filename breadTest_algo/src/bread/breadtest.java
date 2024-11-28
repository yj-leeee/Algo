package bread;
import java.util.Stack;
import java.util.Scanner;
public class breadtest {
	
	public static void finishMain() {
		finish finishMain = new finish();
		finishMain.finish();
	}
	 public static void addOrderMain(SELECTMENU selectmenuMain) {
	        addorder addOrderMain = new addorder(); // 추가 주문 관련
	        addOrderMain.addorder(selectmenuMain); // SELECTMENU 객체 전달
	    }
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		SHOWMENU showmenuMain = new SHOWMENU(); //메뉴메서드 불러오기
		SELECTMENU selectmenuMain = new SELECTMENU(); //선택 메뉴 불러오기
		BREADSIZE breadsizeMain = new BREADSIZE(); //빵 수량 20개씩 채우고 수량 출력
		choice choiceMain = new choice();
		
		
	while(true){
			showmenuMain.showmenu();//메뉴출력
			selectmenuMain.selectMenu();//선택메뉴출력
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(menu) { 
			case 1: //남은 수량 보기
				breadsizeMain.breadSize();
				break;
				
			case 2 : //빵 선택하기
				choiceMain.Choice();
				break;
				
			case 3 : //주문종료
				//finish finishAddOrder = new finish();
				finishMain();
				return; //프로그램 종료
			}
			
			
			break;
		}
	}
}