package com.ddastudio.fishing.boats;


import com.ddastudio.fishing.common.audit.Audit;
import com.ddastudio.fishing.common.audit.AuditListener;
import com.ddastudio.fishing.common.audit.Auditable;
import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@EntityListeners(AuditListener.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "boat_master")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Boat implements Auditable {
    @NotNull
    private Integer appId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private Integer type;
    private Integer captainId;
    private Integer capacity;
    @NotNull
    private String fromTime;
    private String toTime;
    private Integer price;
    private String info;
    private LocalDateTime cancelDate;
    @Type(type = "json")
    @Column(name = "fish_type", columnDefinition = "json")
    private List<JsonNode> fishType;
    @Type(type = "json")
    @Column(name = "location", columnDefinition = "json")
    private JsonNode location;
    @Type(type = "json")
    @Column(name = "images", columnDefinition = "json")
    private List<JsonNode> images;

    @Embedded
    Audit audit;





}
