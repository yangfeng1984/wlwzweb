package com.wlkj.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;
import com.wlkj.business.sy.SyController;
import com.wlkj.business.zcyh.ZcyhController;
import com.wlkj.common.action.IndexController;

/**
 * API引导式配置
 */
public class SysConfig extends JFinalConfig {

	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		loadPropertyFile("config.properties"); // 加载少量必要配置，随后可用getProperty(...)获取值
		me.setDevMode(getPropertyToBoolean("devMode", false));
		me.setViewType(ViewType.JSP); // 设置视图类型为Jsp，否则默认为FreeMarker
		//me.setUrlParaSeparator(",");
		me.setMaxPostSize(209715200);// 设置200M
	}

	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		// 第三个参数为该Controller的视图存放路径,默认与第一个参数值相同
		me.add("/", IndexController.class, "/index");
		me.add("/sy", SyController.class);
		me.add("/zcyh", ZcyhController.class);
	}

	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
		// 配置数据库连接池插件

		// DruidPlugin druidPlugin = new DruidPlugin(
		// getProperty("jdbcUrl").trim(), getProperty("user").trim(),
		// getProperty("password").trim());
		// me.add(druidPlugin);
		// 配置ActiveRecord插件
		// ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		// me.add(arp);
		// arp.addMapping("blog", Blog.class); // 映射blog 表到 Blog模型

	}

	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {

	}

	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {

	}

	/**
	 * 建议使用 JFinal 手册推荐的方式启动项目 运行此 main
	 * 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 */
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}
}
