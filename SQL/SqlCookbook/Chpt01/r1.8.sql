-- 1.8 Using conditional logic in a SELECT statemsnt

select ename, sal,
		case when sal <= 2000 then 'UNDERPAID'
			 when sal >= 4000 then 'OVERPAID'
			 else 'OK'
		end as status
from emp
