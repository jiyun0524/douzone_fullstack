-- 이전시간 복습
-- Q1. emp2 테이블에서 deptno(부서) 별로 pay 합과 평균 구하기
select deptno, sum(pay), avg(pay) from emp2 group by deptno;

-- Q2. emp2 테이블에서 emp_type 별로 pay 합과 평균 구하기
select emp_type, sum(pay), avg(pay) from emp2 group by emp_type;

-- Q3.  emp2 테이블에서 position(직급) 별로 pay 합과 평균 구하기
select position, sum(pay), avg(pay) from emp2 group by position;

-- Q4.  emp2 테이블에서 position(직급) 별로 pay 합과 평균 구하는데, 직급이 과장인 사람들만 출력하기
select position, sum(pay), avg(pay) from emp2 where position='과장' group by position;
select position, sum(pay), avg(pay) from emp2 group by position having position = '과장';

-- 숫자함수
select round(12.34567, 0), round(12.34567, 2), round(12.34567, 1) from dual;
select ceil(11.34), ceil(-12.34) from dual; -- 올림 후 정수반환
select floor(12.34), floor(-12.34) from dual; -- 내림 후 정수반환
select trunc(12.3456, 2), trunc(12.34756, 2), trunc(12.7456, 2) from dual; -- 내림

-- 문자열함수
select * from professor;
select id, upper(id), lower(id), upper('kingsmile'), initcap(id) from professor;

select length('candide'), lengthb('candide') from professor;
select name, length(name), lengthb(name) from professor;

select instr('abcd', 'b') from dual;
select id, instr(id, 'b') from professor;
-- -n이면 뒤에서 부터 n번째
select instr('abcdefghijkboy', 'b', '-1') from dual; 
select instr('abcdefghijkboy', 'b', '-3') from dual;

select lpad('abcd', 20, '#') from dual;
select lpad(id, 20, '#') from professor;
select lpad(dname, 10, '1234567890') from dept2;

select rpad('abcd', 20, '@') from dual;
select dname, rpad(dname, 15, '*') "RPAD 연습" from dept2;

select length('korea'), length('    korea   '), length('korea          ') from dual;
select length('korea'), length(ltrim('    korea   ')), length(rtrim('korea          ')) from dual;

-- 한글 자체는 프로그램 적으로는 2byte이다.
-- length() 함수는 한글도 영문과 같은 한글자 1byte 처리하고,
-- lengthb() 함수는 영문/숫자는 한글자 1byte 처리하고, 한글은 XE에서는 1글자 3byte처리하고
-- 엔터프라이즈급에서는 한글 1글자 2byte 처리한다.

-- 날짜함수
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

select name, tel, substr(tel, 1, instr(tel, ')') -1) "지역번호"
    from student
    where deptno1 = 101;

-- 문자열, 시작위치    
select substr('abcde', 2) from dual;
-- 문자열, 시작위치, 추출 갯수
select substr('abcde', 2, 2) from dual;

select * from professor;
select name, hpage, instr(hpage, '/', -1)
    from professor;
    
select name, hpage, substr(hpage, instr(hpage, '/', -1) +1) "홈페이지주소"
    from professor
    where hpage is not null;
    
select months_between
    (TO_DATE('03-24-2021', 'MM-DD-YYYY'),
    TO_DATE('03-23-2020', 'MM-DD-YYYY')) "Month"
        from dual;
        
select add_months(hiredate, 1) "Next month"
    from professor
    where name='심슨';
    
select hiredate, to_char(add_months(hiredate, 1)) "Next month"
    from professor
    where name='심슨';
    
    
select sysdate,
    Last_day(sysdate) "Last Day", 
    Last_day(sysdate) - sysdate "Last Day"
        from dual;

select name, birthday,
    Last_day(birthday) "Last Day"
        from emp2;

-- 다음번에 오는 월요일은 언제일까?
select next_day('2021/03/24', 2) "Next Day" from dual; -- 1:일요일/2:월요일

select birthday, next_day(birthday, 7) "Next Day" from emp2;

select * from department;
select * from product;

------------------------------------------------
select p_code,
    decode(p_code, 100, 'NEW YORK',
                            101, 'DALLAS',
                            102, 'BOSTON',
                            105, 'CHICAGO',
                                    '지역을 몰라용') "Location of inventory"
    from product
    where p_code < 103;
------------------------------------------------

select * from dept;
select * from emp;

select deptno, decode(deptno, 10, 'Accounting',
                                              20, 'Research',
                                              30, 'Sales', 'Operations') name
    from dept;
    
-- Q1. 10번 부서는 급여합계를, 20번 부서는 최대값을, 
--       30번 부서는 최소 값을 출력하는 예제를 작성(decode 사용)
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

-- oracle 버전에 따라 한글 크기가 다르다
select substr('한글날', 1, 2) from dual;
select substrb('한글날', 1, 3) from dual;

select * from reg_test;