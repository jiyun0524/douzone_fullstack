-- rownum
select * from dual;
select * from emp;
select rownum, ename, sal, rowid from emp;

-- ROWNUM ���������� ó���ϴ� �Ϳ��� �ȵ�, select �� �����
delete emp where ROWNUM = 2;

-- �ζ��κ�
select rownum, ename, sal
    from (select * from emp order by sal);
    
-- sequence : �ڵ�����
create sequence autonum;

select autonum.nextval from dual; -- ���� ��ȣ Ȯ��
select autonum.currval from dual; -- ���� ��ȣ Ȯ��

create sequence seq_board
    start with 10
    increment by 10
    nocache
    nocycle;

create table test(num number, id varchar2(10));

select * from test;
insert into test values(seq_board.nextval, 'aa');
insert into test values(seq_board.nextval, 'bb');

create table test2(age number, name varchar2(10));
insert into test2 values(seq_board.nextval, 'kk');
insert into test2 values(seq_board.nextval, 'pp');
insert into test2 values(seq_board.nextval, 'c');

drop sequence autonum;

insert into test2(id) values('c');

select * from test2;

-- declare
begin 
    DBMS_output.put_line('�迬��');
end;
