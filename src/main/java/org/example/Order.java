package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private OrderStatus status;

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }
}
