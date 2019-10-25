package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

//kieu du lieu cua key primary
public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
