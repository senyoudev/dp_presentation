package org.example;


class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(OrderStatus newStatus) {
        System.out.println("Customer " + name + " notified. Order status: " + newStatus);
    }




}
