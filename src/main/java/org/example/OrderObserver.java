package org.example;

public  interface OrderObserver {
    void update(OrderStatus newStatus);
}