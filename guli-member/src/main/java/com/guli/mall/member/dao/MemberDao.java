package com.guli.mall.member.dao;

import com.guli.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gzc
 * @email gzc@163.com
 * @date 2023-07-30 11:33:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
