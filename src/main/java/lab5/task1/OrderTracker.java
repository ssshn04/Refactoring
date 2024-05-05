package lab5.task1;

import java.util.HashMap;
import java.util.Map;

public class OrderTracker {
    private Map<String, String> orderStatus = new HashMap<>();

    public void updateOrderStatus(String orderId, String status) {
        orderStatus.put(orderId, status);
        System.out.println("Order " + orderId + " status updated to " + status);
    }

    public String getOrderStatus(String orderId) {
        return orderStatus.getOrDefault(orderId, "Unknown");
    }
}

