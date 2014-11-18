package com.wlkj.business.sy;

import java.util.List;
import com.jfinal.plugin.activerecord.Model;

/**
 * 首页.
 */
@SuppressWarnings("serial")
public class Sy extends Model<Sy> {
	public static final Sy me = new Sy();
	public static final SyService syService = new SyService();

	/**
	 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public List<Sy> findAll() {
		return find("select * from blog order by id asc");
	}
}
