# Write your MySQL query statement below
select  name , sum(amount) as balance from  Users as u join Transactions as t on u.account=t.account group by  u.account having balance >10000;