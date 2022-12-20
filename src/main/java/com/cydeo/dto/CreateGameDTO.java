package com.cydeo.dto;

import com.cydeo.enumtype.Boost;
import com.cydeo.enumtype.Level;
import lombok.Data;

@Data
public class CreateGameDTO {
    private String username;
    private Level level;
    private Boost boost;
}
