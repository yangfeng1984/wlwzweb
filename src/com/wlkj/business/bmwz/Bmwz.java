package com.wlkj.business.bmwz;

import java.util.List;
import com.jfinal.plugin.activerecord.Model;

/**
 * 部门问政.
 */
@SuppressWarnings("serial")
public class Bmwz extends Model<Bmwz> {
	public static final Bmwz me = new Bmwz();
	public static final BmwzService bmwzService = new BmwzService();

	/**
	 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public List<Bmwz> findAll() {
		return find("select * from blog order by id asc");
	}
}
