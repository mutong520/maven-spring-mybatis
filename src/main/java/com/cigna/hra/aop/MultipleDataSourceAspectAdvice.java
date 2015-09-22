package com.cigna.hra.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.cigna.hra.datasource.MultipleDataSource;

@Component
@Aspect
@Order(1)
public class MultipleDataSourceAspectAdvice {

	@Around("execution(* com.cigna.hra.service.activity.impl.*.*(..))")
	public Object doDefaultDB(ProceedingJoinPoint jp) throws Throwable {
		MultipleDataSource.setDataSourceKey("dataSource");
		return jp.proceed();
	}
	
}
