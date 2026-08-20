select DEPT.name as Department, EMP.name as Employee, EMP.salary as Salary
From Department DEPT,Employee EMP Where EMP.departmentId=DEPT.id and (EMP.departmentId,salary) in 
(select departmentId,Max(salary) from Employee group by departmentId);