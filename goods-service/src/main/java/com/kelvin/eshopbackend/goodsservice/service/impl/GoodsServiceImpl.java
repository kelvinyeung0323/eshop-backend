package com.kelvin.eshopbackend.goodsservice.service.impl;

import com.kelvin.eshopbackend.base.entity.GoodsAttribute;
import com.kelvin.eshopbackend.base.entity.GoodsSku;
import com.kelvin.eshopbackend.base.service.GoodsService;
import com.kelvin.eshopbackend.goodsservice.repository.GoodsAttributeRepository;
import com.kelvin.eshopbackend.goodsservice.repository.GoodsRepository;
import com.kelvin.eshopbackend.goodsservice.repository.GoodsSkuRepository;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author: Kelvin Yeuung
 * @createdAt: 2020/8/10 17:10
 * @description:
 */
@Service(protocol = "rest")
@RequestMapping("/goods")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private GoodsSkuRepository goodsSkuRepository;

    @Autowired
    private GoodsAttributeRepository goodsAttributeRepository;
    @Override
    @GetMapping("/")
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
