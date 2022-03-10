package com.sotatek.constant;

import com.sotatek.api.ApiHeader;

public class ApiHeaderConstant {
	public static final ApiHeader SUCCESS = new ApiHeader(true);
	
	public static class COMMON {
        public static final ApiHeader NOT_EXIST = new ApiHeader("00001", "Postcode not exist");
        public static final ApiHeader NOT_FOUND = new ApiHeader("00002", "Suburb not found for postcode");
    }
}
