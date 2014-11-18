package com.wlkj.business.bmwz;

import com.jfinal.core.Controller;
import com.jfinal.log.Logger;

/**
 * BmwzController
 */
public class BmwzController extends Controller {
	private Logger log = Logger.getLogger(getClass());

	public void index() {
		render("/index.jsp");
	}
}
