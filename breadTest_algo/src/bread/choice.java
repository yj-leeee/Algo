package bread;
import java.util.Scanner;

public class choice {
	public void Choice() {
		Scanner scanner = new Scanner(System.in);
		SHOWMENU showmenuChoice = new SHOWMENU(); //메뉴메서드 불러오기
			showmenuChoice.showmenu();
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
	}

	
	}

