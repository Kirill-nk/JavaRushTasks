use internet_magaz;

DROP TABLE IF EXISTS buy_step;

INSERT INTO buy_step (buy_id, step_id, date_step_beg, date_step_end)
select 5 as buy_id, step.step_id, null date_step_beg, null date_step_end
from step;

select * from buy_pay;