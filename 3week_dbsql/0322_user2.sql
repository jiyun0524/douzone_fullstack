select * from emp2;  --  전체보기
select name, tel, pay from emp2;  -- 특정 필드만 보기
desc emp2;  -- 해당 테이블 구조 보기

-- insert ------------------
insert into sampletable values(10, 'doyeon', 'seoule');
insert into sampletable values(20, '김연아', '부산');

insert into sampletable(name, address, age) values('박태환', '대구', 33);
insert into sampletable(name, age) values('noName', 12);
insert into sampletable(name) values(22);

select * from sampletable;

-- update ----------
update sampletable set name = '김연아'  ;  -- 전체 수정 된다
ROLLBACK;  -- 취소  -- DML 명령어에 적용됨
COMMIT ;  -- 완료

update sampletable set name = '김연아' where age = 10 ;  -- 조건에 맞는것만 수정된다
update sampletable set name = 'yuna' where address = 'seoule' ;    

select * from sampletable;
--  delete -----------------------
delete sampletable;  --  전체 레코드 삭제
delete sampletable  where address = 'seoule' ;    -- 조건에 맞는 레코드 삭제
delete sampletable  where age BETWEEN 20 and 35; 

drop table sampletable;

select sysdate from dual;   -- dual :  가상 테이블

-- 테이블 생성
/*
create table 테이블이름(
    컬럼명datatype [ null | not null ] [ constraint 별칭제약조건] ,
    컬럼명datatype [ null | not null ] [ constraint 별칭제약조건] ,
    .....
);
*/

CREATE TABLE userlist(
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key,     -- 테이블_필드명_성격, ex) userlist_id_pk
    name varchar2(10) not null
);

select * from userlist;
desc userlist;

insert into userlist values('aa', 'bb');
insert into userlist(name, id) values('cc', 'dd');
insert into userlist(id) values('kbs');

drop table userlist;
CREATE TABLE userlist(
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key,     -- 테이블_필드명_성격, ex) userlist_id_pk
    name varchar2(10)   --  default null 허용
);

insert into userlist values('aa', 'bb');
insert into userlist(name, id) values('cc', 'dd');
insert into userlist(id) values('kbs');
