package com.ddastudio.fishing.common;

import lombok.Data;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Data
public class Audit {

    LocalDateTime created;
    LocalDateTime updated;
    private String useYn;

}
