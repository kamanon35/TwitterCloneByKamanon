-- Project Name : TwitterCloneByKamanon
-- Date/Time    : 2019/06/11 9:49:17
-- Author       : kamanon
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- ツイート管理
drop table if exists tweet cascade;

create table tweet (
  user_id BIGINT NOT NULL
  , tweet TEXT not null
  , created TIMESTAMP
) ;

-- フォロー管理
drop table if exists follow cascade;

create table follow (
  user_id BIGINT NOT NULL
  , follow_user_id BIGINT not null
) ;

-- ユーザー
drop table if exists usr cascade;

create table usr (
  user_id BIGSERIAL not null
  , user_name VARCHAR(255) not null
  , password VARCHAR(255) not null
  , handle_name VARCHAR(255)
  , email_addr VARCHAR(255)
  , sex CHAR
  , birthday DATE
  , created TIMESTAMP not null
  , updated TIMESTAMP not null
  , CONSTRAINT user_id PRIMARY KEY(user_id)
) ;

comment on table tweet is 'ツイート管理テーブル:ツイートを管理するテーブル。';
comment on column tweet.user_id is 'ユーザーID';
comment on column tweet.tweet is 'ツイート';

comment on table follow is 'フォロー管理テーブル:フォロー情報を管理するテーブル。';
comment on column follow.user_id is 'ユーザーID';
comment on column follow.follow_user_id is 'フォローユーザーID';

comment on table usr is 'ユーザー:ユーザー情報を管理する。';
comment on column usr.user_id is 'ユーザーID';
comment on column usr.user_name is 'ユーザー名';
comment on column usr.password is 'パスワード';
comment on column usr.handle_name is 'ハンドルネーム';
comment on column usr.email_addr is 'メールアドレス';
comment on column usr.sex is '性別';
comment on column usr.birthday is '生年月日';
comment on column usr.created is '作成日時';
comment on column usr.updated is '最終更新日時';
