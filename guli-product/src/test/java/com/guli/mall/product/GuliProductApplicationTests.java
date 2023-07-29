package com.guli.mall.product;

import com.guli.mall.product.entity.BrandEntity;
import com.guli.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuliProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("自律");
        brandEntity.setLogo("jbl");

        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
