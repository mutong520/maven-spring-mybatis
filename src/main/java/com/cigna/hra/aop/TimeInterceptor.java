package com.cigna.hra.aop;

import java.text.DecimalFormat;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: TimeInterceptor
 * @Description: 方法执行时间
 * @author Jay.Zhang
 * @date 2015-8-24 下午3:08:29
 *
 */
@Component("timeInterceptor")
public class TimeInterceptor implements MethodInterceptor {

	private Log requestParameterLog = LogFactory.getLog("REQUEST_PARAMETER_LOG");

	@Override
	@Around(value = "execution(public * com.cigna.hra.controller.*.*(..)) ")
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		long procTime = System.currentTimeMillis();
		try {
			Object result = methodInvocation.proceed();
			return result;
		} finally {
			String sec = new DecimalFormat("0.000").format(((System.currentTimeMillis() - procTime) / 1000D));
			requestParameterLog.info(sec + " sec [" + methodInvocation.getMethod().getName() + "]");
		}
	}
}
