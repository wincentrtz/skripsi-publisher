package com.skripsi.publisher.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.skripsi.publisher.request.EcgInput;

public interface EcgPublisherService {
  void publish(EcgInput ecgInput) throws JsonProcessingException;
}
