package com.fulai.mushroom.dao;

import com.fulai.mushroom.entity.Case;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseMapper {
    List<Case> findCase();
}
