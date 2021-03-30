-- 제약조건 : unique
CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, 
    jumin char(13) not null CONSTRAINT jumin_un unique
    );

insert into userlist2 values('aa', '1111');
insert into userlist2 values('bb', '1112');

drop table userlist2;

-- not null 빼고 다시 만들어 보기
CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, 
    jumin char(13) CONSTRAINT jumin_un unique
    );

insert into userlist2 values('aa', '1111');
insert into userlist2 values('bb', '1112');
insert into userlist2 (id) values('cc');

-- 제약조건 : check
CREATE TABLE ck_Test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL CHECK (age BETWEEN 20 AND 30 )
    -- age값은 20~30사이만 허용됨
    -- gender CHAR(2) CHECK('남', '여');
    );

insert into ck_test values('김연아', 22);
insert into ck_test values('박태환', 30);
insert into ck_test values('이순신', 33);
insert into ck_test values('암욱애', 12);

select * from ck_test;

-- 제약조건 : default
CREATE TABLE de_Test(
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '서울'
    );

insert into de_test values('kk', 'busan');
insert into de_test(name) values ('aa');
insert into de_test values('kk', null);
insert into de_test values('kk','');
insert into de_test(name) values('bb');

select * from de_Test;

-- 테이블 수정 / 삭제
ALTER TABLE de_test ADD gender CHAR(2);
ALTER TABLE de_test ADD (no NUMBER(2), etc VARCHAR2(50));
-- 여러가지 항목을 한 번에 추가할 때는 괄호로 묶어주어야 인식함

-- update 테이블명 set 변경내용;
-- update 테이블명 set 변경내용 where 조건;
-- gender전체에 F라는 값을 넣어보세요
UPDATE de_test SET gender = 'F';
select * from de_Test;

ALTER TABLE de_test DROP COLUMN gender; 
ALTER TABLE de_test ADD gender CHAR(3);

UPDATE de_test set gender = '여';
UPDATE de_test SET no = '10', etc = '부산정보산업진흥원' WHERE name = 'kk';

select * from de_Test;

-- 하나의 컬럼 삭제
ALTER TABLE de_test DROP COLUMN gender;
-- 여러개 컬럼 삭제
ALTER TABLE de_test DROP (gender, etc);

ALTER TABLE de_test ADD gender CHAR (3);
 -- Q. 서울이 주소인 사람의 NO를 02로 변경하세요
UPDATE de_test SET NO = '02' WHERE addr = '서울';

-- 다시 gender랑 etc추가하고
ALTER TABLE de_test ADD (gender CHAR(3), etc VARCHAR2(50));

-- datatype 변경
-- alter table 테이블이름 modify 컬럼이름 변경자료형

-- 레코드가 등록되어 있지 않을 때
alter table de_test modify gender number; 
-- 레코드가 하나라도 채워져있는 경우 타입 변경이 어려움
alter table de_test modify no varchar(20);

update de_test set no='' ;
alter table de_test modify addr varchar2(20);

-- 컬럼 이름 변경
-- alter table 테이블이름 rename column 기존컬럼명 to 변경컬럼명;
alter table de_test rename column no to num;
alter table de_test rename column addr to address;

-- 테이블 삭제
drop table de_test;

SELECT * FROM de_test;
DESC de_test;
rollback;

-- 삭제 테이블 목록 보기
show recyclebin;
desc recyclebin;

-- 복구 (삭제된 테이블)
FLASHBACK TABLE PROFESSOR to BEFORE DROP; -- 방법1
FLASHBACK TABLE BIN$dV1gBkI6TDO1Iicho1vvzg to BEFORE DROP; -- 방법2

-- 휴지통 비우기
purge recyclebin;

drop table userlist;
select * from emp2;

-- 0숫자, 0x숫자 <==== 연산할 일이 없는 경우 숫자는 varchar type으로 처리함

-- truncate table 테이블이름 ; => 모든 레코드 삭제
select * from emp2;
delete emp2 where deptno=1000;
delete emp2;
-- truncate table emp2 where deptno=1000; --error
truncate table emp2; -- 조건 이용해서 삭제 안되고, rollback 명령 처리 안됨

rollback;