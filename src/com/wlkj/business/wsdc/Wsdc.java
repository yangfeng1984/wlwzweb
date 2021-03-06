package com.wlkj.business.wsdc;

import java.util.List;
import com.jfinal.plugin.activerecord.Model;

/**
 * 网上调查.
 */
@SuppressWarnings("serial")
public class Wsdc extends Model<Wsdc> {
	public static final Wsdc me = new Wsdc();
	public static final WsdcService wsdcService = new WsdcService();

	/**
	 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public List<Wsdc> findAll() {
		return find("select * from blog order by id asc");
	}
}
