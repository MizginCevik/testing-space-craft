package com.cydeo.service;

import com.cydeo.entity.Target;
import com.cydeo.enumtype.Level;

import java.util.Set;

public interface CreateTargetService {
    Set<Target> createTargets(Level level);
}
