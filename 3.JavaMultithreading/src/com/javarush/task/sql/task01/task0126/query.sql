-- Write your code here:
select brand, model, quantity, booked_quantity
from car
where car.brand in ('renault', 'opel', 'seat', 'skoda')
OR (quantity - booked_quantity) < 10