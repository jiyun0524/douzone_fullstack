-- SubQuery
select * from emp2;
select pay from emp2 where name = '백원만';
select * from emp2 where pay > 60000000;

select * from emp2 where pay>(select pay from emp2 where name='백원만');

-- Q1. emp2 테이블에서 평균 급여보다 적게 받는 사람을 출력
select * from emp2 
    where pay < (select avg(pay) from emp2);

-- Q2. student 테이블에서 1학년(grade) 평균 키 보다 큰 사람을 출력
select * from student 
    where height > (select avg(height) from student where grade = 1);

-- Q3. 학생 테이블, 학과 테이블을 사용하여 이윤나 학생과 
--      전공(deptno)이 동일한 학생들의 이름과 전공의 이름을 출력
select name, dname from student, department
    where student.deptno1 = department.deptno 
        and deptno1 = (select deptno1 from student where name='이윤나');

-- Q4. 교수테이블에서 입사일이 송도권 교수보다 
--       나중에 입사한 사람의 이름, 입사일, 학과명을 출력
select name, dname, hiredate
from professor, department 
where professor.deptno = department.deptno 
    and hiredate > (select hiredate from professor where name ='송도권');

-- Q5. 학생 테이블에서 1전공(deptno)이 101인 학과의 평균 몸무게보다
--       몸무게가 많은 학생들의 이름과 몸무게를 출력
select name, weight, deptno1 
from student 
where weight > (select avg(weight) from student where deptno1=101);

-- view
-- View 생성 방법
create view 뷰이름
    as
    뷰 내용;
-- View 수정 방법
create or replace view 뷰이름
    as
    뷰 내용;
-- View 삭제 방법
drop view 뷰이름 ;

create view v_emp
as
    select empno, ename, deptno
        from emp;
        
select * from v_emp;
-- emp 테이블을 제거하면 v_emp는 살아있나?
-- 아니. 원본을 제거하면 뷰도 제 역할을 못함

 create view v_emp_인사부
 as 
    select * from emp where deptno = 20;
    
select * from v_emp_ 인사부;

-- Q6. 30번 부서 사원들의 직위, 이름, 월급을 담은 view 테이블 만들기
--      컬럼명을 직위, 사원이름, 월급(급여)로 Alias를 주고 
--      월급이 200 보다 많은 사원들만 추출해서 뷰 만들기
select job 직위, ename 이름, sal 월급 from emp where sal/12 > 200;

create view q6view
    as select job 직위, ename 이름, sal 월급 from emp where sal/12 > 200;
    
select * from q6view;
    
-- Q7. 부서별(부분합=소계) 최대급여, 최소급여, 평균급여를 갖는 뷰 만들기
create view q7view
as select deptno 부서번호, max(sal) 최대급여, min(sal) 최소급여, avg(sal) 평균급여 
    from emp group by deptno;

select * from q7view;

-- Q8. 부서별 평균급여를 갖는 뷰를 만들되, 
---     평균 급여가 200이상인 부서만 출력하도록 하시오
create view q8view
as 
    select deptno 부서번호 
    from emp 
    group by deptno 
    having (avg(sal/12))>200);

select * from q8view;

-- Q9. 직위별 총급여를 구하는 뷰 테이블 만들되, 직위(job)가 
--       MANAGER인 사원들은 제외하고 총급여가 3000 이상인 사원들 출력하세요.
create view q9view
as 
    select sum(sal) 총급여, job
    from emp 
    where 3000<=sal and job != 'MANAGER' 
    group by job;

-- Q10. 교수 테이블에서 테이블 구조만 복사된  c_professor 새로운 
--        테이블 생성(이름, 직위, 입사일, 이메일, 홈페이지) 하고 레코드 복사하기
create table c_professor
as 
    select name 이름, position 직위, hiredate 입사일, email 이메일, hpage 홈페이지
    from professor
    where 1=0;
        
insert into c_professor (name, position, hiredate, email, hpage)
    select name, position, hiredate, email, hpage
    from professor;

-- Q11. c_emp22 테이블의 구조물만 복사
create table c_emp22
as 
    select *
    from emp
    where 1=0; -- 구조물만 만들 때

-- Q12. emp 테이블에서 c_emp22에 직위가 MANAGER인 사람들만 레코드 복사
insert into c_emp22 
    select *
    from emp
    where emp.job in('MANAGER', 'manager'); -- 대소문자인 경우를 모두 포함
    
select * from c_emp22;