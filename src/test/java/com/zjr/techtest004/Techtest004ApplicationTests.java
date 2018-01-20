package com.zjr.techtest004;

import com.zjr.techtest004.time.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Techtest004ApplicationTests {

	@Test
	public  void test01(){
		int monthLength = DateUtil.getMonthLength(2018,2);
		System.out.println(monthLength);
	}

}
