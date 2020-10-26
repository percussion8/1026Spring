package com.SpringCheck.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
								//AACD만 치고 단축키 하면 자동완성, 자동임포트
	@Override
	protected Class<?>[] getRootConfigClasses() { //root-context.xml을 대신하는 클래스를 지정
		// TODO Auto-generated method stub
		return new Class[] {RootConfig.class}; //@Configuration을 이용하여 bean객체생성
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

}
