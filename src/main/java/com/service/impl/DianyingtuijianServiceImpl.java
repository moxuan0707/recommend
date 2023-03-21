package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianyingtuijianDao;
import com.entity.DianyingtuijianEntity;
import com.service.DianyingtuijianService;
import com.entity.vo.DianyingtuijianVO;
import com.entity.view.DianyingtuijianView;

@Service("dianyingtuijianService")
public class DianyingtuijianServiceImpl extends ServiceImpl<DianyingtuijianDao, DianyingtuijianEntity> implements DianyingtuijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianyingtuijianEntity> page = this.selectPage(
                new Query<DianyingtuijianEntity>(params).getPage(),
                new EntityWrapper<DianyingtuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianyingtuijianEntity> wrapper) {
		  Page<DianyingtuijianView> page =new Query<DianyingtuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianyingtuijianVO> selectListVO(Wrapper<DianyingtuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianyingtuijianVO selectVO(Wrapper<DianyingtuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianyingtuijianView> selectListView(Wrapper<DianyingtuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianyingtuijianView selectView(Wrapper<DianyingtuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
