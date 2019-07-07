INSERT INTO t_usr (user_name, password, handle_name, email_addr, sex, birthday, created, updated)
VALUES ('suzuki', 'psuzuki', 'suzuchan', 'suzu@gmaaail.com', '0', DATE'2000-01-02', current_timestamp, current_timestamp);
INSERT INTO t_usr (user_name, password, handle_name, email_addr, sex, birthday, created, updated)
VALUES ('uchimura', 'puchimura', 'uchan', 'uchi@gmaaail.com', '1', DATE'2001-02-03', current_timestamp, current_timestamp);
INSERT INTO t_usr (user_name, password, handle_name, email_addr, sex, birthday, created, updated)
VALUES ('takizawa', 'ptakizawa', 'takky', 'taki@gmaaail.com', '0', DATE'2001-02-03', current_timestamp, current_timestamp);

INSERT INTO t_tweet_action (user_id, tweet_id, retweet_flg, like_flg, created, updated)
VALUES (1, 3, '1', '1', current_timestamp, current_timestamp);
INSERT INTO t_tweet_action (user_id, tweet_id, retweet_flg, like_flg, created, updated)
VALUES (1, 5, '0', '1', current_timestamp, current_timestamp);
INSERT INTO t_tweet_action (user_id, tweet_id, retweet_flg, like_flg, created, updated)
VALUES (1, 4, '1', '0', current_timestamp, current_timestamp);
INSERT INTO t_tweet_action (user_id, tweet_id, retweet_flg, like_flg, created, updated)
VALUES (1, 6, '1', '1', current_timestamp, current_timestamp);

INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (1, '鈴木1ツイート目', '0', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (1, '鈴木2ツイート目', '0', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (2, '内村1ツイート目', '1', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (2, '内村2ツイート目', '1', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (3, '滝沢1ツイート目', '0', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (3, '滝沢2ツイート目', '1', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (1, '鈴木3ツイート目', '0', current_timestamp);
INSERT INTO t_tweet (user_id, tweet, retweet_flg, created)
VALUES (1, '鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目鈴木4ツイート目', '1', current_timestamp);

INSERT INTO t_follow (user_id, follow_user_id, created)
VALUES (1, 2, current_timestamp);
INSERT INTO t_follow (user_id, follow_user_id, created)
VALUES (1, 3, current_timestamp);
INSERT INTO t_follow (user_id, follow_user_id, created)
VALUES (2, 1, current_timestamp);