-- 2.3 Sorting by substrings
-- MySQL

select ename, job
  from emp
order by substr(job, length(job)-2)
