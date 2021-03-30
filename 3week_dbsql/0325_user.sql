-- SubQuery
select * from emp2;
select pay from emp2 where name = '�����';
select * from emp2 where pay > 60000000;

select * from emp2 where pay>(select pay from emp2 where name='�����');

-- Q1. emp2 ���̺��� ��� �޿����� ���� �޴� ����� ���
select * from emp2 
    where pay < (select avg(pay) from emp2);

-- Q2. student ���̺��� 1�г�(grade) ��� Ű ���� ū ����� ���
select * from student 
    where height > (select avg(height) from student where grade = 1);

-- Q3. �л� ���̺�, �а� ���̺��� ����Ͽ� ������ �л��� 
--      ����(deptno)�� ������ �л����� �̸��� ������ �̸��� ���
select name, dname from student, department
    where student.deptno1 = department.deptno 
        and deptno1 = (select deptno1 from student where name='������');

-- Q4. �������̺��� �Ի����� �۵��� �������� 
--       ���߿� �Ի��� ����� �̸�, �Ի���, �а����� ���
select name, dname, hiredate
from professor, department 
where professor.deptno = department.deptno 
    and hiredate > (select hiredate from professor where name ='�۵���');

-- Q5. �л� ���̺��� 1����(deptno)�� 101�� �а��� ��� �����Ժ���
--       �����԰� ���� �л����� �̸��� �����Ը� ���
select name, weight, deptno1 
from student 
where weight > (select avg(weight) from student where deptno1=101);

-- view
-- View ���� ���
create view ���̸�
    as
    �� ����;
-- View ���� ���
create or replace view ���̸�
    as
    �� ����;
-- View ���� ���
drop view ���̸� ;

create view v_emp
as
    select empno, ename, deptno
        from emp;
        
select * from v_emp;
-- emp ���̺��� �����ϸ� v_emp�� ����ֳ�?
-- �ƴ�. ������ �����ϸ� �䵵 �� ������ ����

 create view v_emp_�λ��
 as 
    select * from emp where deptno = 20;
    
select * from v_emp_ �λ��;

-- Q6. 30�� �μ� ������� ����, �̸�, ������ ���� view ���̺� �����
--      �÷����� ����, ����̸�, ����(�޿�)�� Alias�� �ְ� 
--      ������ 200 ���� ���� ����鸸 �����ؼ� �� �����
select job ����, ename �̸�, sal ���� from emp where sal/12 > 200;

create view q6view
    as select job ����, ename �̸�, sal ���� from emp where sal/12 > 200;
    
select * from q6view;
    
-- Q7. �μ���(�κ���=�Ұ�) �ִ�޿�, �ּұ޿�, ��ձ޿��� ���� �� �����
create view q7view
as select deptno �μ���ȣ, max(sal) �ִ�޿�, min(sal) �ּұ޿�, avg(sal) ��ձ޿� 
    from emp group by deptno;

select * from q7view;

-- Q8. �μ��� ��ձ޿��� ���� �並 �����, 
---     ��� �޿��� 200�̻��� �μ��� ����ϵ��� �Ͻÿ�
create view q8view
as 
    select deptno �μ���ȣ 
    from emp 
    group by deptno 
    having (avg(sal/12))>200);

select * from q8view;

-- Q9. ������ �ѱ޿��� ���ϴ� �� ���̺� �����, ����(job)�� 
--       MANAGER�� ������� �����ϰ� �ѱ޿��� 3000 �̻��� ����� ����ϼ���.
create view q9view
as 
    select sum(sal) �ѱ޿�, job
    from emp 
    where 3000<=sal and job != 'MANAGER' 
    group by job;

-- Q10. ���� ���̺��� ���̺� ������ �����  c_professor ���ο� 
--        ���̺� ����(�̸�, ����, �Ի���, �̸���, Ȩ������) �ϰ� ���ڵ� �����ϱ�
create table c_professor
as 
    select name �̸�, position ����, hiredate �Ի���, email �̸���, hpage Ȩ������
    from professor
    where 1=0;
        
insert into c_professor (name, position, hiredate, email, hpage)
    select name, position, hiredate, email, hpage
    from professor;

-- Q11. c_emp22 ���̺��� �������� ����
create table c_emp22
as 
    select *
    from emp
    where 1=0; -- �������� ���� ��

-- Q12. emp ���̺��� c_emp22�� ������ MANAGER�� ����鸸 ���ڵ� ����
insert into c_emp22 
    select *
    from emp
    where emp.job in('MANAGER', 'manager'); -- ��ҹ����� ��츦 ��� ����
    
select * from c_emp22;