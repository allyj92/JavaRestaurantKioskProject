import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choiceNumber = OrderManager.inputNumber(sc);
            int choiceAmount = OrderManager.inputAmount(sc);
            OrderManager.calculateTotalPrice(choiceNumber, choiceAmount);

            System.out.println("[안내]계속 주문하시겠습니까? (Y/N)");
            String continueOrder = sc.nextLine();
            if (!continueOrder.equalsIgnoreCase("Y")) {
                System.out.println("[안내]주문을 종료합니다. 이용해 주셔서 감사합니다.");
                break;
            }
        }
    }
}