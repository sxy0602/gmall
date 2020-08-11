package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shixueyan
 * @email ahshixueyan@qq.com
 * @date 2020-08-10 17:15:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
