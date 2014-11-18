package com.wlkj.business.ldxx;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

/**
 * 领导信箱(市长信箱).
 */
@SuppressWarnings("serial")
public class Ldxx extends Model<Ldxx> {
	public static final Ldxx me = new Ldxx();
	public static final LdxxService ldxxService = new LdxxService();

	/**
	 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public List<Ldxx> findAll() {
		return find("select * from blog order by id asc");
	}
}
