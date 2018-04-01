-- 2.6 Sorting on a data-dependent key

select ename, sal, job, comm
  from emp
 order by case when job = 'SALESMAN' then comm else sal end
