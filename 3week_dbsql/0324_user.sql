-- �����ð� ����
-- Q1. emp2 ���̺��� deptno(�μ�) ���� pay �հ� ��� ���ϱ�
select deptno, sum(pay), avg(pay) from emp2 group by deptno;

-- Q2. emp2 ���̺��� emp_type ���� pay �հ� ��� ���ϱ�
select emp_type, sum(pay), avg(pay) from emp2 group by emp_type;

-- Q3.  emp2 ���̺��� position(����) ���� pay �հ� ��� ���ϱ�
select position, sum(pay), avg(pay) from emp2 group by position;

-- Q4.  emp2 ���̺��� position(����) ���� pay �հ� ��� ���ϴµ�, ������ ������ ����鸸 ����ϱ�
select position, sum(pay), avg(pay) from emp2 where position='����' group by position;
select position, sum(pay), avg(pay) from emp2 group by position having position = '����';

-- �����Լ�
select round(12.34567, 0), round(12.34567, 2), round(12.34567, 1) from dual;
select ceil(11.34), ceil(-12.34) from dual; -- �ø� �� ������ȯ
select floor(12.34), floor(-12.34) from dual; -- ���� �� ������ȯ
select trunc(12.3456, 2), trunc(12.34756, 2), trunc(12.7456, 2) from dual; -- ����

-- ���ڿ��Լ�
select * from professor;
select id, upper(id), lower(id), upper('kingsmile'), initcap(id) from professor;

select length('candide'), lengthb('candide') from professor;
select name, length(name), lengthb(name) from professor;

select instr('abcd', 'b') from dual;
select id, instr(id, 'b') from professor;
-- -n�̸� �ڿ��� ���� n��°
select instr('abcdefghijkboy', 'b', '-1') from dual; 
select instr('abcdefghijkboy', 'b', '-3') from dual;

select lpad('abcd', 20, '#') from dual;
select lpad(id, 20, '#') from professor;
select lpad(dname, 10, '1234567890') from dept2;

select rpad('abcd', 20, '@') from dual;
select dname, rpad(dname, 15, '*') "RPAD ����" from dept2;

select length('korea'), length('    korea   '), length('korea          ') from dual;
select length('korea'), length(ltrim('    korea   ')), length(rtrim('korea          ')) from dual;

-- �ѱ� ��ü�� ���α׷� �����δ� 2byte�̴�.
-- length() �Լ��� �ѱ۵� ������ ���� �ѱ��� 1byte ó���ϰ�,
-- lengthb() �Լ��� ����/���ڴ� �ѱ��� 1byte ó���ϰ�, �ѱ��� XE������ 1���� 3byteó���ϰ�
-- ������������޿����� �ѱ� 1���� 2byte ó���Ѵ�.

-- ��¥�Լ�
select sysdate from dual;
select to_char(sysdate, 'YYYY-MM-DD') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH:MI:SS') from dual;
select to_char(sysdate, 'YYYY-MM-DD HH24:MI:SS') from dual;
select hiredate, to_char(hiredate, 'YYYY-MM-DD') from professor;

select * from emp2;
select pay, to_char(2000, '999,999') from emp2;
select pay, to_char(2000, 'L999,999') from emp2;
select pay, to_char(2000, '$999,999') from emp2;

select pay, to_char(2000, '999,999,999') from emp2;
select pay, to_char(2000, 'L999,999,999') from emp2;
select pay, to_char(2000, '$999,999,999') from emp2;

select * from student;
select tel, instr(tel, ')') 
    from student
    where deptno1 = 101;

select name, tel, substr(tel, 1, instr(tel, ')') -1) "������ȣ"
    from student
    where deptno1 = 101;

-- ���ڿ�, ������ġ    
select substr('abcde', 2) from dual;
-- ���ڿ�, ������ġ, ���� ����
select substr('abcde', 2, 2) from dual;

select * from professor;
select name, hpage, instr(hpage, '/', -1)
    from professor;
    
select name, hpage, substr(hpage, instr(hpage, '/', -1) +1) "Ȩ�������ּ�"
    from professor
    where hpage is not null;
    
select months_between
    (TO_DATE('03-24-2021', 'MM-DD-YYYY'),
    TO_DATE('03-23-2020', 'MM-DD-YYYY')) "Month"
        from dual;
        
select add_months(hiredate, 1) "Next month"
    from professor
    where name='�ɽ�';
    
select hiredate, to_char(add_months(hiredate, 1)) "Next month"
    from professor
    where name='�ɽ�';
    
    
select sysdate,
    Last_day(sysdate) "Last Day", 
    Last_day(sysdate) - sysdate "Last Day"
        from dual;

select name, birthday,
    Last_day(birthday) "Last Day"
        from emp2;

-- �������� ���� �������� �����ϱ�?
select next_day('2021/03/24', 2) "Next Day" from dual; -- 1:�Ͽ���/2:������

select birthday, next_day(birthday, 7) "Next Day" from emp2;

select * from department;
select * from product;

------------------------------------------------
select p_code,
    decode(p_code, 100, 'NEW YORK',
                            101, 'DALLAS',
                            102, 'BOSTON',
                            105, 'CHICAGO',
                                    '������ �����') "Location of inventory"
    from product
    where p_code < 103;
------------------------------------------------

select * from dept;
select * from emp;

select deptno, decode(deptno, 10, 'Accounting',
                                              20, 'Research',
                                              30, 'Sales', 'Operations') name
    from dept;
    
-- Q1. 10�� �μ��� �޿��հ踦, 20�� �μ��� �ִ밪��, 
--       30�� �μ��� �ּ� ���� ����ϴ� ������ �ۼ�(decode ���)
select * from emp;
select deptno, decode(deptno, 10, sum(sal),
                                              20, max(sal),
                                              30, min(sal)) sal
    from emp
    group by deptno;
    
select deptno, nvl(sum(decode(deptno, 10, sal)), 0) deptno10,
                        nvl(sum(decode(deptno, 20, sal)), 0) deptno20,
                        nvl(sum(decode(deptno, 30, sal)), 0) deptno30,
                        nvl(sum(decode(deptno, 40, sal)), 0) deptno40
    from emp
    group by deptno;

select substr('ABC', 1, 2) from dual;
select substr('ABCdefg', 3, 4) from dual;
select substr('ABCdefg', -5, 4) from dual;
select substr('ABCdefg', 5, 4) from dual;

-- oracle ������ ���� �ѱ� ũ�Ⱑ �ٸ���
select substr('�ѱ۳�', 1, 2) from dual;
select substrb('�ѱ۳�', 1, 3) from dual;

select * from reg_test;