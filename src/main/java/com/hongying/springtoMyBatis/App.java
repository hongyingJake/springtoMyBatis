package com.hongying.springtoMyBatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hongying.bean.student;
import com.hongying.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-dispatch.xml");
        StudentService service=context.getBean(StudentService.class);
        //2、查询
		Map<String, String> parms = new HashMap<String, String>();
		// 注意：由于判断是否==,必须是应用类型，使用2整形比较都是false
		parms.put("clsId", "two");
		List<student> lst = service.queryStudentById(parms);
		System.out.println("查询结果：================" + lst.size());
    }
}
