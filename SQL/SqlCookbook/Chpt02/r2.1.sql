-- Return query results in a specified order

select ename, job, sal
  from emp
where deptno = 10
order by sal asc
