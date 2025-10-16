package com.MultiThread.Runnable;

class TicketCounter {
    public int ticketsAvailable;

    public TicketCounter(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    // synchronized method to safely book a ticket
    public synchronized void bookTicket(String customerName) {
        if (ticketsAvailable > 0) {
            System.out.println(customerName + " is booking a ticket...");
            try {
                Thread.sleep(3000); // simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketsAvailable--;
            System.out.println(customerName + " successfully booked a ticket. Tickets left: " + ticketsAvailable);
        } else {
            System.out.println(customerName + " tried to book a ticket, but no tickets left!");
        }
    }
}

// Thread representing a customer trying to book a ticket
class CustomerThread extends Thread {
    public TicketCounter counter;

    public CustomerThread(TicketCounter counter, String name) {
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.bookTicket(getName());
    }
}

// Main class
public class Synchronize3 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter(3); // only 3 tickets

        CustomerThread c1 = new CustomerThread(counter, "Alice");
        CustomerThread c2 = new CustomerThread(counter, "Bob");
        CustomerThread c3 = new CustomerThread(counter, "Charlie");
        CustomerThread c4 = new CustomerThread(counter, "David");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
