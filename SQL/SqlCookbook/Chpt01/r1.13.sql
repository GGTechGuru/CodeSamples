-- 1.13 Searching for patterns

select ename, job
  from emp
where deptno in (10,20)
  and (ename LIKE '%I%' or job LIKE '%ER')
