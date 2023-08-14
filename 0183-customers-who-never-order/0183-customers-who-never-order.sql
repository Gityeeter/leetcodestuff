/* Write your T-SQL query statement below */
select name as Customers
from Customers
where id NOT in (select customerId from ORders)