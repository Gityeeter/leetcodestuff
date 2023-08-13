/* Write your T-SQL query statement below */
with dep_max as
(
select max(salary) as salary, departmentId
from Employee
group by departmentId
)


select Employee.name as Employee , Department.name as Department,Employee.salary
from Employee left join Department
on Employee.departmentId = Department.id
inner join dep_max
on dep_max.salary = Employee.salary and dep_max.departmentId = Employee.departmentId


