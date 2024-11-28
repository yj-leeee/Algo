package bread;
import java.util.Stack;
import java.util.Scanner;
public class breadtest {
	
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		SHOWMENU showmenuMain = new SHOWMENU(); //메뉴메서드 불러오기
		SELECTMENU selectmenuMain = new SELECTMENU(); //선택 메뉴 불러오기
		BREADSIZE breadsizeMain = new BREADSIZE(); //빵 수량 20개씩 채우고 수량 출력
		addorder addOrderMain = new addorder(); //추가 주문 관련
//		finish finishMain = new finish();
		choice choiceMain = new choice();
		
		
	while(true){
		showmenuMain.showmenu();
			selectmenuMain.selectMenu();
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(menu) { 
			case 1: //남은 수량 보기
				breadsizeMain.breadSize();
				
				break;
				
			case 2 : //빵 선택하기
				showmenuMain.showmenu();
				System.out.println("빵을 선택해주세요 : ");
				int bread = scanner.nextInt();
				scanner.nextLine();
			
				switch(bread) {
				case 1: //샌드위치 선택
					System.out.println("샌드위치를 선택하셨습니다.");
					System.out.println("수량을 입력해주세요 : ");
					int sandbread = scanner.nextInt();
					scanner.nextLine();
					System.out.println("샌드위치" + sandbread + "개 선택하였습니다."  );
					addorder.addorder();
				break;
				
				case 2: //딸기케이크 선택
					System.out.println("딸기케이크를 선택하셨습니다.");
					System.out.println("수량을 입력해주세요 : ");
					int cakebread = scanner.nextInt();
					scanner.nextLine();
					System.out.println("딸기케이크" + cakebread + "개 선택하였습니다." );
					addorder.addorder();
				break;
				
				case 3: //튀김소보로 선택
					System.out.println("튀김소보로를 선택하셨습니다.");
					System.out.println("수량을 입력해주세요 : ");
					int sobobread = scanner.nextInt();
					scanner.nextLine();
					System.out.println("튀김소보로" + sobobread + "개 선택하였습니다." );
					addorder.addorder();
				break;
				
				case 4: //단팥빵 선택
					System.out.println("단팥빵를 선택하셨습니다.");
					System.out.println("수량을 입력해주세요 : ");
					int danbread = scanner.nextInt();
					scanner.nextLine();
					System.out.println("단팥빵" + danbread + "개 선택하였습니다." );
					addorder.addorder();
				break;
				
				case 5: //피자빵 선택
					System.out.println("피자빵를 선택하셨습니다.");
					System.out.println("수량을 입력해주세요 : ");
					int pizzabread = scanner.nextInt();
					scanner.nextLine();
					System.out.println("피자빵" + pizzabread + "개 선택하였습니다." );
					addorder.addorder();
				break;
				
				}
			case 3 : //주문종료
				finish finishAddOrder = new finish();
				
				
			}
			
			
			break;
		}
	}
}