package com.wlkj.business.ldxx;

import com.jfinal.core.Controller;
import com.jfinal.log.Logger;

/**
 * LdxxController
 */
public class LdxxController extends Controller {
	private Logger log = Logger.getLogger(getClass());

	public void index() {
		render("/index.jsp");
	}
}
