package org.example.controller;

import org.example.VO.SwaggerReqVO;
import org.example.VO.SwaggerResVO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@EnableAutoConfiguration //启用自动配置， 对POM中dependency的架包进行自动配置
@RestController
@RequestMapping("/swagger")
@Api(value = "user interface", tags={"user interface"})
public class MyTest
{

	@ApiOperation("save")
	@PostMapping("save")
	public String save(@RequestBody SwaggerReqVO req) {
		return "success";
	}

	@GetMapping("getById/{id}")
	@ApiOperation("get by id")
	public SwaggerResVO getById(@PathVariable Integer id){
		SwaggerResVO res = new SwaggerResVO();
		System.out.println(id);
		res.setId(id);
		return res;
	}
}
