-- 레코드의 값이 null 인 경우
select * from professor;
select bonus, hpage from professor;

select *
    from professor
    -- where hpage = null ; => 틀림
    -- where hapge is null ; => 맞음
    where bonus is null;
    
desc professor;
insert into professor(profno, name, id, position, pay, hiredate, hpage)
    values(100, 'aa', 'kk', '인턴', 100, '21-03-23', '');
    
select *
    from professor
    where hpage is null or hpage='';
    
select *
    from professor
    where bonus is not null;
    
-- null 연산은 무조건 null 값이다
select * from professor;

select bonus, bonus+100 from professor;
select bonus, nvl(bonus, 0) from professor;
-- 해당 필드명에 널이있으면 이 값으로 대체해줘

update professor set bonus = nvl(bonus, 0) + 100;

select * from professor;

-- Q. 교수 테이블의 hpage의 null 값을 '홈피없음'이라고 표시
update professor set hpage = nvl(hpage, '홈피없음');

select distinct position from professor;

select * from professor order by name desc; 
-- asc 오름차순(생략가능) desc 내림차순
-- 순서) 알파벳 대>소>숫자>한글

select * from emp2 order by name desc, deptno asc, pay desc;
select * from emp2 order by 2 desc, 4 asc, 8 desc;

select name as "이름", pay "급여", empno  "사원번호", position "직급" from emp2;

select name||position as "성명 직급"
    from emp2;

select * from emp2 where emp_type = '정규직';
select * from emp2 where emp_type = '정규직' or position = '부장';

-- 연산자
select mod(7,3) from dual; -- 나머지 구하기

select * from professor 
    -- where bonus = 80;
    -- where bonus > 80;
    -- where bonus >= 80;
    where bonus < 80; -- 대소비교
    
select * from professor where deptno in (101, 201, 301);
select * from professor where deptno not in (101, 201, 301);

select * from professor where deptno BETWEEN 100 and 199;
select * from professor where deptno not  BETWEEN 100 and 199;
-- 항상 작은 수가 범위의 앞에 나와야함

-- 포함하는 것 찾기
-- % : 모든, _ : 한 문자 <=== LIKE 연산자와 함께
select * from professor where name = '바비';
select * from professor where name like '_비';
select * from professor where name like '김%';
select * from professor where name like '%기';
select * from professor where name like '__'; -- 두 글자의 이름 찾기
select * from professor where name like '%원%';

-- 조건 : where, having <- group by 절 사용시
-- 그룹 (집합) 함수는 일반 필드와 같이 쓸 수 없다.
select grade, max(height) 최고키, avg(height) 평균키, 
    min(height) 최저키, sum(height) 키합계 from student 
    group by grade
    having avg(height) > 172; 
-- having은 단독으로 쓰일 수 없고 group by 절에 동행 되어야 한다.
    

-- Q1. 이름이 '나한라'를 '너한라'로 변경 (emp2 table)
select * from emp2 where name = '나한라';
update emp2 set name='너한라' where name='나한라';
select * from emp2 where name = '너한라';

-- Q2. 취미가 등산인 사람들만 찾아서 '수영'으로 변경 (emp2 table)
select * from emp2 where hobby='등산';
update emp2 set hobby='수영' where hobby='등산';
select * from emp2 where hobby='수영';

-- Q3. 계약직 직원을 찾아서 삭제 (emp2 table)
select * from emp2 where emp_type='계약직';
delete from emp2 where emp_type='계약직';

-- Q4. pay(or bonus)가 50 이상인 사람들만 출력 (emp2 table)
select * from emp2 where pay >= 50000000;

-- Q5. ~세트가 아닌 상품들만 출력 (gift table)
select * from gift where gname not like '%세트';

-- Q6. gno가 10인 상품의 이름을 null로 처리하세요 (gift table)
select * from gift where gno='10';
update gift set gname='' where gno='10';

-- Q7. gname 이름이 없고, g_start가 999인 값을 갖는 데이터를 입력하세요 (gift table)
insert into gift(gname, g_start) values('', 999);

-- Q8. gname이 null 이거나 '' 인 데이터를 제외하고 출력하세요 (gift table)
select * from gift where gname !='' or gname is not null;
-- 또는
select * from gift where gname not in ('null', ' ');

-- Q9. 급여가 500 이상이고 보너스가 60이상인 교수는? (professor table)
select * from professor where pay >= 500 and bonus >= 60;

-- any, all, not in
select * from professor where pay > any(250, 310, 330);
select * from professor where pay = any(250, 310, 330);
select * from professor where pay != any(250, 310, 330);

select * from professor where pay not in(490, 500, 550);

select * from professor where pay < all (300, 400, 500);
select * from professor where pay > all (300, 400, 500);
select * from professor where pay = all (490, 500, 550); -- 안나옴
select * from professor where pay != all (490, 500, 550);

-- 집계함수
select * from gift;
select sum(g_start), sum(g_end) from gift;
select sum(g_start) "시작값 합계", sum(g_end) "최고가 합계", avg(g_end) 
    from gift;

select max(g_start), min(g_start) from gift;
select count(*) from gift; -- null 포함
select count(gno) from gift; -- null 제외

select rank(3000) within group(order by g_end desc) from gift;

select rank(600000) within group(order by g_end desc) 
    from gift where g_end is not null;
-- oracle : null을 우선순위로 둔다.
-- mysql : null을 낮은 순위로 둔다

-- Q10. 학생 테이블 중에서 키가 168cm인 사람은 몇 번째로  큰지 확인
select rank(168) within group(order by height desc) from student;

-- Q11. 학생 테이블 중에서 몸무게가 58kg인 사람은 몇 번째로 무거운지 확인
select rank(58) within group(order by weight desc) from student;

-- Q12. g_end가 200000, 600000 보다 작은 값 출력 (any 사용)
select * from gift where g_end < any(200000, 600000); 

-- Q13. 학생들의 키의 합과 평균, 가장 키가 큰 사람, 가장 키가 작은사람 출력
select sum(height), avg(height), max(height), min(height) from student;
    
--Q14. emp2 table emp_type으로 pay 합, 평균, 최고급여, 최저급여 구하기
select emp_type 계약형태, sum(pay) 급여합계, avg(pay) 급여평균, 
    max(pay) 최고급여, min(pay) 최저급여
    from emp2 group by emp_type;
    
