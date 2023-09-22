package com.example.workflow.service;

import com.example.workflow.call.SendMessageCall;
import com.example.workflow.delegates.CalculateInterestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {
  @Autowired
  SendMessageCall sendMessageCall;

  private static final Logger LOGGER = LoggerFactory.getLogger(CalculateInterestService.class);


  public void sendMessage(){
    LOGGER.info("sending message to customer");
    //sendMessageCall.sendMessage();
  }

}
