package com.kelvin.eshopbackend.repository;

import com.kelvin.eshopbackend.entity.SpecialColumn;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:17
 * @description:
 */
@Repository
public interface SpecialColumnRepository extends BaseRepository<SpecialColumn,String> {

    @Query("select s from SpecialColumn s where s.enabled = true and s.startTime <= CURRENT_TIMESTAMP  and s.endTime >= CURRENT_TIMESTAMP ")
    List<SpecialColumn> getValidSpecailColumns();
}
