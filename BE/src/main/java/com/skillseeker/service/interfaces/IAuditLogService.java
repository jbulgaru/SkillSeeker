package com.skillseeker.service.interfaces;

import com.skillseeker.model.AuditLog;

import java.util.List;
import java.util.Optional;

public interface IAuditLogService {
    AuditLog saveAuditLog(AuditLog auditLog);
    Optional<AuditLog> findAuditLogById(Long id);
    List<AuditLog> findAllAuditLogs();
    void deleteAuditLogById(Long id);
}
