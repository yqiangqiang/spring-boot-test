package com.yqq.repository;

import com.yqq.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color,Long> {


    public Color findById(String value);


}
