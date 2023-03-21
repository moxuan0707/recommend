package com.dao;

import com.entity.DiscussdianyingtuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianyingtuijianVO;
import com.entity.view.DiscussdianyingtuijianView;


/**
 * 电影推荐评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public interface DiscussdianyingtuijianDao extends BaseMapper<DiscussdianyingtuijianEntity> {
	
	List<DiscussdianyingtuijianVO> selectListVO(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
	
	DiscussdianyingtuijianVO selectVO(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
	
	List<DiscussdianyingtuijianView> selectListView(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);

	List<DiscussdianyingtuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
	
	DiscussdianyingtuijianView selectView(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
	

}
