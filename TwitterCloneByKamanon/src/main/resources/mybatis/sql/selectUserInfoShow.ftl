SELECT user_id, user_name, handle_name, birthday
FROM t_usr
WHERE
	user_name = <@p userName="n" />