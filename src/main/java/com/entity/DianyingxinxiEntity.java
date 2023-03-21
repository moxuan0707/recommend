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
 * 电影信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
@TableName("dianyingxinxi")
public class DianyingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianyingxinxiEntity() {
		
	}
	
	public DianyingxinxiEntity(T t) {
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
	 * 上映年份
	 */
					
	private String shangyingnianfen;
	
	/**
	 * 上映日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangyingriqi;
	
	/**
	 * 电影片段
	 */
					
	private String dianyingpianduan;
	
	/**
	 * 电影时长
	 */
					
	private String dianyingshizhang;
	
	/**
	 * 电影主演
	 */
					
	private String dianyingzhuyan;
	
	/**
	 * 电影导演
	 */
					
	private String dianyingdaoyan;
	
	/**
	 * 上映地区
	 */
					
	private String shangyingdiqu;
	
	/**
	 * 电影详情
	 */
					
	private String dianyingxiangqing;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：上映年份
	 */
	public void setShangyingnianfen(String shangyingnianfen) {
		this.shangyingnianfen = shangyingnianfen;
	}
	/**
	 * 获取：上映年份
	 */
	public String getShangyingnianfen() {
		return shangyingnianfen;
	}
	/**
	 * 设置：上映日期
	 */
	public void setShangyingriqi(Date shangyingriqi) {
		this.shangyingriqi = shangyingriqi;
	}
	/**
	 * 获取：上映日期
	 */
	public Date getShangyingriqi() {
		return shangyingriqi;
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
	 * 设置：电影时长
	 */
	public void setDianyingshizhang(String dianyingshizhang) {
		this.dianyingshizhang = dianyingshizhang;
	}
	/**
	 * 获取：电影时长
	 */
	public String getDianyingshizhang() {
		return dianyingshizhang;
	}
	/**
	 * 设置：电影主演
	 */
	public void setDianyingzhuyan(String dianyingzhuyan) {
		this.dianyingzhuyan = dianyingzhuyan;
	}
	/**
	 * 获取：电影主演
	 */
	public String getDianyingzhuyan() {
		return dianyingzhuyan;
	}
	/**
	 * 设置：电影导演
	 */
	public void setDianyingdaoyan(String dianyingdaoyan) {
		this.dianyingdaoyan = dianyingdaoyan;
	}
	/**
	 * 获取：电影导演
	 */
	public String getDianyingdaoyan() {
		return dianyingdaoyan;
	}
	/**
	 * 设置：上映地区
	 */
	public void setShangyingdiqu(String shangyingdiqu) {
		this.shangyingdiqu = shangyingdiqu;
	}
	/**
	 * 获取：上映地区
	 */
	public String getShangyingdiqu() {
		return shangyingdiqu;
	}
	/**
	 * 设置：电影详情
	 */
	public void setDianyingxiangqing(String dianyingxiangqing) {
		this.dianyingxiangqing = dianyingxiangqing;
	}
	/**
	 * 获取：电影详情
	 */
	public String getDianyingxiangqing() {
		return dianyingxiangqing;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
