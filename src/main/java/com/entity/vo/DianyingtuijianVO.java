package com.entity.vo;

import com.entity.DianyingtuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电影推荐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public class DianyingtuijianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影名称
	 */
	
	private String dianyingmingcheng;
		
	/**
	 * 电影类型
	 */
	
	private String dianyingleixing;
		
	/**
	 * 电影封面
	 */
	
	private String dianyingfengmian;
		
	/**
	 * 电影片段
	 */
	
	private String dianyingpianduan;
		
	/**
	 * 点赞量
	 */
	
	private String dianzanliang;
		
	/**
	 * 收藏量
	 */
	
	private String shouzangliang;
		
	/**
	 * 评分平均分
	 */
	
	private String pingfenpingjunfen;
		
	/**
	 * 电影内容
	 */
	
	private String dianyingneirong;
				
	
	/**
	 * 设置：电影名称
	 */
	 
	public void setDianyingmingcheng(String dianyingmingcheng) {
		this.dianyingmingcheng = dianyingmingcheng;
	}
	
	/**
	 * 获取：电影名称
	 */
	public String getDianyingmingcheng() {
		return dianyingmingcheng;
	}
				
	
	/**
	 * 设置：电影类型
	 */
	 
	public void setDianyingleixing(String dianyingleixing) {
		this.dianyingleixing = dianyingleixing;
	}
	
	/**
	 * 获取：电影类型
	 */
	public String getDianyingleixing() {
		return dianyingleixing;
	}
				
	
	/**
	 * 设置：电影封面
	 */
	 
	public void setDianyingfengmian(String dianyingfengmian) {
		this.dianyingfengmian = dianyingfengmian;
	}
	
	/**
	 * 获取：电影封面
	 */
	public String getDianyingfengmian() {
		return dianyingfengmian;
	}
				
	
	/**
	 * 设置：电影片段
	 */
	 
	public void setDianyingpianduan(String dianyingpianduan) {
		this.dianyingpianduan = dianyingpianduan;
	}
	
	/**
	 * 获取：电影片段
	 */
	public String getDianyingpianduan() {
		return dianyingpianduan;
	}
				
	
	/**
	 * 设置：点赞量
	 */
	 
	public void setDianzanliang(String dianzanliang) {
		this.dianzanliang = dianzanliang;
	}
	
	/**
	 * 获取：点赞量
	 */
	public String getDianzanliang() {
		return dianzanliang;
	}
				
	
	/**
	 * 设置：收藏量
	 */
	 
	public void setShouzangliang(String shouzangliang) {
		this.shouzangliang = shouzangliang;
	}
	
	/**
	 * 获取：收藏量
	 */
	public String getShouzangliang() {
		return shouzangliang;
	}
				
	
	/**
	 * 设置：评分平均分
	 */
	 
	public void setPingfenpingjunfen(String pingfenpingjunfen) {
		this.pingfenpingjunfen = pingfenpingjunfen;
	}
	
	/**
	 * 获取：评分平均分
	 */
	public String getPingfenpingjunfen() {
		return pingfenpingjunfen;
	}
				
	
	/**
	 * 设置：电影内容
	 */
	 
	public void setDianyingneirong(String dianyingneirong) {
		this.dianyingneirong = dianyingneirong;
	}
	
	/**
	 * 获取：电影内容
	 */
	public String getDianyingneirong() {
		return dianyingneirong;
	}
			
}
