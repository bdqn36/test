package cn.appsys.pojo;

import java.util.Date;

//开发者用户表
public class DevUser {

	private Integer id;//主键id
	private String devCode;//开发者账号
	private String devName;//开发者名称
	private String devPassword;//开发者密码
	private String devEmail; //开发者电子邮箱
	private Integer createBy;//创建者 来源于BackendUser的用户id
	private Date creationDate;//创建时间
	private Integer modifyBy; //更新着好 来源于BackendUser用户表的用户id
	private Date modifyDate;//最新更新时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDevCode() {
		return devCode;
	}
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevPassword() {
		return devPassword;
	}
	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}
	public String getDevEmail() {
		return devEmail;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
