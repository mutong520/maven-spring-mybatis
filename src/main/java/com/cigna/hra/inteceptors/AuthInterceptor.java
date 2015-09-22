package com.cigna.hra.inteceptors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cigna.hra.common.util.GsonUtils;

public class AuthInterceptor implements HandlerInterceptor{
	
	private Logger logger = Logger.getLogger(AuthInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		//TODO
		return true;
	}
	
	/**
	 * 返回请求
	 * @param response
	 * @param object
	 */
	public void ResponsePrint(HttpServletResponse response, Object object){
		PrintWriter out = null;
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		logger.info(GsonUtils.toJson(object));
		try {
			out = response.getWriter();
			out.append(GsonUtils.toJson(object));
		}catch (IOException e) {  
	        e.printStackTrace();  
	    } finally {  
	        if (out != null) {  
	            out.close();  
	        }  
	    } 
	}

}
