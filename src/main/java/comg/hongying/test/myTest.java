package comg.hongying.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hongying.bean.student;
import com.hongying.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring-dispatch.xml")
public class myTest {
	//Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	StudentService service;
	@Test
	public void queryStudent(){
		//1、添加
//		student stu=new student();
//		stu.setName("haha");
//		stu.setAge(23);
//		stu.setScore(100);
//		stu.setClsId(3);
//		int i=service.saveStudent(stu);
//		System.out.println("更新结果："+i);
		
		//2、查询
		//更加map参数动态拼接SQL
		Map<String,String> parms=new HashMap<String, String>();
		//parms.put("clsId", "2");//Map参数，根据键、值判断取哪个where条件。
		//注意：由于判断是否==,必须是应用类型，使用2整形比较都是false
		parms.put("clsId", "two");
		List<student> lst= service.queryStudentById(parms);
		System.out.println("查询结果：================"+lst.size());
	}
}
