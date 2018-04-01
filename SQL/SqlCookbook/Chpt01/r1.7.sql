-- 1.7 Concatenating column values
-- MySQL solution

select concat(ename, ' WORKS AS A ', job) as msg
  from emp
where deptno=10
