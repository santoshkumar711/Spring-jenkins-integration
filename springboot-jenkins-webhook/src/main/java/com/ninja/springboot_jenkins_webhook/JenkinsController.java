package com.ninja.springboot_jenkins_webhook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
@RequestMapping("/test")
public String test()
{
	return "hello test for jenkins";
}
@RequestMapping("/hello")
public String hello()
{
	return "hello springboot with jenkins";
}
}
