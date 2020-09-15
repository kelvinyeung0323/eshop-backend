package com.kelvin.eshop.goods.repository;

import com.kelvin.eshop.goods.entity.SpecialColumn;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:17
 * @description: 专栏
 */
@Repository
public interface SpecialColumnRepository extends BaseRepository<SpecialColumn,String> {

    @Query("select s from SpecialColumn s where s.enabled = true and s.startTime <= CURRENT_TIMESTAMP  and s.endTime >= CURRENT_TIMESTAMP ")
    List<SpecialColumn> getValidSpecailColumns();
}