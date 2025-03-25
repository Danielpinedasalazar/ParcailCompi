package com.elitewings.elitewingsapi.service;

import com.elitewings.elitewingsapi.dto.SecurityReportDTO;
import com.elitewings.elitewingsapi.entity.SecurityReport;

import java.util.List;
import java.util.UUID;

public interface SecurityReportService {
    SecurityReport fileReport(SecurityReportDTO dto);
    List<SecurityReport> getUnresolvedReports();
    SecurityReport resolveReport(UUID reportId);
}
