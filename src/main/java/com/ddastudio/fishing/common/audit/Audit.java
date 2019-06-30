package com.ddastudio.fishing.common.audit;

import lombok.Data;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Data
public class Audit {

    LocalDateTime created;
    LocalDateTime updated;
    String useYn;

}
