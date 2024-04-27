package com.hcl.hackathon.demo.controller;

import com.hcl.hackathon.demo.domain.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("audit")
public class AuditController {

    @GetMapping("get-logs")
    public ResponseEntity<BaseResponse<?>> getAuditLogs(@RequestParam String customerId,@)
}
