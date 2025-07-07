package solution1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity=2;

        productOrder2.productName="김치";
        productOrder2.price = 5000;
        productOrder2.quantity=1;

        productOrder3.productName="콜라";
        productOrder3.price = 1500;
        productOrder3.quantity=2;

        ProductOrder []productOrders = new ProductOrder[3];
        productOrders[0] = productOrder1;
        productOrders[1] = productOrder2;
        productOrders[2] = productOrder3;

        int sum = 0;
        for(ProductOrder p : productOrders){
            System.out.println("상품명 : " + p.productName + " " + "가격 : "+ p.price + " " + "수량" +p.quantity);
            sum += p.quantity*p.price;
        }
        System.out.println("총 결제 금액 : " + sum);
    }
}
