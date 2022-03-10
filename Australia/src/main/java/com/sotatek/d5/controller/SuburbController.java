package com.sotatek.d5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sotatek.SuburbRequest;
import com.sotatek.api.ApiResponse;
import com.sotatek.common.Suburb;
import com.sotatek.constant.ApiHeaderConstant;
import com.sotatek.d5.repository.SuburbRepository;
import com.sotatek.util.ObjectUtil;

@RestController
@RequestMapping("/suburb")
public class SuburbController {
	
	@PostMapping("/postcode")
    public ApiResponse<List<Suburb>> getByPostcode(@RequestBody SuburbRequest suburbRequest) {
		if (!ObjectUtil.isBlank(suburbRequest.getPostcodes())) {
			List<Suburb> result = new ArrayList<>();
            for(String postcode: suburbRequest.getPostcodes()) {
            	List<Suburb> list = SuburbRepository.suburbRepository.getByPostcode(postcode);
            	if(!ObjectUtil.isBlank(list)) {
            		result.addAll(list);
            	}
            }
            if(!ObjectUtil.isBlank(result)) {
            	SuburbRepository.suburbRepository.sort(result);
            	return new ApiResponse<>(ApiHeaderConstant.SUCCESS, result);
            } else {
            	return new ApiResponse<>(ApiHeaderConstant.COMMON.NOT_FOUND, null);
            }
        }
		return new ApiResponse<>(ApiHeaderConstant.COMMON.NOT_EXIST, null);
		
    }
	
	@PostMapping("/all")
    public ApiResponse<List<Suburb>> getAll() {
		SuburbRepository.suburbRepository.sort();
		return new ApiResponse<>(ApiHeaderConstant.SUCCESS, SuburbRepository.suburbRepository.getAll());
		
    }
}
