package aon.developer.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class StartUpPostConstruct {

	@Autowired
	MyIncDec myIncDec;
	
	@PostConstruct
	public void postConstruct() {
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
		myIncDec.decrement();
	}
}
