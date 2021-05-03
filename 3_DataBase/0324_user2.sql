-- join : pk - fk ���� �� �� ���
select * from dept;
select * from emp;
select * from dept, emp;

select name, empno, deptno from emp2;
select emp2.name, emp2.empno, emp2.deptno from emp2;
select e.name, e.empno, e.deptno from emp2 e;

-- select �÷���, ..
--      from ���̺��̸���Ī [inner] join ���̺��̸���Ī
--      on ��Ī.�÷��� = ��Ī.�÷���

select ename, mgr, emp.deptno, dname
    from emp, dept;

select ename, mgr, e.deptno, dname
    from emp e inner join dept d
    on e.deptno = d.deptno;
    
desc emp;
select * from emp;
insert into emp values(0202, 'kingsmile', 'manager', 7777,'22/3/1', 2850, null, 20);

-- left outer join : ���ʿ� �ִ� ������ ���, ������ ��ġ�ϴ� �����͸� ~
select ename, mgr, e.deptno, dname
--    from emp e left join dept d
    from dept d left join emp e
--    on e.deptno = d.deptno;
    on d.deptno = e.deptno;
    
desc dept;
select * from dept;
insert into dept(deptno, loc) values('50', 'SEOUL');

-- right outer join : �����ʿ� �ִ� ������ ���, ���� ��ġ�ϴ� �����͸� ~
select ename, mgr, e.deptno, dname
--    from emp e right join dept d
    from dept d right join emp e
--    on e.deptno = d.deptno;
    on d.deptno = e.deptno;
    
--    select �÷��� , .....
--    from ���̺��̸� ��Ī [Inner] join ���̺��̸� ��Ī
--    on ��Ī.�÷��� = ��Ī.�÷���
---     �������� ���̺� ����
--    select �÷��� , .....
--    from ���̺��̸� ��Ī [Inner] join ���̺��̸� ��Ī
--    on ��Ī.�÷��� = ��Ī.�÷��� [Inner] join ���̺��̸� ��Ī
--    on ��Ī.�÷��� = ��Ī.�÷��� ...

select * from professor; -- profno, deptno
select * from student; -- studno, deptno1
select * from department; -- deptno, dname

select p.deptno, p.name, deptno1, s.name, dname
    from professor p inner join department d
    on p.deptno = d.deptno inner join student s
    on d.deptno = s.deptno1;
    
-- Q2. emp, dept inner join �ϱ�
--         ����ʵ�� ����̸�, �μ��̸�, ��å, �Ŵ�����ȣ ����

select * from emp;
select * from dept;

select ename "����̸�", dname "�μ��̸�", job "��å", mgr "�Ŵ�����ȣ"
    from emp e inner join dept d
    on e.deptno = d.deptno ;
    
-- ���̺��� / ���ڵ庹��
select * from emp where job='MANAGER'; -- ���ڵ�� ��ҹ��ڸ� �����Ѵ�
select * from emp where job='MANAGER' or job='manager';
select * from emp where job in ('MANAGER', 'manager');

-- ���� 
-- create table ���̺��̸�
-- as
-- ���������̺���

create table c_emp -- ���������� ���� �� �� ����
    as select * from emp;

desc emp;
desc c_emp;
-----------------------------------------------------
create table c_emp_20
    as select * from emp where deptno=20;
    
select * from c_emp_20;
-----------------------------------------------------
create table c_emp_30
    as select empno �����ȣ, ename �����, job ����, sal �޿�
        from emp
        where deptno=30;

select * from c_emp_30;
-----------------------------------------------------
-- Q3. ���� ���̺��� ���Ӱ��縸 �����ؼ� ���ο� ���̺� �����ϱ�
select * from professor;
select * from professor where position='���Ӱ���';
create table c_prof
    as select * 
        from professor 
        where position='���Ӱ���';
    
select * from c_prof;

-- Q4. emp ���̺��� mgr(�Ŵ�����ȣ)�� 7566���� ����� �����ؼ� 
--      ���ο� ���̺� �����ϱ�
select * from emp where mgr=7566;
create table c_emp_7566
    as select *
        from emp
        where mgr=7566;
    select * from c_emp_7566;
    
