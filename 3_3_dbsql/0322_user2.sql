select * from emp2;  --  ��ü����
select name, tel, pay from emp2;  -- Ư�� �ʵ常 ����
desc emp2;  -- �ش� ���̺� ���� ����

-- insert ------------------
insert into sampletable values(10, 'doyeon', 'seoule');
insert into sampletable values(20, '�迬��', '�λ�');

insert into sampletable(name, address, age) values('����ȯ', '�뱸', 33);
insert into sampletable(name, age) values('noName', 12);
insert into sampletable(name) values(22);

select * from sampletable;

-- update ----------
update sampletable set name = '�迬��'  ;  -- ��ü ���� �ȴ�
ROLLBACK;  -- ���  -- DML ��ɾ �����
COMMIT ;  -- �Ϸ�

update sampletable set name = '�迬��' where age = 10 ;  -- ���ǿ� �´°͸� �����ȴ�
update sampletable set name = 'yuna' where address = 'seoule' ;    

select * from sampletable;
--  delete -----------------------
delete sampletable;  --  ��ü ���ڵ� ����
delete sampletable  where address = 'seoule' ;    -- ���ǿ� �´� ���ڵ� ����
delete sampletable  where age BETWEEN 20 and 35; 

drop table sampletable;

select sysdate from dual;   -- dual :  ���� ���̺�

-- ���̺� ����
/*
create table ���̺��̸�(
    �÷���datatype [ null | not null ] [ constraint ��Ī��������] ,
    �÷���datatype [ null | not null ] [ constraint ��Ī��������] ,
    .....
);
*/

CREATE TABLE userlist(
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key,     -- ���̺�_�ʵ��_����, ex) userlist_id_pk
    name varchar2(10) not null
);

select * from userlist;
desc userlist;

insert into userlist values('aa', 'bb');
insert into userlist(name, id) values('cc', 'dd');
insert into userlist(id) values('kbs');

drop table userlist;
CREATE TABLE userlist(
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY key,     -- ���̺�_�ʵ��_����, ex) userlist_id_pk
    name varchar2(10)   --  default null ���
);

insert into userlist values('aa', 'bb');
insert into userlist(name, id) values('cc', 'dd');
insert into userlist(id) values('kbs');
