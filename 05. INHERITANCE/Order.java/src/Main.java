class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed: " + orderId + " on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped: " + orderId + ", Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered: " + orderId + ", Delivered on: " + deliveryDate;
    }
}

class OrderManagementSystem {
    public static void main(String[] args) {
        // Creating instances of each class
        Order order = new Order("ORD123", "2025-04-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-04-02", "TRACK456");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-04-03", "TRACK789", "2025-04-05");

        // Displaying the order status for each order
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
