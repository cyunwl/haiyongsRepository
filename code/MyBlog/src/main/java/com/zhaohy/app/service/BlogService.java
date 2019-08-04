package com.zhaohy.app.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface BlogService {

	/**
	 * 上传文件
	 * @param request
	 * @param paramsMap
	 * @return
	 */
	String uploadBlog(HttpServletRequest request, Map<String, Object> paramsMap);

	/**
	 * 获取文集数据
	 * @param request
	 * @param paramsMap
	 * @return
	 */
	List<Map<String, Object>> getCollectionList(HttpServletRequest request, Map<String, Object> paramsMap);

	/**
	 * 获取文章
	 * @param request
	 * @param paramsMap
	 * @return
	 */
	List<Map<String, Object>> getBlogList(HttpServletRequest request, Map<String, Object> paramsMap);

}
