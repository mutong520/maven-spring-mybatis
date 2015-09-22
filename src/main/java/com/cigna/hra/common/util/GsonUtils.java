package com.cigna.hra.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.reflect.TypeToken;

/**
 * @ClassName: GsonUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Jason.liang
 * @date 2015年7月16日 上午10:45:34
 *
 */ 
public class GsonUtils {

	public static String toJson(Object object) {
		Gson gson = (new GsonBuilder()).enableComplexMapKeySerialization().serializeNulls()
				.setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
		return gson.toJson(object);
	}

	/**
	 * @Title: fromJson
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param str
	 * @param @return    设定文件
	 * @return T    返回类型
	 * @throws
	 */ 
	public static <T> T fromJson(String str) {
		T t = null;
		try {
			Gson gson = new Gson();
			t = gson.fromJson(str, (new TypeToken<T>() {

			}).getType());
		} catch (Exception e) {
		}
		return t;
	}

	/**
	 * @Title: fromJson
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param jsonString
	 * @param @param cls
	 * @param @return    设定文件
	 * @return T    返回类型
	 * @throws
	 */ 
	public static <T> T fromJson(String jsonString, Class<T> cls) {
		T t = null;
		try {
			Gson gson = new Gson();
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
		}
		return t;
	}

	/**
	 * @Title: listKey
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param jsonString
	 * @param @param cls
	 * @param @return    设定文件
	 * @return List<T>    返回类型
	 * @throws
	 */ 
	public static <T> List<T> listKey(String jsonString, Class<T> cls) {
		List<T> list = new ArrayList<T>();
		try {
			Gson gson = new Gson();
			list = gson.fromJson(jsonString, new TypeToken<List<T>>() {
			}.getType());
		} catch (Exception e) {
		}
		return list;
	}

	/**
	 * @Title: listKeyMaps
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param jsonString
	 * @param @return    设定文件
	 * @return List<Map<String,Object>>    返回类型
	 * @throws
	 */ 
	public static List<Map<String, Object>> listKeyMaps(String jsonString) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			Gson gson = new Gson();
			list = gson.fromJson(jsonString, new TypeToken<List<Map<String, Object>>>() {
			}.getType());
		} catch (Exception e) {
		}
		return list;
	}
}