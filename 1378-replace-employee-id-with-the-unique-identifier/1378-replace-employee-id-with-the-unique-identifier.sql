/* Write your T-SQL query statement below */
select unique_id , name
from Employees e1 Left Join EmployeeUNI e2
on e1.id = e2.id