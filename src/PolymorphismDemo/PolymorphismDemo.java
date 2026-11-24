
package PolymorphismDemo;

class Notification {

    void sendMessage() {
        System.out.println("Sending a notification...");
    }
}

class EmailNotification extends Notification {

    @Override
    void sendMessage() {
        System.out.println("Sending notification through Email.");
    }
}

class SMSNotification extends Notification {

    @Override
    void sendMessage() {
        System.out.println("Sending notification through SMS.");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.sendMessage();

        notification = new SMSNotification();
        notification.sendMessage();
    }
}
