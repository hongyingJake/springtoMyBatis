package com.hongying.filter;

import java.util.Properties;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

//自定义MyBatis插件过滤器，拦截SQL执行的query方法
@Intercepts(@Signature(type=Executor.class,method="query",args={
		MappedStatement.class,Object.class,RowBounds.class,
		ResultHandler.class
}))
public class filterQuery implements Interceptor{
	//这个方法会在Plugin的Invoke方法中进行调用
	public Object intercept(Invocation invocation) throws Throwable {
		//每次执行了拦截方法这里都会打印个日志
		System.out.println("==================执行了一次拦截方法");
		return invocation.getTarget();
	}
	public Object plugin(Object target) {
		//对Executor接口的实现类进行拦截
		if(target instanceof Executor){
			return Plugin.wrap(target, this);//返回了一个过滤器(filterQuery)的代理对象
		}
		return target;
	}
	public void setProperties(Properties properties) {
		//这个方法没有什么用
	}
}
