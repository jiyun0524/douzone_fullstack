-- PL/SQL
--begin
--    dbms_output.put_line('yeahhhhhhhh');
--end;

--DECLARE 
--    NAME varchar2(10):='apple';
--    age number := 10;
--begin
--    -- dbms_output.put_line(name|| ',' || age || 'yammy');
--    dbms_output.put_line('����� �̸���' || name || '�̱���, ���̴�' || age || '���̱���');
--end;

-- declare name emp.enmae%type; == declare name varchar2(10);

--declare e_name emp.ename%type;
--            e_sal emp.sal%type;
--begin 
--    select sal, ename into e_sal, e_name from emp where empno='7788';
--        dbms_output.put_line('7788���� �̸��� ' || e_name || '�޿��� ' || e_sal);
--end;

-- �ƴ� �̰� �ȵǴµ� �־ȵǴ°��� �𸣰���
--declare data emp%rowtype;
--begin
--    select * into data from emp where empno='7788';
--    dbms_output.put_line(data.ename ||', '|| data.job ||',' ||data.mgr ||','|| data.deptno);
--end;

--declare
----    v_su number := 87;
--    v_su number := &v_su;
--begin
--    -- ���๮ �ۼ� ����
--    if mod(v_su, 2) = 0 then
--        dbms_output.put_line('¦������');
--    else
--        dbms_output.put_line('Ȧ������');
--    end if;
--end;

--create procedure p_test
--is
--    declare
--        v_su number := 87;
----        v_su number := &v_su;
--    begin
--        -- ���๮ �ۼ� ����
--        if mod(v_su, 2) = 0 then
--            dbms_output.put_line('¦������');
--        else
--            dbms_output.put_line('Ȧ������');
--        end if;
--    end;
--    
--exec p_test;
----------------------------------------------------
-- �ǽ� !_!_!
-- Q1. ���� �޾Ƽ� ����(����)�� ��� (if ���)
declare
    score number := &score;
    begin
        dbms_output.put_line('���� ������');
        if (score>=90) then
            dbms_output.put_line('A');
        elsif (score>=80) then
            dbms_output.put_line('B');
        elsif (score>=70) then
            dbms_output.put_line('C');
        elsif (score>=60) then
            dbms_output.put_line('D');
        else
            dbms_output.put_line('F');
        end if;
        dbms_output.put_line('��������');
    end;
----------------------------------------------------
-- Q2. 1~100 ���� �� �߿��� 3�� ����� �հ� ���� ���ϱ�
declare
    num_sum number := 0;
    num_num number := 0;
    begin 
        for i in 1..100 loop
            if mod(i, 3) = 0 then
                dbms_output.put_line(i||'�� 3�� �����');
                num_sum := i + num_sum;
                num_num := num_num + 1;
            end if;
        end loop;
        dbms_output.put_line(num_sum ||'�� ����� ���̴� '||','|| 
                                        num_num ||'�� ����� ������');
    end;
----------------------------------------------------
-- Q3. ���ϴ� �� �Է¹޾Ƽ� ������ ��� ���α׷� �ۼ�
declare
    ori_num number := &ori_num;
    begin 
        dbms_output.put_line('������ '|| ori_num || '�� ��� ����');
        for i in 1..9 loop
            dbms_output.put_line(ori_num || 'X' || i || ' = ' || ori_num*i);
        end loop;
    end;

----------------------------------------------------
-- Q4. loop ������ 6���� 14���� ����ϱ�
declare 
    v_num number := 6;
    v_total_num number := 0;
    begin
        while v_num < 15 loop
            dbms_output.put_line('���� ���ڴ� : ' || v_num);
            v_num := v_num + 1;
            v_total_num := v_total_num + 1;
        end loop;
        dbms_output.put_line(v_total_num || '�� ȸ������');
    end;
----------------------------------------------------
-- Q5. ���ϴ� �� �Է¹޾Ƽ� ������ ��� ���α׷� �ۼ�(while��)
declare
    v_num number := &v_num;
    i number := 1;
    begin
    dbms_output.put_line(v_num || '�� ����� �����մϴ�');
        while i<9 loop
            i := i + 1;
             dbms_output.put_line(v_num || 'X' || i || ' = ' || v_num*i);
        end loop;
    end;
----------------------------------------------------
-- CASE ����
declare
    v_grade char(1) := 'S';
    v_str VARCHAR2(30);
    begin
        v_str :=
        case v_grade
            when 'A' then '��'
            when 'B' then '��'
            when 'C' then '��'
            else '����ʿ�'
        end;
        dbms_output.put_line(v_grade || '�� ' || v_str);
    end;
----------------------------------------------------
-- Q6. ������ 2�� �ݺ���
declare
    orinum number := 1;
    subnum number := 1;
    begin
    dbms_output.put_line('������ ����');
        for orinum in 1..9 loop
            for subnum in 1..9 loop
                dbms_output.put_line(orinum || 'X' || subnum || ' = ' || orinum*subnum);
            end loop;
        end loop;
    end;
----------------------------------------------------
create or replace PROCEDURE p_test2(
    name in varchar2
    )
    is
    begin
        dbms_output.put_line(name || '�� ����');
    end;
