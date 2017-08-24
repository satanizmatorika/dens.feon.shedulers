package ru.dens.feon.shedulers;

import org.springframework.scheduling.annotation.Scheduled;

public class TestShedulerDFS implements Runnable{

    private String shedulerName;
    private String cron;

    public TestShedulerDFS(String shedulerName, String cron) {
        this.shedulerName = shedulerName;
        this.cron = cron;
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void testSheduler() {
        System.out.println("SHEDULER METHOD RUNING " + shedulerName + " " + cron);
    }

    @Override
    public void run() {

    }
}
