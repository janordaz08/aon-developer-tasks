package aon.developer.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeLogger {

	@Around("@annotation(aon.developer.config.LogExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();

		// Code to execute before the method
		System.out.println("Class " + joinPoint.getSignature().getDeclaringType().getName() + ", Method " + joinPoint.getSignature().getName() + " started.");
		Object result = joinPoint.proceed(); // Execute the actual method

		long endTime = System.currentTimeMillis();

		// Code to execute after the method
		System.out.println(
				"Class " + joinPoint.getSignature().getDeclaringType().getName() + ", Method " + joinPoint.getSignature().getName() + " finished in " + (endTime - startTime) + "ms.");

		return result;
	}

}
