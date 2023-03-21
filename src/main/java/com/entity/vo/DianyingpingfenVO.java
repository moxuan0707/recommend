package com.entity.vo;

import com.entity.DianyingpingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电影评分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public class DianyingpingfenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影类型
	 */
	
	private String dianyingleixing;
		
	/**
	 * 电影评分
	 */
	
	private String dianyingpingfen;
		
	/**
	 * 评分日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenriqi;
		
	/**
	 * 电影封面
	 */
	
	private String dianyingfengmian;
		
	/**
	 * 评分内容
	 */
	
	private String pingfenneirong;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
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
	 * 设置：电影评分
	 */
	 
	public void setDianyingpingfen(String dianyingpingfen) {
		this.dianyingpingfen = dianyingpingfen;
	}
	
	/**
	 * 获取：电影评分
	 */
	public String getDianyingpingfen() {
		return dianyingpingfen;
	}
				
	
	/**
	 * 设置：评分日期
	 */
	 
	public void setPingfenriqi(Date pingfenriqi) {
		this.pingfenriqi = pingfenriqi;
	}
	
	/**
	 * 获取：评分日期
	 */
	public Date getPingfenriqi() {
		return pingfenriqi;
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
	 * 设置：评分内容
	 */
	 
	public void setPingfenneirong(String pingfenneirong) {
		this.pingfenneirong = pingfenneirong;
	}
	
	/**
	 * 获取：评分内容
	 */
	public String getPingfenneirong() {
		return pingfenneirong;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
