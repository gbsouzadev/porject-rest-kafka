package com.gbsouza.projectrestkafka.controller;

import com.gbsouza.projectrestkafka.data.DataRequest;
import com.gbsouza.projectrestkafka.service.EventRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestsController {

    private final EventRegisterService eventRegisterService;

    @PostMapping(path = "/api/save-request")
    public ResponseEntity<DataRequest> SaveRequest(@RequestBody DataRequest request) {
        eventRegisterService.addEvents("SaveRequest", request);
        return ResponseEntity.ok().body(request);
    }

}
