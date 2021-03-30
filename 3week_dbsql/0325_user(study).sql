-------------------------------------------------------
-- PPT 5장 서브쿼리
-- Q1. Emp 테이블에서 ‘SCOTT’ 보다 급여를 많이 받는 사람의 이름과 급여를 출력
select ename, sal 
from emp 
where sal > 
    (select sal
    from emp
    where ename = 'SCOTT');

-- Q2. Student 테이블과 department 테이블을 사용하여 이윤나 학생과 
--      1 전공(deptno1)이 동일한 학생들의 이름과 1전공 이름을 출력하세요. 
select name, dname
from student, department
where student.deptno1 = department.deptno and deptno1 = 
    (select deptno1
    from student
    where name='이윤나');
    
-- Q3. Professor 테이블에서 입사일이 송도권 교수보다 
--      나중에 입사한 사람의 이름과 입사일, 학과명을 출력하세요.
select name, hiredate, dname
from professor, department
where professor.deptno = department.deptno and hiredate >
    (select hiredate
    from professor
    where name='송도권');

-- Q4. Student 테이블에서 1 전공(deptno1)이 101번 인 학과의 평균 몸무게보다 
--      몸무게가 많은 학생들의 이름과 몸무게를 출력하세요.
select name, weight
from student
where weight > 
    (select avg(weight)
    from student
    where deptno1 = 101);

-- Q5. Professor 테이블에서 심슨 교수와 같은 입사일에 입사한 교수 중에서 
--      조인형 교수보다 월급을 적게 받는 교수의 이름과 급여, 입사일을 출력하세요.
select * from professor;

select name, pay, hiredate
from professor
where hiredate = 
    (select hiredate
    from professor 
    where name='심슨')
    and pay <
    (select pay 
    from professor 
    where name='조인형');
    
-- Q6. Emp2 테이블과 Dept2 테이블을 참조하여 근무지역(dept2 테이블의 area 컬럼)이
--      서울 지사인 모든 사원들의 사번과 이름, 부서번호를 출력하세요.
select empno, name, deptno, area
from emp2, dept2
where emp2.deptno = dept2.dcode and dept2.area = '서울지사';

-- Q7. Emp2 테이블을 사용하여 전체 직원 중 과장 직급의 최소 연봉자보다 
--      연봉이 높은 사람의 이름과 직급 , 연봉을 출력하세요. 단 연봉 출력 형식은 
--      아래와 같이 천 단위 구분기호와 원 표시를 하세요.
select name, position, to_char(pay, '999,999,999')
from emp2
where pay >
    (select min(pay)
    from emp2
    where position = '과장');

-- Q8. Student 테이블을 조회하여 전체 학생 중에서 체중이 4학년 학생들의 체중에서 
--      가장 적게 나가는 학생보다 몸무게가 적은 학생의 이름과 학년과 몸무게를 출력하세요
select * from student;

select name, grade, weight
from student
where weight <
    (select min(weight)
    from student
    where grade=4);

-- Q9. Student 테이블을 조회하여 각 학년별로 최대키를 가진 학생들의 
--      학년과 이름과 키를 출력하세요.
select grade, name, height
from student
where (grade, height) in -- '=' 말고 in 써야함
    (select grade, max(height)
    from student
    group by grade)
order by grade;

-- Q10. Emp2 테이블을 조회하여 직급별로 해당 직급에서 최대 연봉을 
--        받는 직원의 이름과 직급, 연봉을 출력하세요. 연봉순으로 오름차순 정렬하세요.
select name, position, pay
from emp2
where (position, pay) in
    (select position, max(pay)
    from emp2
    group by position)
order by pay;

-- Q11. Emp2 테이블을 조회하여 각 부서별 평균 연봉을 구하고 그 중에서 평균 연봉이 가장 
--        적은 부서의 평균 연봉보다 적게 받는 직원들의 부서명, 직원명, 연봉을 출력하세요
select dname, name, pay
from emp2, dept2
where emp2.deptno = dept2.dcode 
    and pay <
        (select min(avg(pay))
        from emp2 
        group by deptno);

-- Q12. Emp2 테이블을 조회해서 직원 들 중에서 자신의 직급의 평균연봉과 
--        같거나 많이 받는 사람들의 이름과 직급, 현재 연봉을 출력하세요.
-- @@@@ 아직 이해 덜됨
select name, position, pay
from emp2 e1
where pay >=
    (select avg(pay)
    from emp2 e2
    where e1.position = e2.position);
    
-------------------------------------------------------
-- PPT 5장 서브쿼리
-- Q13.
    