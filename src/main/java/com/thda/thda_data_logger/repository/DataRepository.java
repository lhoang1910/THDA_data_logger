package com.thda.thda_data_logger.repository;

import com.thda.thda_data_logger.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataEntity, String> {
}
