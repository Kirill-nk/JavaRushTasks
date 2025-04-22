-- Write your code here:
select gym.id, gym.name, cust.id
from gyms gym, customers cust
where cust.id < 50