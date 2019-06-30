package com.ddastudio.fishing.common.audit;

public interface Auditable {
    Audit getAudit();
    void setAudit(Audit audit);
}
