package com.wlkj.business.wsdc;

import com.jfinal.core.Controller;
import com.jfinal.log.Logger;

/**
 * WsdcController
 */
public class WsdcController extends Controller {
	private Logger log = Logger.getLogger(getClass());

	public void index() {
		render("/index.jsp");
	}
}
