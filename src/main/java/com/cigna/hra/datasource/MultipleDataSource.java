package com.cigna.hra.datasource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.cigna.hra.controller.ActivityController;

public class MultipleDataSource extends AbstractRoutingDataSource{
	
	private static Logger logger = Logger.getLogger(ActivityController.class);

	private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
    	logger.info("set current thread : "+Thread.currentThread().getName()+",current datasource:"+dataSource);
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
    	logger.info("get current thread : "+Thread.currentThread().getName()+",current datasource:"+dataSourceKey.get());
    	return dataSourceKey.get();
    }
	
}
