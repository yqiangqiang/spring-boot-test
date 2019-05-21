package com.yqq.springBoot.repository;

import com.yqq.springBoot.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color,Long> {


    public Color findById(String value);


}
