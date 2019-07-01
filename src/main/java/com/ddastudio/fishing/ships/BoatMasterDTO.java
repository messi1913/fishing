package com.ddastudio.fishing.ships;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.*;

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





}
