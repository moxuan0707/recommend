package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyingtuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianyingtuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingtuijianView;


/**
 * 电影推荐
 *
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public interface DianyingtuijianService extends IService<DianyingtuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyingtuijianVO> selectListVO(Wrapper<DianyingtuijianEntity> wrapper);
   	
   	DianyingtuijianVO selectVO(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
   	
   	List<DianyingtuijianView> selectListView(Wrapper<DianyingtuijianEntity> wrapper);
   	
   	DianyingtuijianView selectView(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyingtuijianEntity> wrapper);
   	

}

