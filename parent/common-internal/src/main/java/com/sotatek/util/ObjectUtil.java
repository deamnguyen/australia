package com.sotatek.util;

import java.util.List;
import java.util.Set;


public class ObjectUtil<T> {

	public static <T> boolean isBlank(Set<T> objects) {
		if(objects != null && objects.size() > 0) {
			return false;
		}
		return true;
	}
	
	public static <T> boolean isBlank(List<T> objects) {
		if(objects != null && objects.size() > 0) {
			return false;
		}
		return true;
	}
	
}
