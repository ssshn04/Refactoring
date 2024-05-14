package lab6.task2._6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Customer1", "Product1", 3);
        Order order2 = new Order("Customer2", "Product2", 5);
        Order order3 = new Order("Customer3", "Product3", 2);

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.addOrder(order3);

        System.out.println("Список замовлень:");
        List<Order> orders = orderManager.getOrders();
        for (Order order : orders) {
            System.out.println("Замовлення: " + order.getProductName() + ", Кількість: " + order.getQuantity() + ", Клієнт: " + order.getCustomerName());
        }

        orderManager.removeOrder(order2);

        System.out.println("\nСписок замовлень після видалення:");
        orders = orderManager.getOrders();
        for (Order order : orders) {
            System.out.println("Замовлення: " + order.getProductName() + ", Кількість: " + order.getQuantity() + ", Клієнт: " + order.getCustomerName());
        }
    }
}