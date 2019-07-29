package com.ddastudio.fishing.common.audit;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.util.Objects;

public class AuditListener {

    @PrePersist
    public void setCreatedOn(Auditable auditable) {
        Audit audit = auditable.getAudit();
        if(Objects.isNull(audit)) {
            audit = new Audit();
            auditable.setAudit(audit);
        }
        audit.setCreated(LocalDateTime.now());
        audit.setUseYn("Y");
    }

    @PreUpdate
    public void setUpdatedOn(Auditable auditable) {
        Audit audit = auditable.getAudit();
        if(Objects.isNull(audit)) {
            audit = new Audit();
            auditable.setAudit(audit);
        }
        audit.setUpdated(LocalDateTime.now());
        audit.setUseYn("Y");
    }

}
