package com.fulai.mushroom.dao;

import com.fulai.mushroom.entity.Demo;
import org.springframework.stereotype.Repository;

/**
 * @author ：chen
 * @date ：Created in 2019/11/6 14:09
 */
@Repository
public interface demoMapper {
    Demo findDemo();
}
