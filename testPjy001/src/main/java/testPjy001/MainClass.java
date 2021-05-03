package testPjy001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();

		ctx.close();
	}
}

// 스프링의 기본구조만 지킨다면 이클립스를 활용하지 않고, 직접 폴더를 생성하는 방식이어도 구현이 가능하다.