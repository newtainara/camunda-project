package com.example.workflow.resource;

import com.example.workflow.camunda.StartCamundaProcessService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Slf4j
public class CamundaStartResource {
  @Autowired
  StartCamundaProcessService startCamundaProcessService;

  @GetMapping("/parking/startParking")
  public ResponseEntity<String> startParking(){
    startCamundaProcessService.startcamundaProcess();
    return ResponseEntity.ok("");
  }
}
