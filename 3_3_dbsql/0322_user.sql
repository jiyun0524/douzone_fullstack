/*
create 
alter  -- 수정
drop  -- 삭제

 -- 한줄 주석
insert
delete
update
*/   -- 여러줄 주석
select * from tab;  -- table list 

 -- table  생성(만들기)
create table SampleTable (
    age number(2), 
    -- 2니까 2자리만 저장 가능함. 0~99 자리까지. 안쓰면 기본 4 바이트
    name varchar2(20),
    address varchar2(50)
);

select * from sampletable;
-- 해당 테이블의 레코드 보기

desc samepletable;
-- 해당 테이블 구조 보기

-- insert
-- insert into 테이블명 values (숫자값, '문자열' 또는 '문자' 또는 '날짜')
insert into sampletable values(10, 'doyeon', 'seoul');
insert into sampletable values(20, '김연아', '부산');
insert into sampletable values(20, '김연아', '부산');

insert into sampletable(age, name, address) values('30', '박태환', '대구');
insert into sampletable(name, age) values ('김또리', '2');
