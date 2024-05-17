// OrderManager.java
import java.util.Scanner;

public class OrderManager {
    public static int inputNumber(Scanner sc) {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");

        int choiceNumber;
        do {
            choiceNumber = Integer.parseInt(sc.nextLine());
            if (choiceNumber < 1 || choiceNumber > 4) {
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
            }
        } while (choiceNumber < 1 || choiceNumber > 4);

        return choiceNumber;
    }

    public static int inputAmount(Scanner sc) {
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");
        int choiceAmount;
        do {
            choiceAmount = Integer.parseInt(sc.nextLine());
            if (choiceAmount > 99) {
                System.out.println("[경고]" + choiceAmount + "개는 입력하실 수 없습니다.");
                System.out.println("[안내]수량 선택 화면으로 돌아갑니다.");
            }
        } while (choiceAmount > 99);
        return choiceAmount;
    }

    public static void calculateTotalPrice(int choiceNumber, int choiceAmount) {
        MenuType menuType;

        switch (choiceNumber) {
            case 1:
                menuType = MenuType.GIMBAP;
                break;
            case 2:
                menuType = MenuType.EGGGIMBAP;
                break;
            case 3:
                menuType = MenuType.CHUNGMOOGIMBAP;
                break;
            case 4:
                menuType = MenuType.TTEOKBOKKI;
                break;
            default:
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
                return;
        }

        int price = menuType.getPriceMenu();
        int totalPrice = price * choiceAmount;
        System.out.println("[안내]주문하신 메뉴의 총 금액은 " + totalPrice + "원 입니다.");
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}