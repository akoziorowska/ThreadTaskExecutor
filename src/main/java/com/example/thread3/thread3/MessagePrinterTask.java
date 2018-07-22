package com.example.thread3.thread3;

public class MessagePrinterTask implements Runnable {
    private String message;
    private int k=0;

    public MessagePrinterTask(String message) {
        this.message = message;
    }

    //@Override
    public void run() {
        k++;
        System.out.println("message="+message+"k="+k);
    }
}
