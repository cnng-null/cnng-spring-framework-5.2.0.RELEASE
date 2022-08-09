package com.cnng.testioc;

import com.cnng.testioc.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @authoor linghuchong
 * @className TestIoc
 * @description com.cnng.testioc
 * @date 2022/8/8
 */
@Component
public class TestIoc {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
//		System.out.println(classPathXmlApplicationContext);

/*		// 注解方式如果使用空参构建函数必须要手动调用register()和refresh()方法[不然bean是没有初始化或创建的 那这个时候有ioc容器吗? 应该有吧 如果说有 那再调用register和refresh是在干嘛?
		// 应该只是把spring启动了吧 没有下面的register怎么扫描 这个时候 应该只是实例化了一个applicationContext()[那这样説 这个时候有应用上下文了 但是是空的 只是new了一个空的容器]
		// ]
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(TestIocConfiguration.class);
		annotationConfigApplicationContext.refresh();
		// bean名称默认是首字母小写的驼峰形式 studet而不是Student
		Student student = (Student)annotationConfigApplicationContext.getBean("student");
		System.out.println(student);*/
		// 如果使用构造方法中参数为Class的构造方法 就会自动调register()和refresh()方法 对bean进行初始化了

		// 可以传多个配置类进来【参数类型是多参数的】
		//创建ApplicationContext实例 过程中会实例化及调用register(xxx.class)及refresh()方法
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestIocConfiguration.class);
		Student student = (Student)annotationConfigApplicationContext.getBean("student");
		System.out.println(student);

	}

}
