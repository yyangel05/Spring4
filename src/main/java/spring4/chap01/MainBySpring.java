package spring4.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBySpring {
	
	public static void main(String[] args) {
		String configLocation = "classpath:applicationContext.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Project project = ctx.getBean("sampleProject", Project.class);
		project.build();
		ctx.close();
	}

}


/*
//실행결과
7월 09, 2018 1:14:07 오후 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
정보: Loading XML bean definitions from class path resource [applicationContext.xml]
7월 09, 2018 1:14:08 오후 org.springframework.context.support.GenericXmlApplicationContext prepareRefresh
정보: Refreshing org.springframework.context.support.GenericXmlApplicationContext@4783da3f: startup date [Mon Jul 09 13:14:08 KST 2018]; root of context hierarchy
MavenBuildRunner.build()실행 
메이븐 경로 : c:\apache-maven-3.1.1
소스 경로 : src/
소스 경로 : srcResources/
클래스파일 경로 : bin/
7월 09, 2018 1:14:08 오후 org.springframework.context.support.GenericXmlApplicationContext doClose
정보: Closing org.springframework.context.support.GenericXmlApplicationContext@4783da3f: startup date [Mon Jul 09 13:14:08 KST 2018]; root of context hierarchy

*/