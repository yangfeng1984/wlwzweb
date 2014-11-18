package com.wlkj.business.zcyh;

import java.util.List;
import com.jfinal.plugin.activerecord.Model;

/**
 * 注册用户.
 */
@SuppressWarnings("serial")
public class Zcyh extends Model<Zcyh> {
	public static final Zcyh me = new Zcyh();
	public static final ZcyhService zcyhService = new ZcyhService();

	/**
	 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public List<Zcyh> findAll() {
		return find("select * from blog order by id asc");
	}
}