exec p_test2('��');
----------------------------------------------------
-- ex. �μ� ���̵�, �̸�, ����, �ּҸ� �Է¹޾� userlist ���̺� 
--      insert �� �� �μ��� ������ ����ϴ� ���ν��� �ۼ�
create or replace procedure p_emp2insert (
    empno in emp2.empno %type := 8888,
    name in emp2.name%type default '�̻���',
    deptno in emp2.deptno%type := 8888,
    hobby in emp2.hobby%type := null
    )
    is
    begin
        insert into emp2(empno, name, deptno, hobby) values(empno, name, deptno, hobby);
        dbms_output.put_line('insert ������ ' || empno || name || deptno || hobby);
    end;
    
exec p_emp2insert(7777, '����ȿ��', 7777, '����');
exec p_emp2insert; -- �μ� ���� ���� ��� �⺻ ������ ����
exec p_emp2insert(empno=>9999, name=>'��E��', deptno=>9999);
----------------------------------------------------
create procedure p_stud
is
    begin
        select into from student order by id desc;
    end;
----------------------------------------------------
-- Q1. �������ν��� emp ���̺��� 
--      �޿� ���� 5������ ����ϴ� ���ν��� �����
select sal from emp where rownum=1;
select ename, sal from emp order by sal desc;
delete emp where rownum = 1;

select *
  from (select * from emp order by sal )    -- �ζ��� ��  
  where rownum=1 ; 

select  x.*
  from (select * from emp) x   -- �ζ��� ��  
  where rownum=1 ; 
  
  select e.* from emp e, dept2 d ;

select x.*
  from emp x, dept2 d   -- �ζ��� ��  
  where rownum=1 ;

--cf)
select top 1 sal from emp;  -- top �� MSSQL�� �ִ� ���
----------------------------------------------------
-----���1. ----------------------------------------
drop PROCEDURE p_empMaxSal;

create or replace procedure p_empMaxSal 
is
  v_emprow  emp%ROWTYPE;
  Begin
    for i in 1..5 loop
      select * into v_emprow from 
        ( SELECT *
            FROM ( select * from emp order by sal desc ) 
              WHERE ROWNUM <= i ) where rownum <= 5 ;
        dbms_output.put_line(v_emprow.empno || ' ' || v_emprow.ename || ' ' || v_emprow.sal);
    end loop;
  end;
----------------------------------------------------
exec p_empMaxSal ;
----���2. -----------------------------------------
create or replace procedure emp_top5
is
  v_emprow emp%ROWTYPE;
begin
  for i in 1..5 loop
    select * into v_emprow from 
        (select * from (select * from emp order by sal desc)
         where rownum<=i order by sal, ename) where rownum=1 order by sal asc;
    dbms_output.put_line(v_emprow.empno || ' ' || v_emprow.ename || ' ' || v_emprow.sal);
  end loop;
end;
----------------------------------------------------
exec emp_top5;
----------------------------------------------------
select rownum, ename, sal from emp  where rownum <= 5
  order by sal desc;
----------------------------------------------------
-- ���ν��� cusor Ȱ�� ����
-- Q1. Ư�� ������ �μ��� �޾� �� ������ �����ϴ� 
--       ���� ���� �˻��� �˻��ϴ� ���ν��� �ۼ�.
select * from professor;
select * from department;

-- Q2. Ư�� ������ �����ϰ� �ִ� �л��� ������ �˻��ϴ� ���ν��� �ۼ�.
create or replace procedure p_job_emp(e_job in emp.job%type)
is
name emp.ename%type;

select * from student;
-- Q3. 1~100 ���̸� �ݺ��ϵ� 10�� ����� ����ϴ� ���ν��� �ۼ�.
declare
    v_num number := 1;
begin
    for v_num 1..100
        if(mod(v_num, 10) = 0)
            dbms_output.put_line(v_num);  
    end loop;
end;

declare
    ori_num number := &ori_num;
    begin 
        dbms_output.put_line('������ '|| ori_num || '�� ��� ����');
        for i in 1..9 loop
            dbms_output.put_line(ori_num || 'X' || i || ' = ' || ori_num*i);
        end loop;
    end;
-- Q4. member ���̺�(id, name, age, addr)�� �����͸� insert�� �� 
--      ���� ��� ���ڵ带 �˻��ϴ� ���ν����ۼ� (insert �����ʹ� 
--      �μ��� �޴´� , cursor �̿�, ��� �� ���� ��ü ���ڵ���� ����Ѵ�.)

-- Q5. id, name, age�� �μ��� �޾� id�� �ش��ϴ� ���ڵ��� ���� �μ��� ����
--      name, age�� update �ϰ� �� �� commit �ϰ� ����� ���ڵ��� 
--      ����� ����ϴ� ���ν����� �ۼ��Ͻÿ�.

-- Q6. ���簡 ����ϴ� ����� �� ������ ��� ���ǽǿ��� ����Ǹ� 
--       �� ���� �ο��� �� ������ �˻��ϴ� ���ν��� �ۼ�.
--       (�Ʒ��׸�����) -(Join�̿� , cursor �̿�)