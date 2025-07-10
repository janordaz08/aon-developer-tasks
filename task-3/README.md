# Task 3 - Review A Method

Given the code below

```java
boolean checkStudy(Student student){
    if(student.isLoggedIn()){
        if(student.getTeacherName() == "Lee") {
          if(student.isEnrolledInMaths()){
              if(student.hasDistinction())
                  return true;
          }
        }
    }
    return false;
}
```

I would comment that since you have a nested if statement here and the method returns a boolean anyway, we can just combine them into one statement and return that value immediately.


```java
boolean checkStudy(Student student){

  if(student == null) {
    //maybe throw exceptions
    return false;
  }
  
  return student.isLoggedIn() &&
          student.getTeacherName() == "Lee" &&
          student.isEnrolledInMaths() &&
          student.hasDistinction();
}
```

