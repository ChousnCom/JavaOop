package solution2;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder [] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000,2);
        productOrders[1] = createOrder("김치", 5000,1);
        productOrders[2] = createOrder("콜라", 1500,2);


        printOrders(productOrders);
        System.out.println("총 결제 금액 : " + getTotalAmount(productOrders));



    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder o : orders) {
            System.out.println("상품명 : " + o.productName + " " + "가격 : " + o.price + " " + "수량 :" + o.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder o : orders) {
            sum+=o.price*o.quantity;
        }
        return sum;
    }
}
