package com.dynamic.web.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

public class WebUtil {

	public static String getCurrentURL(HttpServletRequest request) {
		String currentURL = null;
		if (request == null)
			return currentURL;
		StringBuilder sb = new StringBuilder();
		sb.append(request.getRequestURL());
		String queryString = request.getQueryString();
		if (StringUtils.isNotBlank(queryString)) {
			sb.append("?").append(queryString);
		}
		return sb.toString();
	}

}
