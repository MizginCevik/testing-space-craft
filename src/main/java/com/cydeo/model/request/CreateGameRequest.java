package com.cydeo.model.request;

import com.cydeo.enumtype.Boost;
import com.cydeo.enumtype.Level;
import lombok.Data;

@Data
public class CreateGameRequest {
    private String username;
    private Level level;
    private Boost boost;
}
