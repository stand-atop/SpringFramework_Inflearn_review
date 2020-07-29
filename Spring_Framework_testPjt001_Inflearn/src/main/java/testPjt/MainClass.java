package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String [] args) {
	
		/* ioc(applicationContext.xml)에서 생성했으므로 주석처리
		TranspotationWalk transpotationWalk = new TranspotationWalk();
		transpotationWalk.move(); */
		
		//applicationContext.xml 접근 방법 - GenericApplicationContext : applicationContext을 가져오는 클래스, GenericXmlApplicationContext : .xml 타입의 applicationContext를 가져오는 클래스
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml"); //applicationContext.xml 파일을 가져와 container(IoC)를 만듬
		
		//위에서 만든 컨테이너 ctx에서 객체를 가져와 transpotationWalk에 담음
		TranspotationWalk transpotationWalk = ctx.getBean("tWalk", TranspotationWalk.class);
		transpotationWalk.move(); //move 호출
		
		ctx.close(); //불러온 객체 반환
		
	}
}
