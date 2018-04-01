-- Returning n random records from a table
-- MySQL solution

select ename, job
  from emp
order by rand()
limit 5
