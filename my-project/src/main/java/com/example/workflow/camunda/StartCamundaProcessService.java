package com.example.workflow.camunda;

import java.util.HashMap;
import java.util.Map;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Service;

@Service
public class StartCamundaProcessService {
  public void startcamundaProcess() {
    // Obtém o engine do processo
    ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();

    // Obtém o serviço de runtime
    RuntimeService runtimeService = engine.getRuntimeService();

    // Inicia um processo com a definição de processo
    Map<String, Object> processDefinition = new HashMap<>();
    processDefinition.put("name", "Process_0zdz7jd");
    runtimeService.startProcessInstanceByKey("Process_0zdz7jd", processDefinition);
  }
}
