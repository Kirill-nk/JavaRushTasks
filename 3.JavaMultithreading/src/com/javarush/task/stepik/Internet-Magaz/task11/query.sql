INSERT INTO buy (client_id, buy_description)
SELECT client_id, 'Связаться со мной по вопросу доставки'
FROM client
WHERE name_client = 'Попов Илья';