INSERT INTO usr (user_name, password, handle_name, email_addr, sex, birthday, created, updated)
VALUES ('suzuki', 'psuzuki', 'suzuchan', 'suzu@gmaaail.com', '0', DATE'2000-01-02', current_timestamp, current_timestamp);
INSERT INTO usr (user_name, password, handle_name, email_addr, sex, birthday, created, updated)
VALUES ('uchimura', 'puchimura', 'uchan', 'uchi@gmaaail.com', '1', DATE'2001-02-03', current_timestamp, current_timestamp);
INSERT INTO usr (user_name, password, handle_name, email_addr, sex, birthday, created, updated)
VALUES ('takizawa', 'ptakizawa', 'takky', 'taki@gmaaail.com', '0', DATE'2001-02-03', current_timestamp, current_timestamp);

INSERT INTO tweet (user_id, tweet)
VALUES (1, '鈴木1ツイート目');
INSERT INTO tweet (user_id, tweet)
VALUES (1, '鈴木2ツイート目');
INSERT INTO tweet (user_id, tweet)
VALUES (2, '内村1ツイート目');
INSERT INTO tweet (user_id, tweet)
VALUES (2, '内村2ツイート目');
INSERT INTO tweet (user_id, tweet)
VALUES (3, '滝沢1ツイート目');
INSERT INTO tweet (user_id, tweet)
VALUES (3, '滝沢2ツイート目');

INSERT INTO follow (user_id, follow_user_id)
VALUES (1, 2);
INSERT INTO follow (user_id, follow_user_id)
VALUES (1, 3);
INSERT INTO follow (user_id, follow_user_id)
VALUES (2, 1);
