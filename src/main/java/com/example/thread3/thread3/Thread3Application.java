package com.example.thread3.thread3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.task.TaskExecutor;

@SpringBootApplication
public class Thread3Application {

//    @Autowired
//    private static TaskExecutor taskExecutor;

    public static void main(String[] args) {
        SpringApplication.run(Thread3Application.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);

        for (int i=0;i<10;i++){
            taskExecutor.execute(new MessagePrinterTask("message"+i));
        }
    }
}
