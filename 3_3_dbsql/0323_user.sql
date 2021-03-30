-- �������� : unique
CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, 
    jumin char(13) not null CONSTRAINT jumin_un unique
    );

insert into userlist2 values('aa', '1111');
insert into userlist2 values('bb', '1112');

drop table userlist2;

-- not null ���� �ٽ� ����� ����
CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, 
    jumin char(13) CONSTRAINT jumin_un unique
    );

insert into userlist2 values('aa', '1111');
insert into userlist2 values('bb', '1112');
insert into userlist2 (id) values('cc');

-- �������� : check
CREATE TABLE ck_Test(
    NAME VARCHAR2(10) NOT NULL,
    age NUMBER(2) NOT NULL CHECK (age BETWEEN 20 AND 30 )
    -- age���� 20~30���̸� ����
    -- gender CHAR(2) CHECK('��', '��');
    );

insert into ck_test values('�迬��', 22);
insert into ck_test values('����ȯ', 30);
insert into ck_test values('�̼���', 33);
insert into ck_test values('�Ͽ��', 12);

select * from ck_test;

-- �������� : default
CREATE TABLE de_Test(
    NAME VARCHAR2(10) NOT NULL,
    addr VARCHAR2(10) DEFAULT '����'
    );

insert into de_test values('kk', 'busan');
insert into de_test(name) values ('aa');
insert into de_test values('kk', null);
insert into de_test values('kk','');
insert into de_test(name) values('bb');

select * from de_Test;

-- ���̺� ���� / ����
ALTER TABLE de_test ADD gender CHAR(2);
ALTER TABLE de_test ADD (no NUMBER(2), etc VARCHAR2(50));
-- �������� �׸��� �� ���� �߰��� ���� ��ȣ�� �����־�� �ν���

-- update ���̺�� set ���泻��;
-- update ���̺�� set ���泻�� where ����;
-- gender��ü�� F��� ���� �־����
UPDATE de_test SET gender = 'F';
select * from de_Test;

ALTER TABLE de_test DROP COLUMN gender; 
ALTER TABLE de_test ADD gender CHAR(3);

UPDATE de_test set gender = '��';
UPDATE de_test SET no = '10', etc = '�λ�������������' WHERE name = 'kk';

select * from de_Test;

-- �ϳ��� �÷� ����
ALTER TABLE de_test DROP COLUMN gender;
-- ������ �÷� ����
ALTER TABLE de_test DROP (gender, etc);

ALTER TABLE de_test ADD gender CHAR (3);
 -- Q. ������ �ּ��� ����� NO�� 02�� �����ϼ���
UPDATE de_test SET NO = '02' WHERE addr = '����';

-- �ٽ� gender�� etc�߰��ϰ�
ALTER TABLE de_test ADD (gender CHAR(3), etc VARCHAR2(50));

-- datatype ����
-- alter table ���̺��̸� modify �÷��̸� �����ڷ���

-- ���ڵ尡 ��ϵǾ� ���� ���� ��
alter table de_test modify gender number; 
-- ���ڵ尡 �ϳ��� ä�����ִ� ��� Ÿ�� ������ �����
alter table de_test modify no varchar(20);

update de_test set no='' ;
alter table de_test modify addr varchar2(20);

-- �÷� �̸� ����
-- alter table ���̺��̸� rename column �����÷��� to �����÷���;
alter table de_test rename column no to num;
alter table de_test rename column addr to address;

-- ���̺� ����
drop table de_test;

SELECT * FROM de_test;
DESC de_test;
rollback;

-- ���� ���̺� ��� ����
show recyclebin;
desc recyclebin;

-- ���� (������ ���̺�)
FLASHBACK TABLE PROFESSOR to BEFORE DROP; -- ���1
FLASHBACK TABLE BIN$dV1gBkI6TDO1Iicho1vvzg to BEFORE DROP; -- ���2

-- ������ ����
purge recyclebin;

drop table userlist;
select * from emp2;

-- 0����, 0x���� <==== ������ ���� ���� ��� ���ڴ� varchar type���� ó����

-- truncate table ���̺��̸� ; => ��� ���ڵ� ����
select * from emp2;
delete emp2 where deptno=1000;
delete emp2;
-- truncate table emp2 where deptno=1000; --error
truncate table emp2; -- ���� �̿��ؼ� ���� �ȵǰ�, rollback ��� ó�� �ȵ�

rollback;