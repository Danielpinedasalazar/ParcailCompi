package com.elitewings.elitewingsapi.service.impl;

import com.elitewings.elitewingsapi.dto.SecurityReportDTO;
import com.elitewings.elitewingsapi.entity.Flight;
import com.elitewings.elitewingsapi.entity.SecurityReport;
import com.elitewings.elitewingsapi.repository.FlightRepository;
import com.elitewings.elitewingsapi.repository.SecurityReportRepository;
import com.elitewings.elitewingsapi.service.SecurityReportService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SecurityReportServiceImpl implements SecurityReportService {

    private final SecurityReportRepository reportRepository;
    private final FlightRepository flightRepository;

    public SecurityReportServiceImpl(SecurityReportRepository reportRepository, FlightRepository flightRepository) {
        this.reportRepository = reportRepository;
        this.flightRepository = flightRepository;
    }

    @Override
    public SecurityReport fileReport(SecurityReportDTO dto) {
        Flight flight = flightRepository.findById(dto.getFlightId())
                .orElseThrow(() -> new EntityNotFoundException("Vuelo no encontrado"));

        SecurityReport report = new SecurityReport();
        report.setFlight(flight);
        report.setReportedBy(dto.getReportedBy());
        report.setDescription(dto.getDescription());

        return reportRepository.save(report);
    }

    @Override
    public List<SecurityReport> getUnresolvedReports() {
        return reportRepository.findByIsResolvedFalse();
    }

    @Override
    public SecurityReport resolveReport(UUID reportId) {
        SecurityReport report = reportRepository.findById(reportId)
                .orElseThrow(() -> new EntityNotFoundException("Reporte no encontrado"));
        report.setResolved(true);
        return reportRepository.save(report);
    }
}
