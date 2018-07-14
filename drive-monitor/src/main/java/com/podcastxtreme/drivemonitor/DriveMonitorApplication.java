package com.podcastxtreme.drivemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DriveMonitorApplication {

  public static void main(String[] args) {
    SpringApplication.run(DriveMonitorApplication.class, args);
  }
}
