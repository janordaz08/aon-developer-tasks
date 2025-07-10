package aon.developer.business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import aon.developer.config.LogExecutionTime;

@Service
public class MyIncDec implements IncDec {

	private int x;

	public MyIncDec(@Value("${my.service.someIntValue}") int x) {
		this.x = x;
	}

	@LogExecutionTime
	public void increment() {
		this.x++;
	}

	@LogExecutionTime
	public void decrement() {
		this.x--;
	}

}
