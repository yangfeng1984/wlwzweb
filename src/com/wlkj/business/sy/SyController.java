package com.wlkj.business.sy;

import com.jfinal.core.Controller;
import com.jfinal.log.Logger;

/**
 * SyController
 */
public class SyController extends Controller {
	private Logger log = Logger.getLogger(getClass());

	public void index() {
		render("/index.jsp");
	}
}
