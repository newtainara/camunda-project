package com.example.workflow.delegates;

import com.example.workflow.service.SendMessageService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CalculateInterestService implements JavaDelegate {

  private final SendMessageService sendMessageService;
  private static final Logger LOGGER = LoggerFactory.getLogger(CalculateInterestService.class);

  public CalculateInterestService(SendMessageService sendMessageService) {
    this.sendMessageService = sendMessageService;
  }

  @Override
  public void execute(DelegateExecution delegateExecution) {
    LOGGER.info("calculating interest of the loan");
    System.out.println("calling delegateExecution");
    sendMessageService.sendMessage();
  }
}
