package com.ddastudio.fishing.boats;


import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import com.google.gson.JsonElement;
import lombok.*;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoatMasterDTO {
    @NotNull
    private Integer appId;
    @NotNull
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
    private JsonElement location;
    private JsonElement fishType;
    private JsonElement images;


    public static BoatMasterDTO of(BoatMasterRecord record) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(record, BoatMasterDTO.class);
    }




}
