package com.skripsi.publisher.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.skripsi.publisher.request.EcgInput;
import com.skripsi.publisher.service.EcgPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EcgPublisherController {

  @Autowired
  private EcgPublisherService ecgPublisherService;

  @PostMapping("/publish")
  public void publish(@RequestBody EcgInput ecgInput) throws JsonProcessingException {
    ecgPublisherService.publish(ecgInput);
  }
}
