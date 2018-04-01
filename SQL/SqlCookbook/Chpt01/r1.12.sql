-- 1.2. Transforming nulls into real values

select COALESCE(comm, 0)
  from emp
