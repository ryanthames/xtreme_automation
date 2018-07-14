package com.podcastxtreme.drivemonitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DriveMonitorJob {
  @Scheduled(fixedRate = 5000)
  public void monitorEpisodeDir() {
    log.info("Hey there");
  }
}
