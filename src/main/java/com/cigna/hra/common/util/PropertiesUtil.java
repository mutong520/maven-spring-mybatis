package com.cigna.hra.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cigna.hra.common.util.PropertiesUtil;

public class PropertiesUtil {

	private static Properties properties = new Properties();
	private static Log LOGGER = LogFactory.getLog(PropertiesUtil.class);
	private static InputStream propretiesFile = null;

	private PropertiesUtil() {
	}

	static {
		try {
			loadFile("activity.properties");
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	public static void loadFile(String filename) throws IOException {
		try {
			propretiesFile = PropertiesUtil.class.getResourceAsStream("/" + filename);
			properties.load(propretiesFile);
			propretiesFile.close();
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
			if (propretiesFile != null) {
				propretiesFile.close();
			}
		} finally {
			if (propretiesFile != null) {
				propretiesFile.close();
			}
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	/*
	 * public static void main(String[] args) { System.out.println(PropertiesUtil.getProperty("redis0.host")); }
	 */
}
