-- 유저이름@아이피주소
create user 'cosStudy'@'%' identified by 'cos1234';
-- ON DB이름.테이블명
-- TO 유저이름@아이피주소
GRANT ALL PRIVILEGES ON *.* TO 'cosStudy'@'%';
CREATE DATABASE blogStudy CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
use blogStudy;