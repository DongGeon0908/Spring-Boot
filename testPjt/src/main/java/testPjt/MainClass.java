package testPjt;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// TranspotationWalk transpotationWalk = new TranspotationWalk();
		// transpotationWalk.move();

		// 객체를 생성할 수 있는 방법 = 컨테이너, 컨테이너에 있는 객체 = BEAN

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

		TranspotationWalk transpotationWalk = ctx.getBean("tWalk", TranspotationWalk.class);
		transpotationWalk.move();

		ctx.close();
	}
}