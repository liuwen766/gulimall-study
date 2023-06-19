package com.liuwen.learning.product;

import com.liuwen.learning.product.entity.BrandEntity;
import com.liuwen.learning.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
        System.out.println(Integer.MAX_VALUE);
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("哈哈1哈");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }


}
