package com.entity.vo;

import com.entity.DianyingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电影信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-09 21:12:16
 */
public class DianyingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
