package copyPackage;

public class ProceduralOrderManager {
    public static void main(String[] args) {
        String customer = "Alice";
        String product = "Book";
        int quantity = 2;
        int price = 15000;

        int totalPrice = price * quantity;
        System.out.printf("%s 님이 주문한 %s %d권의 총액은 %d원입니다.\n",
                            customer, product, quantity, totalPrice);
    }
}
