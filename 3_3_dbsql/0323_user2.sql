-- ���ڵ��� ���� null �� ���
select * from professor;
select bonus, hpage from professor;

select *
    from professor
    -- where hpage = null ; => Ʋ��
    -- where hapge is null ; => ����
    where bonus is null;
    
desc professor;
insert into professor(profno, name, id, position, pay, hiredate, hpage)
    values(100, 'aa', 'kk', '����', 100, '21-03-23', '');
    
select *
    from professor
    where hpage is null or hpage='';
    
select *
    from professor
    where bonus is not null;
    
-- null ������ ������ null ���̴�
select * from professor;

select bonus, bonus+100 from professor;
select bonus, nvl(bonus, 0) from professor;
-- �ش� �ʵ�� ���������� �� ������ ��ü����

update professor set bonus = nvl(bonus, 0) + 100;

select * from professor;

-- Q. ���� ���̺��� hpage�� null ���� 'Ȩ�Ǿ���'�̶�� ǥ��
update professor set hpage = nvl(hpage, 'Ȩ�Ǿ���');

select distinct position from professor;

select * from professor order by name desc; 
-- asc ��������(��������) desc ��������
-- ����) ���ĺ� ��>��>����>�ѱ�

select * from emp2 order by name desc, deptno asc, pay desc;
select * from emp2 order by 2 desc, 4 asc, 8 desc;

select name as "�̸�", pay "�޿�", empno  "�����ȣ", position "����" from emp2;

select name||position as "���� ����"
    from emp2;

select * from emp2 where emp_type = '������';
select * from emp2 where emp_type = '������' or position = '����';

-- ������
select mod(7,3) from dual; -- ������ ���ϱ�

select * from professor 
    -- where bonus = 80;
    -- where bonus > 80;
    -- where bonus >= 80;
    where bonus < 80; -- ��Һ�
    
select * from professor where deptno in (101, 201, 301);
select * from professor where deptno not in (101, 201, 301);

select * from professor where deptno BETWEEN 100 and 199;
select * from professor where deptno not  BETWEEN 100 and 199;
-- �׻� ���� ���� ������ �տ� ���;���

-- �����ϴ� �� ã��
-- % : ���, _ : �� ���� <=== LIKE �����ڿ� �Բ�
select * from professor where name = '�ٺ�';
select * from professor where name like '_��';
select * from professor where name like '��%';
select * from professor where name like '%��';
select * from professor where name like '__'; -- �� ������ �̸� ã��
select * from professor where name like '%��%';

-- ���� : where, having <- group by �� ����
-- �׷� (����) �Լ��� �Ϲ� �ʵ�� ���� �� �� ����.
select grade, max(height) �ְ�Ű, avg(height) ���Ű, 
    min(height) ����Ű, sum(height) Ű�հ� from student 
    group by grade
    having avg(height) > 172; 
-- having�� �ܵ����� ���� �� ���� group by ���� ���� �Ǿ�� �Ѵ�.
    

-- Q1. �̸��� '���Ѷ�'�� '���Ѷ�'�� ���� (emp2 table)
select * from emp2 where name = '���Ѷ�';
update emp2 set name='���Ѷ�' where name='���Ѷ�';
select * from emp2 where name = '���Ѷ�';

-- Q2. ��̰� ����� ����鸸 ã�Ƽ� '����'���� ���� (emp2 table)
select * from emp2 where hobby='���';
update emp2 set hobby='����' where hobby='���';
select * from emp2 where hobby='����';

-- Q3. ����� ������ ã�Ƽ� ���� (emp2 table)
select * from emp2 where emp_type='�����';
delete from emp2 where emp_type='�����';

-- Q4. pay(or bonus)�� 50 �̻��� ����鸸 ��� (emp2 table)
select * from emp2 where pay >= 50000000;

-- Q5. ~��Ʈ�� �ƴ� ��ǰ�鸸 ��� (gift table)
select * from gift where gname not like '%��Ʈ';

-- Q6. gno�� 10�� ��ǰ�� �̸��� null�� ó���ϼ��� (gift table)
select * from gift where gno='10';
update gift set gname='' where gno='10';

-- Q7. gname �̸��� ����, g_start�� 999�� ���� ���� �����͸� �Է��ϼ��� (gift table)
insert into gift(gname, g_start) values('', 999);

-- Q8. gname�� null �̰ų� '' �� �����͸� �����ϰ� ����ϼ��� (gift table)
select * from gift where gname !='' or gname is not null;
-- �Ǵ�
select * from gift where gname not in ('null', ' ');

-- Q9. �޿��� 500 �̻��̰� ���ʽ��� 60�̻��� ������? (professor table)
select * from professor where pay >= 500 and bonus >= 60;

-- any, all, not in
select * from professor where pay > any(250, 310, 330);
select * from professor where pay = any(250, 310, 330);
select * from professor where pay != any(250, 310, 330);

select * from professor where pay not in(490, 500, 550);

select * from professor where pay < all (300, 400, 500);
select * from professor where pay > all (300, 400, 500);
select * from professor where pay = all (490, 500, 550); -- �ȳ���
select * from professor where pay != all (490, 500, 550);

-- �����Լ�
select * from gift;
select sum(g_start), sum(g_end) from gift;
select sum(g_start) "���۰� �հ�", sum(g_end) "�ְ� �հ�", avg(g_end) 
    from gift;

select max(g_start), min(g_start) from gift;
select count(*) from gift; -- null ����
select count(gno) from gift; -- null ����

select rank(3000) within group(order by g_end desc) from gift;

select rank(600000) within group(order by g_end desc) 
    from gift where g_end is not null;
-- oracle : null�� �켱������ �д�.
-- mysql : null�� ���� ������ �д�

-- Q10. �л� ���̺� �߿��� Ű�� 168cm�� ����� �� ��°��  ū�� Ȯ��
select rank(168) within group(order by height desc) from student;

-- Q11. �л� ���̺� �߿��� �����԰� 58kg�� ����� �� ��°�� ���ſ��� Ȯ��
select rank(58) within group(order by weight desc) from student;

-- Q12. g_end�� 200000, 600000 ���� ���� �� ��� (any ���)
select * from gift where g_end < any(200000, 600000); 

-- Q13. �л����� Ű�� �հ� ���, ���� Ű�� ū ���, ���� Ű�� ������� ���
select sum(height), avg(height), max(height), min(height) from student;
    
--Q14. emp2 table emp_type���� pay ��, ���, �ְ�޿�, �����޿� ���ϱ�
select emp_type �������, sum(pay) �޿��հ�, avg(pay) �޿����, 
    max(pay) �ְ�޿�, min(pay) �����޿�
    from emp2 group by emp_type;
    
