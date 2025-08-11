package copyPackage;

public class Order {
    String customer;
    String product;
    int quantity;
    int price;

    Order(String customer, String product, int quantity, int price) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
    int getTotalPrice() {
        return price * quantity;
    }

    void printOrderSummary() {
        System.out.printf("%님이 주문한 %s %권의 총액은 %권의 총액은 %d원입니다.\n",
                customer, product, quantity, getTotalPrice());
    }
}

public class OOPOrderManager {
    public static void main(String[] args) {
        Order order = new Order("Alice", "Book", 2, 15000);
        order.printOrderSummary();
    }
}

