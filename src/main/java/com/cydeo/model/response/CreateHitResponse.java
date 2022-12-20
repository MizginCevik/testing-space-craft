package com.cydeo.model.response;

import com.cydeo.entity.Player;
import com.cydeo.entity.Target;
import lombok.Data;

import java.util.Set;

@Data
public class CreateHitResponse {
    private String responseMessage;
    private Boolean isEnded = false;
    private Boolean isWin = false;
    private Player player;
    private Set<Target> targets;
    private Long gameId;
}
