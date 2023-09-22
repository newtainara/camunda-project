package com.example.workflow.delegates.initparking;

import java.util.HashMap;
import java.util.Map;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HasVacancyDelegate implements JavaDelegate {

  private static final Logger LOGGER = LoggerFactory.getLogger(HasVacancyDelegate.class);

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {
    LOGGER.info("checking if has vacancy");
    delegateExecution.setVariable("vacancy","true");
  }
}