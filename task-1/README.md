# Task 1 - Timing a method
## Part 1 and Part 2
I created a spring boot application and copied the provided IncDec interface and the MyIncDec implementation.

We have implemented a similar solution before by using annotations and Spring AOP.

I created a LogExecutionTime annotation and an ExecutionTimeLogger class. The ```logExecutionTime``` method basically intercepts all calls to a method that has the LogExecutionTime annotation log the execution time of the method.

By using annotations, I can easily add the same logging functionality across any method I want. 



