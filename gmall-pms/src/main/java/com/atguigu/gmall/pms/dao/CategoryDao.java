package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author qiguohui
 * @email 1948727809@qq.com
 * @date 2020-01-08 22:46:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
