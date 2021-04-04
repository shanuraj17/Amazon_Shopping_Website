package utils;

import Person.Buyer;
import builder.Item;
import constants.OrderStatus;

import java.util.Date;
import java.util.List;

public class Order {
    int orderId;
    List<Item> orderItem;
    double orderValue;
    Buyer buyer;
    Date orderDate;
   // NotificationService notificationService;

   // List<OrderLog> orderLog;

    public OrderStatus placeOrder(){
        return OrderStatus.PACKED;
    }
    public OrderStatus trackOrder(){
        return OrderStatus.ENROUTE;
    }
    //public void addOrderLogs();
   // public PaymentStatus makePayment(PaymentType paymentType);
}
