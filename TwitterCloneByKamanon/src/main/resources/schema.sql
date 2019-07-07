-- Project Name : TwitterCloneByKamanon
-- Date/Time    : 2019/06/11 9:49:17
-- Author       : kamanon
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- ツイート
drop table if exists t_tweet cascade;

create table t_tweet (
  tweet_id BIGSERIAL NOT NULL PRIMARY KEY
  , user_id BIGINT NOT NULL
  , tweet TEXT NOT NULL
  , retweet_flg CHAR NOT NULL
  , created TIMESTAMP
) ;

-- ツイートアクション
drop table if exists t_tweet_action cascade;

create table t_tweet_action (
  user_id BIGINT NOT NULL
  , tweet_id BIGINT NOT NULL
  , retweet_flg CHAR NOT NULL
  , like_flg CHAR NOT NULL
  , created TIMESTAMP NOT NULL
  , updated TIMESTAMP NOT NULL
) ;

-- フォロー
drop table if exists t_follow cascade;

create table t_follow (
  user_id BIGINT NOT NULL
  , follow_user_id BIGINT NOT NULL
  , created TIMESTAMP
) ;

-- ユーザー
drop table if exists t_usr cascade;

create table t_usr (
  user_id BIGSERIAL NOT NULL
  , user_name VARCHAR(255) NOT NULL unique
  , password VARCHAR(255) NOT NULL unique
  , handle_name VARCHAR(255) unique
  , email_addr VARCHAR(255) unique
  , sex CHAR
  , birthday DATE
  , created TIMESTAMP NOT NULL
  , updated TIMESTAMP NOT NULL
  , CONSTRAINT user_id PRIMARY KEY(user_id)
) ;

comment on table t_tweet is 'ツイート:ツイートを格納';
comment on column t_tweet.tweet_id is 'ツイートID';
comment on column t_tweet.user_id is 'ユーザーID';
comment on column t_tweet.tweet is 'ツイート内容';
comment on column t_tweet.retweet_flg is 'リツイートフラグ';
comment on column t_tweet.created is '作成日時';

comment on table t_tweet_action is 'ツイートアクション:ツイートに対するアクションを格納';
comment on column t_tweet_action.user_id is 'ユーザーID';
comment on column t_tweet_action.tweet_id is 'ツイートID';
comment on column t_tweet_action.retweet_flg is 'リツイートフラグ';
comment on column t_tweet_action.like_flg is 'いいねフラグ';
comment on column t_tweet_action.created is '作成日時';
comment on column t_tweet_action.updated is '更新日時';

comment on table t_follow is 'フォロー:フォロー情報を格納';
comment on column t_follow.user_id is 'ユーザーID';
comment on column t_follow.follow_user_id is 'フォローユーザーID';

comment on table t_usr is 'ユーザー:ユーザー情報を格納';
comment on column t_usr.user_id is 'ユーザーID';
comment on column t_usr.user_name is 'ユーザー名';
comment on column t_usr.password is 'パスワード';
comment on column t_usr.handle_name is 'ハンドルネーム';
comment on column t_usr.email_addr is 'メールアドレス';
comment on column t_usr.sex is '性別';
comment on column t_usr.birthday is '生年月日';
comment on column t_usr.created is '作成日時';
comment on column t_usr.updated is '更新日時';
