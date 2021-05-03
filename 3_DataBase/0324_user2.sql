-- join : pk - fk 관계 일 때 사용
select * from dept;
select * from emp;
select * from dept, emp;

select name, empno, deptno from emp2;
select emp2.name, emp2.empno, emp2.deptno from emp2;
select e.name, e.empno, e.deptno from emp2 e;

-- select 컬럼명, ..
--      from 테이블이름별칭 [inner] join 테이블이름별칭
--      on 별칭.컬럼명 = 별칭.컬럼명

select ename, mgr, emp.deptno, dname
    from emp, dept;

select ename, mgr, e.deptno, dname
    from emp e inner join dept d
    on e.deptno = d.deptno;
    
desc emp;
select * from emp;
insert into emp values(0202, 'kingsmile', 'manager', 7777,'22/3/1', 2850, null, 20);

-- left outer join : 왼쪽에 있는 데이터 모두, 오른쪽 일치하는 데이터만 ~
select ename, mgr, e.deptno, dname
--    from emp e left join dept d
    from dept d left join emp e
--    on e.deptno = d.deptno;
    on d.deptno = e.deptno;
    
desc dept;
select * from dept;
insert into dept(deptno, loc) values('50', 'SEOUL');

-- right outer join : 오른쪽에 있는 데이터 모두, 왼쪽 일치하는 데이터만 ~
select ename, mgr, e.deptno, dname
--    from emp e right join dept d
    from dept d right join emp e
--    on e.deptno = d.deptno;
    on d.deptno = e.deptno;
    
--    select 컬럼명 , .....
--    from 테이블이름 별칭 [Inner] join 테이블이름 별칭
--    on 별칭.컬럼명 = 별칭.컬럼명
---     여러개의 테이블 조인
--    select 컬럼명 , .....
--    from 테이블이름 별칭 [Inner] join 테이블이름 별칭
--    on 별칭.컬럼명 = 별칭.컬럼명 [Inner] join 테이블이름 별칭
--    on 별칭.컬럼명 = 별칭.컬럼명 ...

select * from professor; -- profno, deptno
select * from student; -- studno, deptno1
select * from department; -- deptno, dname

select p.deptno, p.name, deptno1, s.name, dname
    from professor p inner join department d
    on p.deptno = d.deptno inner join student s
    on d.deptno = s.deptno1;
    
-- Q2. emp, dept inner join 하기
--         출력필드는 사원이름, 부서이름, 직책, 매니저번호 보기

select * from emp;
select * from dept;

select ename "사원이름", dname "부서이름", job "직책", mgr "매니저번호"
    from emp e inner join dept d
    on e.deptno = d.deptno ;
    
-- 테이블복사 / 레코드복사
select * from emp where job='MANAGER'; -- 레코드는 대소문자를 구분한다
select * from emp where job='MANAGER' or job='manager';
select * from emp where job in ('MANAGER', 'manager');

-- 형식 
-- create table 테이블이름
-- as
-- 복사할테이블내용

create table c_emp -- 제약조건은 복사 할 수 없음
    as select * from emp;

desc emp;
desc c_emp;
-----------------------------------------------------
create table c_emp_20
    as select * from emp where deptno=20;
    
select * from c_emp_20;
-----------------------------------------------------
create table c_emp_30
    as select empno 사원번호, ename 사원명, job 직위, sal 급여
        from emp
        where deptno=30;

select * from c_emp_30;
-----------------------------------------------------
-- Q3. 교수 테이블에서 전임강사만 추출해서 새로운 테이블 생성하기
select * from professor;
select * from professor where position='전임강사';
create table c_prof
    as select * 
        from professor 
        where position='전임강사';
    
select * from c_prof;

-- Q4. emp 테이블에서 mgr(매니저번호)가 7566번인 사람만 추출해서 
--      새로운 테이블 생성하기
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
    
-- 레코드복사
-- 방법
-- insert into 테이블이름
-- select 컬럼명, ... from 테이블이름

-- 전체복사
select * from c_emp;  
-- 조건(부서번호가 20번인 레코드)에 맞게 테이블을 생성
select * from c_emp_20;
-- 구조물만 복사(레코드 복사 제외
select * from c_emp4;
-- 원하는 필드(empno, ename, job, sal)만 복사
select * from c_emp_2;
-- 원하는 필드(empno, ename, job, sal)와 별칭까지 복사
select * from c_emp_30;

create table c_emp2
    as select empno, ename, job, sal
            from emp;

insert into c_emp(empno, ename, deptno) values(30, '이도연', 40);

-- UNION: PK - FK 가 아닌 상태 테이블 합치기
select * from emp
union all -- 중복레코드 포함하고 합쳐서 보여준다.
    select * from c_emp; 
    
select * from emp -- 필드개수
union
    select * from c_emp2;

select empno, ename, job, sal from emp -- 필드개수
union
    select * from c_emp2;
    
desc emp;

--18> 이름이 J,A 또는 M으로 시작하는 모든 사원의 이름(첫 글자는 
-- 대문자로, 나머지 글자는 소문자로 표시) 및 이름 길이를 표시하는
-- 쿼리를 작성하고 컬럼 별칭은 적당히 넣어서 출력하라.
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
    --order by Months_Works desc;   -- 정렬은 별칭으로는 안됨

select sysdate from dual;

select ename, HIREDATE, MONTHS_BETWEEN(SYSDATE, HIREDATE) as "[Months_Works]"
  from emp
  order by hiredate desc;

-- minus !!!

-- Q5. c_emp_20, c_emp4 union result?
select * from c_emp_20
union 
    select * from c_emp4;
    
-- Q6. 사원번호, 이름, 급여 그리고 15% 인상된 급여를 정수로 표시하되,
--      컬럼명을 New Salary로 지정하여 출력하시오
select * from emp;
select empno, ename, sal, (sal*1.15) "New Salary"
    from emp;

-- Q7. 각 사원의 이름을 표시하고, 근무 달 수를 계산하여 
--      컬럼명을 Months_Works로 지정하고, 근무 달 수를 기준으로
--      오래된 사람부터 정렬하여 출력하시오.
--select ename, hiredate, Months_between(sysdate, hiredate) as "Months_Works" 
select ename, hiredate, round(Months_between(sysdate, hiredate), 0) as "Months_Works" 
    from emp
    order by hiredate desc; 

select hiredate, to_date(hiredate, 'yy/mm/dd') from emp;

-- Q8. 사원의 이름과 커미션을 출력하되, 커미션이 책정 되지 않은
--      사원의 커미션은 'no commission'으로 출력하세요.
select ename, decode(comm, null, 'no commission', comm)
    from emp;
    
select * from emp;
