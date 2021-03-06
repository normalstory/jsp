package user.model;

import java.util.Date;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserVo implements HttpSessionBindingListener{
	private String	userId;
	private	String	userNm;
	private	String	userAlias;
	private	String	pass;
	private	String	picture_path;
	private	String	reg_id;
	private	Date	reg_dt;
	
	public UserVo(String userId, String userNm, String userAlias, String pass, String reg_id, String picture_path) {
		this.userId			=	userId;
		this.userNm			=	userNm;
		this.userAlias		=	userAlias;
		this.pass			=	pass;
		this.reg_id			=	reg_id;
		this.picture_path	=	picture_path;
	}
	
	public UserVo() {
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNm() {
		return userNm;
	}
	public String getUserNm_fm() {
		return "*** " +  userNm + " ***";
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserAlias() {
		return userAlias;
	}
	public void setUserAlias(String userAlias) {
		this.userAlias = userAlias;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPicture_path() {
		return picture_path;
	}
	public void setPicture_path(String picture_path) {
		this.picture_path = picture_path;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public Date getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}
	
	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", userNm=" + userNm + ", userAlias=" + userAlias + ", pass=" + pass
				+ ", picture_path=" + picture_path + ", reg_id=" + reg_id + ", reg_dt=" + reg_dt + "]";
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("sessionBinding valueBound");
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("sessionBinding valueUnBound");
	}	
}
