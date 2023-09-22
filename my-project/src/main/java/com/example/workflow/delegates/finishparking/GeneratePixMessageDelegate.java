package com.example.workflow.delegates.finishparking;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GeneratePixMessageDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(GeneratePixMessageDelegate.class);

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    LOGGER.info("send pix message");
  }
}
