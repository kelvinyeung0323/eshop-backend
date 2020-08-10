package com.kelvin.eshopbackend.service.impl;

import com.kelvin.eshopbackend.entity.GoodsAttribute;
import com.kelvin.eshopbackend.entity.GoodsSku;
import com.kelvin.eshopbackend.repository.GoodsAttributeRepository;
import com.kelvin.eshopbackend.repository.GoodsRepository;
import com.kelvin.eshopbackend.repository.GoodsSkuRepository;
import com.kelvin.eshopbackend.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.List;
import java.util.Optional;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 17:10
 * @description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private GoodsSkuRepository goodsSkuRepository;

    @Autowired
    private GoodsAttributeRepository goodsAttributeRepository;

    @Override
    public GoodsSku getGoodsByAttribute(String goodsId, String goodsSkuId, String attrs) {
        Specification<GoodsSku> spec = new Specification<GoodsSku>() {
            @Override
            public Predicate toPredicate(Root<GoodsSku> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

                Path<Object> goodsIdPath = root.get("goodsId");
                Path<Object> goodsSkuIdPath = root.get("goodsSkuId");
                Path<Object> attributesPath = root.get("attributes");

                if(StringUtils.isNotBlank(goodsSkuId)){

                    return cb.equal(goodsSkuIdPath,goodsSkuId);
                }
                Predicate p1 = cb.equal(goodsIdPath,goodsId);
                Predicate p2 = cb.equal(attributesPath,attrs);
                return cb.and(p1,p2);
            }
        };
        return goodsSkuRepository.findOne(spec).get();
    }

    @Override
    public List<GoodsAttribute> getGoodsAttribute(String goodsId) {
      return   goodsAttributeRepository.findAllByGoodsId(goodsId);
    }

    @Override
    public List<GoodsSku> getGoodsSkusByGoodsId(String goodsId) {
       return goodsSkuRepository.findAllByGoodsId(goodsId);

    }
}