create table c_emp4
    as select * from emp where 1 = 0;

select * from c_emp3;
desc c_emp4;

create table c_emp3
    as select * from emp
    order by ename desc, sal desc, empno asc;
    
-- ���ڵ庹��
-- ���
-- insert into ���̺��̸�
-- select �÷���, ... from ���̺��̸�

-- ��ü����
select * from c_emp;  
-- ����(�μ���ȣ�� 20���� ���ڵ�)�� �°� ���̺��� ����
select * from c_emp_20;
-- �������� ����(���ڵ� ���� ����
select * from c_emp4;
-- ���ϴ� �ʵ�(empno, ename, job, sal)�� ����
select * from c_emp_2;
-- ���ϴ� �ʵ�(empno, ename, job, sal)�� ��Ī���� ����
select * from c_emp_30;

create table c_emp2
    as select empno, ename, job, sal
            from emp;

insert into c_emp(empno, ename, deptno) values(30, '�̵���', 40);

-- UNION: PK - FK �� �ƴ� ���� ���̺� ��ġ��
select * from emp
union all -- �ߺ����ڵ� �����ϰ� ���ļ� �����ش�.
    select * from c_emp; 
    
select * from emp -- �ʵ尳��
union
    select * from c_emp2;

select empno, ename, job, sal from emp -- �ʵ尳��
union
    select * from c_emp2;
    
desc emp;

--18> �̸��� J,A �Ǵ� M���� �����ϴ� ��� ����� �̸�(ù ���ڴ� 
-- �빮�ڷ�, ������ ���ڴ� �ҹ��ڷ� ǥ��) �� �̸� ���̸� ǥ���ϴ�
-- ������ �ۼ��ϰ� �÷� ��Ī�� ������ �־ ����϶�.
 select * from emp;
 select * from emp where initcap(ename) like 'J%' or initcap(ename) like 'A%' or initcap(ename) like 'M%';
select * from emp where initcap(ename) like '%J%' or initcap(ename) like '%A%' or initcap(ename) like '%M%';

 SELECT  CONVERT( 'ABC', 'utf8', 'us7ascii' )
    FROM   dual;

select ename, isnull( convert(varchar(20) , comm), 'no commission') as comm
    from emp;

select ename, hiredate, Months_between(sysdate,  to_date(hiredate, 'yy/mm/dd') ) as "[Months_Works]" , sysdate
    from emp
    order by hiredate desc;
    --order by Months_Works desc;   -- ������ ��Ī���δ� �ȵ�

select sysdate from dual;

select ename, HIREDATE, MONTHS_BETWEEN(SYSDATE, HIREDATE) as "[Months_Works]"
  from emp
  order by hiredate desc;

-- minus !!!

-- Q5. c_emp_20, c_emp4 union result?
select * from c_emp_20
union 
    select * from c_emp4;
    
-- Q6. �����ȣ, �̸�, �޿� �׸��� 15% �λ�� �޿��� ������ ǥ���ϵ�,
--      �÷����� New Salary�� �����Ͽ� ����Ͻÿ�
select * from emp;
select empno, ename, sal, (sal*1.15) "New Salary"
    from emp;

-- Q7. �� ����� �̸��� ǥ���ϰ�, �ٹ� �� ���� ����Ͽ� 
--      �÷����� Months_Works�� �����ϰ�, �ٹ� �� ���� ��������
--      ������ ������� �����Ͽ� ����Ͻÿ�.
--select ename, hiredate, Months_between(sysdate, hiredate) as "Months_Works" 
select ename, hiredate, round(Months_between(sysdate, hiredate), 0) as "Months_Works" 
    from emp
    order by hiredate desc; 

select hiredate, to_date(hiredate, 'yy/mm/dd') from emp;

-- Q8. ����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å�� ���� ����
--      ����� Ŀ�̼��� 'no commission'���� ����ϼ���.
select ename, decode(comm, null, 'no commission', comm)
    from emp;
    
select * from emp;
