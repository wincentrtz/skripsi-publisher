package com.skripsi.publisher.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skripsi.publisher.request.EcgInput;
import com.skripsi.publisher.service.EcgPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EcgPublisherServiceImpl implements EcgPublisherService {

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  @Autowired
  private ObjectMapper objectMapper;

  @Override
  public void publish(EcgInput ecgInput) throws JsonProcessingException {
    String stringify = objectMapper.writeValueAsString(ecgInput);
    kafkaTemplate.send("ecg", stringify);
  }
}
