package com.cydeo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
public class Player extends BaseEntity  {
    private String username;
    private Integer health;
    private Integer armor;
    private Integer shootPower;

    @OneToOne
    @JoinColumn
    @JsonIgnore
    private Game game;
}
