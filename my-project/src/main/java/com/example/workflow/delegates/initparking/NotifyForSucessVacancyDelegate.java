package com.example.workflow.delegates.initparking;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NotifyForSucessVacancyDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(NotifyCustomerWithoutVacancyDelegate.class);


  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    LOGGER.info("notify for customer with vacancy");
  }
}
