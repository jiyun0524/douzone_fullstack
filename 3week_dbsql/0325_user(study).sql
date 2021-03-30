-------------------------------------------------------
-- PPT 5�� ��������
-- Q1. Emp ���̺��� ��SCOTT�� ���� �޿��� ���� �޴� ����� �̸��� �޿��� ���
select ename, sal 
from emp 
where sal > 
    (select sal
    from emp
    where ename = 'SCOTT');

-- Q2. Student ���̺�� department ���̺��� ����Ͽ� ������ �л��� 
--      1 ����(deptno1)�� ������ �л����� �̸��� 1���� �̸��� ����ϼ���. 
select name, dname
from student, department
where student.deptno1 = department.deptno and deptno1 = 
    (select deptno1
    from student
    where name='������');
    
-- Q3. Professor ���̺��� �Ի����� �۵��� �������� 
--      ���߿� �Ի��� ����� �̸��� �Ի���, �а����� ����ϼ���.
select name, hiredate, dname
from professor, department
where professor.deptno = department.deptno and hiredate >
    (select hiredate
    from professor
    where name='�۵���');

-- Q4. Student ���̺��� 1 ����(deptno1)�� 101�� �� �а��� ��� �����Ժ��� 
--      �����԰� ���� �л����� �̸��� �����Ը� ����ϼ���.
select name, weight
from student
where weight > 
    (select avg(weight)
    from student
    where deptno1 = 101);

-- Q5. Professor ���̺��� �ɽ� ������ ���� �Ի��Ͽ� �Ի��� ���� �߿��� 
--      ������ �������� ������ ���� �޴� ������ �̸��� �޿�, �Ի����� ����ϼ���.
select * from professor;

select name, pay, hiredate
from professor
where hiredate = 
    (select hiredate
    from professor 
    where name='�ɽ�')
    and pay <
    (select pay 
    from professor 
    where name='������');
    
-- Q6. Emp2 ���̺�� Dept2 ���̺��� �����Ͽ� �ٹ�����(dept2 ���̺��� area �÷�)��
--      ���� ������ ��� ������� ����� �̸�, �μ���ȣ�� ����ϼ���.
select empno, name, deptno, area
from emp2, dept2
where emp2.deptno = dept2.dcode and dept2.area = '��������';

-- Q7. Emp2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� 
--      ������ ���� ����� �̸��� ���� , ������ ����ϼ���. �� ���� ��� ������ 
--      �Ʒ��� ���� õ ���� ���б�ȣ�� �� ǥ�ø� �ϼ���.
select name, position, to_char(pay, '999,999,999')
from emp2
where pay >
    (select min(pay)
    from emp2
    where position = '����');

-- Q8. Student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� 
--      ���� ���� ������ �л����� �����԰� ���� �л��� �̸��� �г�� �����Ը� ����ϼ���
select * from student;

select name, grade, weight
from student
where weight <
    (select min(weight)
    from student
    where grade=4);

-- Q9. Student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ�Ű�� ���� �л����� 
--      �г�� �̸��� Ű�� ����ϼ���.
select grade, name, height
from student
where (grade, height) in -- '=' ���� in �����
    (select grade, max(height)
    from student
    group by grade)
order by grade;

-- Q10. Emp2 ���̺��� ��ȸ�Ͽ� ���޺��� �ش� ���޿��� �ִ� ������ 
--        �޴� ������ �̸��� ����, ������ ����ϼ���. ���������� �������� �����ϼ���.
select name, position, pay
from emp2
where (position, pay) in
    (select position, max(pay)
    from emp2
    group by position)
order by pay;

-- Q11. Emp2 ���̺��� ��ȸ�Ͽ� �� �μ��� ��� ������ ���ϰ� �� �߿��� ��� ������ ���� 
--        ���� �μ��� ��� �������� ���� �޴� �������� �μ���, ������, ������ ����ϼ���
select dname, name, pay
from emp2, dept2
where emp2.deptno = dept2.dcode 
    and pay <
        (select min(avg(pay))
        from emp2 
        group by deptno);

-- Q12. Emp2 ���̺��� ��ȸ�ؼ� ���� �� �߿��� �ڽ��� ������ ��տ����� 
--        ���ų� ���� �޴� ������� �̸��� ����, ���� ������ ����ϼ���.
-- @@@@ ���� ���� ����
select name, position, pay
from emp2 e1
where pay >=
    (select avg(pay)
    from emp2 e2
    where e1.position = e2.position);
    
-------------------------------------------------------
-- PPT 5�� ��������
-- Q13.
    