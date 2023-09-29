package com.Ceyentra.Shedular.sheduler_time.shedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Sheduler {
    @Scheduled(cron = "0 * 21 * * ?")
    public void scheduleTask()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss.SSS");

        String strDate = dateFormat.format(new Date());

        System.out.println(
                "Cron job Scheduler: Job running at - "
                        + strDate);
    }
}
