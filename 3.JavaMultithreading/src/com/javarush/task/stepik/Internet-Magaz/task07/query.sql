select buy_step.buy_id
     , DATEDIFF(date_step_end,date_step_beg) as "Количество_дней"
     , if(DATEDIFF(date_step_end,date_step_beg) > city.days_delivery, DATEDIFF(date_step_end,date_step_beg) - city.days_delivery, 0) as "Опоздание"
from  buy_step
    join step on step.step_id = buy_step.step_id
    join buy on buy_step.buy_id = buy.buy_id
    join client on client.client_id = buy.client_id
    join city on city.city_id = client.city_id
where 1=1
    and step.name_step = 'Транспортировка'
and DATEDIFF(date_step_end,date_step_beg) is not null