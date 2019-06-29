package com.ddastudio.fishing.accounts.domain;

import com.ddastudio.fishing.common.Audit;
import com.ddastudio.fishing.common.AuditListener;
import com.ddastudio.fishing.common.Auditable;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@EntityListeners(AuditListener.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Auditable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String phoneNo;
    private Integer appId;
    private String name;
    private String avatar;
    private String role;
    private String captainYn;
    private String provider;
    private String providerUid;
    private LocalDate cancelDate;
    private String email;
    private String pw;
    private String refresh_token;
    private String emailCheck;
    private String accountStatus;

    @Embedded
    private Audit audit;
}
