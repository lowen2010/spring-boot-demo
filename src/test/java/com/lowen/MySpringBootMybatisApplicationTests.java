//package com.lowen;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.lowen.bus.bean.ProductInfo;
//import com.lowen.bus.service.ProdSerice;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MySpringBootMybatisApplicationTests {
//
//	@Autowired
//	private ProdSerice prodSerice;
//	
//	@Test
//	public void contextLoads() {
//		List<ProductInfo> list = prodSerice.queryProdByName("小雨伞-平安少儿意外险");
//		System.out.println("list size ="+ list.size());
//	}
//
//}
