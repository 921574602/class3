package com.zr.class3.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(tags="用户管理相关接口")
public class Userapi {
	
	@GetMapping("/api")
	@ApiOperation("添加用户的接口")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "a", value = "用户名"),
        @ApiImplicitParam(name = "b", value = "用户地址", required = true)
})
	public Map infoApi(String a,int b) {
		Map map =new HashMap();
		map.put(a,b);
		map.put("code",200);
		map.put("data", "xxxx");
		map.put("desc","请求成功");
		return map;
	}
	
	@PostMapping(value = "/info5", produces = "application/json;charset=UTF-8")
	@ApiOperation("获取用户信息")
	public void login(@RequestBody JSONObject js) {
		System.out.println(js);
	}
}