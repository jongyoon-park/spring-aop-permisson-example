package com.c.aopauth;

import com.c.aopauth.entity.PermissionEntity;
import com.c.aopauth.repository.PermissionEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AopauthApplicationTests {

	@Autowired
	PermissionEntityRepository permissionEntityRepository;



	@Test
	void getPermission() {
		List<PermissionEntity> result = permissionEntityRepository.findAll();
		System.out.println("!!!!!! get result");
		for (PermissionEntity ele : result) {
			System.out.println("!!!!! ele toString : " + ele.toString());
		}
	}

	@Test
	void contextLoads() {

	}

}
