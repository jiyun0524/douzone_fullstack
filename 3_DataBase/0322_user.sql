/*
create 
alter  -- ����
drop  -- ����

 -- ���� �ּ�
insert
delete
update
*/   -- ������ �ּ�
select * from tab;  -- table list 

 -- table  ����(�����)
create table SampleTable (
    age number(2), 
    -- 2�ϱ� 2�ڸ��� ���� ������. 0~99 �ڸ�����. �Ⱦ��� �⺻ 4 ����Ʈ
    name varchar2(20),
    address varchar2(50)
);

select * from sampletable;
-- �ش� ���̺��� ���ڵ� ����

desc samepletable;
-- �ش� ���̺� ���� ����

-- insert
-- insert into ���̺�� values (���ڰ�, '���ڿ�' �Ǵ� '����' �Ǵ� '��¥')
insert into sampletable values(10, 'doyeon', 'seoul');
insert into sampletable values(20, '�迬��', '�λ�');
insert into sampletable values(20, '�迬��', '�λ�');

insert into sampletable(age, name, address) values('30', '����ȯ', '�뱸');
insert into sampletable(name, age) values ('��Ǹ�', '2');
