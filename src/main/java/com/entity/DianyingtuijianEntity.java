package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电影推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
@TableName("dianyingtuijian")
public class DianyingtuijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianyingtuijianEntity() {
		
	}
	
	public DianyingtuijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 排名
	 */
					
	private String paiming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：排名
	 */
	public void setPaiming(String paiming) {
		this.paiming = paiming;
	}
	/**
	 * 获取：排名
	 */
	public String getPaiming() {
		return paiming;
	}
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
