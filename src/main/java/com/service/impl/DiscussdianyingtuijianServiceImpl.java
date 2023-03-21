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


import com.dao.DiscussdianyingtuijianDao;
import com.entity.DiscussdianyingtuijianEntity;
import com.service.DiscussdianyingtuijianService;
import com.entity.vo.DiscussdianyingtuijianVO;
import com.entity.view.DiscussdianyingtuijianView;

@Service("discussdianyingtuijianService")
public class DiscussdianyingtuijianServiceImpl extends ServiceImpl<DiscussdianyingtuijianDao, DiscussdianyingtuijianEntity> implements DiscussdianyingtuijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianyingtuijianEntity> page = this.selectPage(
                new Query<DiscussdianyingtuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussdianyingtuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianyingtuijianEntity> wrapper) {
		  Page<DiscussdianyingtuijianView> page =new Query<DiscussdianyingtuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianyingtuijianVO> selectListVO(Wrapper<DiscussdianyingtuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianyingtuijianVO selectVO(Wrapper<DiscussdianyingtuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianyingtuijianView> selectListView(Wrapper<DiscussdianyingtuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianyingtuijianView selectView(Wrapper<DiscussdianyingtuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
