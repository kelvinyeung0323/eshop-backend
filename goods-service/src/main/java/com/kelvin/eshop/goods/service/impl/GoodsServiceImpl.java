package com.kelvin.eshop.goods.service.impl;

import com.kelvin.eshop.goods.entity.GoodsAttribute;
import com.kelvin.eshop.goods.entity.GoodsSku;
import com.kelvin.eshop.goods.repository.GoodsAttributeRepository;
import com.kelvin.eshop.goods.repository.GoodsRepository;
import com.kelvin.eshop.goods.repository.GoodsSkuRepository;
import com.kelvin.eshop.goods.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 17:10
 * @description:
 */
@DubboService
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
