package com.skillseeker;

import org.springframework.boot.SpringApplication;

public class TestThebuildersApplication {

	public static void main(String[] args) {
		SpringApplication.from(SkillSeekerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
