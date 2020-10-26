package com.SpringCheck.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired) //@Autowired : 자동 주입을 한다 -> setter를 통해서
	private Chef chef;
	//
	
	
	
	
}
