package com.dao;

import com.entity.DianyingtuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyingtuijianVO;
import com.entity.view.DianyingtuijianView;


/**
 * 电影推荐
 * 
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public interface DianyingtuijianDao extends BaseMapper<DianyingtuijianEntity> {
	
	List<DianyingtuijianVO> selectListVO(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
	
	DianyingtuijianVO selectVO(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
	
	List<DianyingtuijianView> selectListView(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);

	List<DianyingtuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
	
	DianyingtuijianView selectView(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
	

}
