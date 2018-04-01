-- 2.2 Sorting by multiple fields

select empno, deptno, sal, ename, job
  from emp
order by deptno, sal desc
