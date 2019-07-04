-- Project Name : TwitterCloneByKamanon
-- Date/Time    : 2019/06/11 9:49:17
-- Author       : kamanon
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- tweet
drop table if exists t_tweet cascade;

create table t_tweet (
  tweet_id BIGSERIAL NOT NULL PRIMARY KEY
  , user_id BIGINT NOT NULL
  , tweet TEXT not null
  , created TIMESTAMP
) ;

-- フォロー
drop table if exists t_follow cascade;

create table t_follow (
  user_id BIGINT NOT NULL
  , follow_user_id BIGINT not null
  , created TIMESTAMP
) ;

-- ユーザー
drop table if exists t_usr cascade;

create table t_usr (
  user_id BIGSERIAL not null
  , user_name VARCHAR(255) not null unique
  , password VARCHAR(255) not null unique
  , handle_name VARCHAR(255) unique
  , email_addr VARCHAR(255) unique
  , sex CHAR
  , birthday DATE
  , created TIMESTAMP not null
  , updated TIMESTAMP not null
  , CONSTRAINT user_id PRIMARY KEY(user_id)
) ;

-- LIKE
drop table if exists t_like_tweet cascade;

create table t_like_tweet(
  user_id BIGINT NOT NULL
  ,like_tweet_id BIGSERIAL NOT NULL
  ,created TIMESTAMP
);

comment on table t_tweet is 'ツイート管理テーブル:ツイートを管理するテーブル。';
comment on column tweet_id is 'ツイートID';
comment on column t_tweet.user_id is 'ユーザーID';
comment on column t_tweet.tweet is 'ツイート内容';

comment on table t_follow is 'フォロー管理テーブル:フォロー情報を管理するテーブル。';
comment on column t_follow.user_id is 'ユーザーID';
comment on column t_follow.follow_user_id is 'フォローユーザーID';

comment on table t_usr is 'ユーザー:ユーザー情報を管理する。';
comment on column t_usr.user_id is 'ユーザーID';
comment on column t_usr.user_name is 'ユーザー名';
comment on column t_usr.password is 'パスワード';
comment on column t_usr.handle_name is 'ハンドルネーム';
comment on column t_usr.email_addr is 'メールアドレス';
comment on column t_usr.sex is '性別';
comment on column t_usr.birthday is '生年月日';
comment on column t_usr.created is '作成日時';
comment on column t_usr.updated is '最終更新日時';

comment on table t_like_tweet is 'Likeツイート管理テーブル:イイネ情報を管理するテーブル。';
comment on column t_like_tweet.user_id is 'ユーザーID';
comment on column t_like_tweet.like_tweet_id is 'LikeツイートID';
comment on column t_like_tweet.created is '作成日時';