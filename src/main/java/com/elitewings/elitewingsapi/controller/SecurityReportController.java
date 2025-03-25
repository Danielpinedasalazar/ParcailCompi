package com.elitewings.elitewingsapi.controller;

import com.elitewings.elitewingsapi.dto.SecurityReportDTO;
import com.elitewings.elitewingsapi.entity.SecurityReport;
import com.elitewings.elitewingsapi.service.SecurityReportService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/security-reports")
public class SecurityReportController {

    private final SecurityReportService reportService;

    public SecurityReportController(SecurityReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public ResponseEntity<SecurityReport> fileReport(@Valid @RequestBody SecurityReportDTO dto) {
        return ResponseEntity.ok(reportService.fileReport(dto));
    }

    @GetMapping("/unresolved")
    public ResponseEntity<List<SecurityReport>> getUnresolvedReports() {
        return ResponseEntity.ok(reportService.getUnresolvedReports());
    }

    @PatchMapping("/{id}/resolve")
    public ResponseEntity<SecurityReport> resolveReport(@PathVariable UUID id) {
        return ResponseEntity.ok(reportService.resolveReport(id));
    }
}
