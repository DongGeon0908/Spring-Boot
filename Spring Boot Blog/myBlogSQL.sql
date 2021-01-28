# 한글 설정 확인
show variables like 'c%';

# 사용자 생성 및 권한 주기 및 DB 생성

# 유저이름@아이피주소
create user 'cos'@'%' identified by 'cos1234';

# ON DB이름.테이블명
# TO 유저이름@아이피주소
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
CREATE DATABASE blog CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
use blog;

# 데이터베이스 선택
use blog;

# 테이블 확인 명령어
show tables;
select * from user;
select * from reply;
select * from board;

# 데이터베이스 삭제
drop database blog;

# 자료형 출력
show variables like 'c%';

# 테이블 삭제
drop table user;
drop table board;

# safe mode 해제
SET SQL_SAFE_UPDATES =0;

# 투플 삭제
delete from user;
delete from board;
commit;

# 테이블 컬럼 속성 보기
SHOW COLUMNS FROM `user`;

# 제약조건 확인
desc user;
SELECT * 
FROM information_schema.table_constraints
WHERE 'user';
SELECT DISTINCT username FROM user;

# 댓글 입력
insert into reply(content, boardId, userId, createDate)
values("첫번째 댓글", 1, 3, now());

insert into reply(content, boardId, userId, createDate)
values("두번째 댓글", 1, 3, now());

insert into reply(content, boardId, userId, createDate)
values("세번째 댓글", 1, 3, now());

# 커밋
commit;
