package sk.balaz.springbootactuator.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class ScheduleJob {

    @Scheduled(fixedRate = 30000)
    public void scheduleEvery3Seconds() {
        log.info("scheduleEvery3Seconds job is running " + LocalDateTime.now());
    }

    @Scheduled(cron = "0 15 10 15 * ?")
    public void scheduleEveryMinute() {
        log.info("scheduleEveryMinute job is running " + LocalDateTime.now());
    }
}
