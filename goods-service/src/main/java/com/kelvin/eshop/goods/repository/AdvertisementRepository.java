package com.kelvin.eshop.goods.repository;

import com.kelvin.eshop.goods.entity.Advertisement;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 12:22
 * @description:
 */
@Repository
public interface AdvertisementRepository extends BaseRepository<Advertisement, String> {

    @Query("select a from Advertisement a where a.position = :position and a.enabled=true and a.startTime <= CURRENT_TIMESTAMP and a.endTime >= CURRENT_TIMESTAMP")
    List<Advertisement> findValidAdvertisementByPosition(@Param("position") String position);
}
