package com.example.workflow.delegates.finishparking;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomerSucessDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerSucessDelegate.class);

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    LOGGER.info("send message for customer success");
  }
}
