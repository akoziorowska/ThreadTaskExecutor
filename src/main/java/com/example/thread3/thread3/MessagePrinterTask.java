package com.example.thread3.thread3;

public class MessagePrinterTask implements Runnable {
    private String message;

    public MessagePrinterTask(String message) {
        this.message = message;
    }

    //@Override
    public void run() {
        System.out.println("message="+message);
    }
}
