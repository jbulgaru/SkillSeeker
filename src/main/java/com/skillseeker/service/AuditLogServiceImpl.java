package com.skillseeker.service;

import com.skillseeker.model.AuditLog;
import com.skillseeker.repository.AuditLogRepository;
import com.skillseeker.service.interfaces.IAuditLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuditLogServiceImpl implements IAuditLogService {

    private final AuditLogRepository auditLogRepository;

    @Override
    public AuditLog saveAuditLog(AuditLog auditLog) {
        return auditLogRepository.save(auditLog);
    }

    @Override
    public Optional<AuditLog> findAuditLogById(Long id) {
        return auditLogRepository.findById(id);
    }

    @Override
    public List<AuditLog> findAllAuditLogs() {
        return auditLogRepository.findAll();
    }

    @Override
    public List<AuditLog> findAuditLogsByUserId(Long userId) {
        return auditLogRepository.findAll().stream()
                .filter(auditLog -> auditLog.getUser().getId().equals(userId))
                .toList();
    }

    @Override
    public void deleteAuditLogById(Long id) {
        auditLogRepository.deleteById(id);
    }
}
