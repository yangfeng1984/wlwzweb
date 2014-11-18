package com.wlkj.business.zcyh;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.jfinal.core.Controller;
import com.jfinal.kit.HttpKit;
import com.jfinal.kit.PropKit;
import com.jfinal.log.Logger;

/**
 * ZcyhController
 */
public class ZcyhController extends Controller {
	private Logger log = Logger.getLogger(getClass());
	public static final String INTERFACE_REGUSER = PropKit.get("i-reguser");

	public void index() {
		render("/page/business/zcyh/dl.jsp");
		log.debug("index");
	}

	// 登陆
	public void dl() {
		Map msg = new HashMap();
		msg.put("t", "getuser");// 接口名称
		msg.put("name", "zhujun");// 用户名
		String json = JSONObject.fromObject(msg).toString();
		String userasjson = HttpKit.post(INTERFACE_REGUSER, json);
		log.debug("返回值:" + userasjson);
		render("/WEB-INF/page/business/zcyh/dl.jsp");
	}

	// 注册
	public void zc() {

		render("/WEB-INF/page/business/zcyh/zc.jsp");
	}

}
