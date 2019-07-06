SELECT
  * 
FROM
	(SELECT
		count(user_id = <@p user_id="user_id" /> or null) AS tweet_count
	FROM
		t_tweet
	)  AS tweet_count
  , ( 
    SELECT
      count(user_id = <@p user_id="user_id" /> or null) AS follow_count
      , count(follow_user_id = <@p user_id="user_id" /> or null) AS follower_count 
    FROM
      t_follow AS f
  ) AS t_follow_and_follower
  , ( 
    SELECT
      count(like_flg = '1' or null) AS like_flg 
    FROM
      t_tweet_action AS t
  ) AS t_like