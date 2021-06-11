package com.example.oracle12ctest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Oracle12cTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("jUnit test success.");
        System.out.println("oracle 12c버전 douzone DB에 전체 권한을 주면 프리징 걸리는 현상 확인.");
        System.out.println("권한을 수동으로 sql developer에서 설정합니다. . . . .");
    }

}
