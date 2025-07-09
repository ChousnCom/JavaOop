package solution2;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int product = sc.nextInt();
        String productName = " ";
        int price = 0;
        int quantity = 0;
        ProductOrder[] orders = new ProductOrder[product];
        for(int i = 0; i<orders.length; i++) {
            System.out.println(i+1+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            productName = sc.next();
            System.out.print("가격 : ");
            price = sc.nextInt();
            System.out.print("수량 : ");
            quantity = sc.nextInt();

            orders[i] = createProductOrder(productName, price, quantity);
        }
        printProductOrder(orders);
        System.out.println("총 결제 금액 : " + getTotalAmount(orders));


    }
    static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
   static void printProductOrder(ProductOrder [] order) {
        for(ProductOrder o : order) {
            System.out.println("상품명 : " + o.productName + " " + "가격 : " + o.price + " " + "수량 : " + o.quantity);
        }
    }
    static int getTotalAmount(ProductOrder [] order) {
        int sum = 0;
        for(ProductOrder o : order) {
            sum+=o.quantity*o.price;
        }
        return sum;
    }
}
