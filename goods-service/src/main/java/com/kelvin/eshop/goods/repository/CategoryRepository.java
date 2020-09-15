package com.kelvin.eshop.goods.repository;

import com.kelvin.eshop.goods.entity.Category;
import com.kelvin.eshopbackend.base.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 14:57
 * @description:
 */
@Repository
public interface CategoryRepository extends BaseRepository<Category,String> {


    @Query("select c from Category c where c.enabled = true and c.parent.id = :parentId")
    List<Category> findAllByParentId(@Param("parentId") String parentId);
}
