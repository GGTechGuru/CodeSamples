-- 1.6 Referencing an aliased column in the WHERE clause

select *
  from	(
select sal as salary, comm as commission
  from emp
  		) x
where salary < 5000
