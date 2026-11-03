# Write your MySQL query statement below
select eu.unique_id , e.name 
from Employees as e
left Join EmployeeUNI as eu
on eu.id = e.id;