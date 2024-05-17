// OrderManager.java
import java.util.Scanner;

public class OrderManager {

    private static void printMenuCountMessage(){
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");
    }

    private static void printMenuSelecExceptionMessage(){
        System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
        System.out.println("------------------------------");
    }

    private static void lastPrintedLetters(int totalPrice){
        System.out.println("[안내]주문하신 메뉴의 총 금액은 " + totalPrice + "원 입니다.");
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }


    private static void printMenuCounterExceptionMessage(){
        int choiceAmount = 0;
        System.out.println("[경고]" + choiceAmount + "개는 입력하실 수 없습니다.");
        System.out.println("[안내]수량 선택 화면으로 돌아갑니다.");
    }


    private static void printMenuSelectExeptionMessage(){
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        MenuType[] menuTypes = MenuType.values();
        for(MenuType menu : menuTypes) {
            System.out.print(menu.getNumberOfMenu()+")"+ menu.name() + "(" + menu.getPriceMenu()+"원) ");
        }
        System.out.println();
    }


    public static int inputNumber(Scanner sc) {
        printMenuSelectExeptionMessage();
        MenuType menuType = null;
        int menuCount = menuType.values().length;
        int choiceNumber;
        do {
            String input = sc.nextLine();
            try {
                choiceNumber = Integer.parseInt(input);
                if (choiceNumber < 1 || choiceNumber > menuCount) {
                    System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("[안내]숫자를 입력하여 주세요.");
                choiceNumber = 0; // 잘못된 입력을 처리하기 위해 0으로 설정
            }
        } while (choiceNumber < 1 || choiceNumber > menuCount);

        return choiceNumber;
    }

    public static int selectMenuCount(Scanner sc){
        int choiceAmount;
        do {
            choiceAmount = Integer.parseInt(sc.nextLine());
            if (choiceAmount > 99) {
                printMenuCounterExceptionMessage();
            }
        } while (choiceAmount > 99);
        return choiceAmount;
    }




    public static int inputAmount(Scanner sc) {
        printMenuCountMessage();
        int choiceAmount;
        return selectMenuCount(sc);
    }

    public static void calculateTotalPrice(int choiceNumber, int choiceAmount) {

        MenuType[] menuTypes = MenuType.values();

        if (choiceNumber < 1 || choiceNumber > menuTypes.length) {
            printMenuSelecExceptionMessage();
            return;
        }

        MenuType menuType = menuTypes[choiceNumber-1];

        int price = menuType.getPriceMenu();
        int totalPrice = price * choiceAmount;
        lastPrintedLetters(totalPrice);





        }

    }


