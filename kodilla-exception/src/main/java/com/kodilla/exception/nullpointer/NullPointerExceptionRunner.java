package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
//        User user = new User("n");
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hi!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not sent, " + "but the program is still running!");
        }

        System.out.println("Processing other logic!");
    }
}
