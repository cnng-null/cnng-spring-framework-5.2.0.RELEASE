package com.cnng.testioc.domain;

import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @authoor linghuchong
 * @className Student
 * @description com.cnng.testioc.domain
 * @date 2022/8/8
 */
@Component
public class Student {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
