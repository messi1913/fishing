package com.ddastudio.fishing.common.domain;

import com.ddastudio.fishing.common.audit.Audit;
import com.ddastudio.fishing.common.audit.AuditListener;
import com.ddastudio.fishing.common.audit.Auditable;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@EntityListeners(AuditListener.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppMaster implements Auditable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private LocalDateTime cancelDate;

    @Embedded
    private Audit audit;

}

