package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianyingtuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianyingtuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianyingtuijianView;


/**
 * 电影推荐评论表
 *
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public interface DiscussdianyingtuijianService extends IService<DiscussdianyingtuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianyingtuijianVO> selectListVO(Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	
   	DiscussdianyingtuijianVO selectVO(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	
   	List<DiscussdianyingtuijianView> selectListView(Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	
   	DiscussdianyingtuijianView selectView(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	

}

