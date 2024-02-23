package org.alexey.rentauditservice.core.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collation = "audits")
public class Audit {

    @Id
    private UUID id;

    private LocalDateTime actionDate;

    private UUID userId;

    private String userEmail;

    private String userFio;

    private UserRole userRole;

    private AuditedAction action;

    private EssenceType essenceType;

    private String essenceTypeId;

    public Audit() {
    }

    public Audit(UUID auditId,
                 LocalDateTime actionDate,
                 UUID userId,
                 String userEmail,
                 String userFio,
                 UserRole userRole,
                 AuditedAction action,
                 EssenceType essenceType,
                 String essenceTypeId) {
        this.id = auditId;
        this.actionDate = actionDate;
        this.userId = userId;
        this.userEmail = userEmail;
        this.userFio = userFio;
        this.userRole = userRole;
        this.action = action;
        this.essenceType = essenceType;
        this.essenceTypeId = essenceTypeId;
    }

    public UUID getId() {
        return id;
    }

    public Audit setId(UUID auditId) {
        this.id = auditId;
        return this;
    }

    public LocalDateTime getActionDate() {
        return actionDate;
    }

    public Audit setActionDate(LocalDateTime actionDate) {
        this.actionDate = actionDate;
        return this;
    }

    public UUID getUserId() {
        return userId;
    }

    public Audit setUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Audit setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserFio() {
        return userFio;
    }

    public Audit setUserFio(String userFio) {
        this.userFio = userFio;
        return this;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public Audit setUserRole(UserRole userRole) {
        this.userRole = userRole;
        return this;
    }

    public AuditedAction getAction() {
        return action;
    }

    public Audit setAction(AuditedAction action) {
        this.action = action;
        return this;
    }

    public EssenceType getEssenceType() {
        return essenceType;
    }

    public Audit setEssenceType(EssenceType essenceType) {
        this.essenceType = essenceType;
        return this;
    }

    public String getEssenceTypeId() {
        return essenceTypeId;
    }

    public Audit setEssenceTypeId(String essenceTypeId) {
        this.essenceTypeId = essenceTypeId;
        return this;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "id=" + id +
                ", actionDate=" + actionDate +
                ", userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userFio='" + userFio + '\'' +
                ", userRole=" + userRole +
                ", action=" + action +
                ", essenceType=" + essenceType +
                ", essenceTypeId='" + essenceTypeId + '\'' +
                '}';
    }
}
