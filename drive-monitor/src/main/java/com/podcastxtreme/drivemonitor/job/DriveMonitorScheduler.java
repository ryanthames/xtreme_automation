package com.podcastxtreme.drivemonitor.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DriveMonitorScheduler {
  @Scheduled(cron = "0 0 * * * *")
  public void monitorEpisodeDir() {
    log.info("Hey there");

    // TODO: 7/14/18 authentication w/ google drive api
    // TODO: 7/14/18 scan directory for new episode
    // TODO: 7/14/18 grab contents of directory
    // TODO: 7/14/18 validate files 
    // TODO: 7/14/18 process description.txt
    // TODO: 7/14/18 process mp3 file (parse name from date)
    // TODO: 7/14/18 send message to exchange
    // TODO: 7/14/18 archive new episode
    // TODO: 7/14/18 zip?
  }
}
