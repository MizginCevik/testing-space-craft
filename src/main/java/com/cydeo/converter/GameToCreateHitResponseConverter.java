package com.cydeo.converter;

import com.cydeo.entity.Game;
import com.cydeo.model.response.CreateHitResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GameToCreateHitResponseConverter implements Converter<Game, CreateHitResponse> {

    @Override
    public CreateHitResponse convert(Game source) {
        CreateHitResponse createHitResponse = new CreateHitResponse();
        createHitResponse.setPlayer(source.getPlayer());
        createHitResponse.setTargets(source.getTargets());
        createHitResponse.setGameId(source.getId());
        createHitResponse.setIsEnded(source.getIsEnded());
        createHitResponse.setIsWin(source.getIsWin());
        return createHitResponse;
    }
}
