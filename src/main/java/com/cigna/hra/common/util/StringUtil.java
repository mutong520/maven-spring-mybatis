package com.cigna.hra.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	public static String[] ILLEGAL_STRING = new String[]{"and","exec","execute","insert","select",
		"delete","update","count","drop","char","declare","sitename","table","grant","from","use",
		"truncate","master","mid","union","order","by","count","table_schema","chr","xp_cmdshell"};

	/**
	 * 替换非法字符，防止sql注入
	 * @param content
	 * @return
	 */
	public static String replaceIllegalContent(String content){

		String regEx="[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";     
		Pattern p = Pattern.compile(regEx);        
		Matcher m = p.matcher(content);        
		String result = m.replaceAll("").trim();
		result = result.toLowerCase();
		int size = ILLEGAL_STRING.length;
		for(int i=0; i<size; i++){
			result = result.replaceAll(ILLEGAL_STRING[i], "");
		}
		return result;
	}

	/**
	 * Str.length Overlength length?
	 * @param str
	 * @param length
	 * @return
	 */
	public static Boolean isOverlength(String str, int length){
		return str.length() > length;
	}


}
