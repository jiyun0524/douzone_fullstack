-- PL/SQL
--begin
--    dbms_output.put_line('yeahhhhhhhh');
--end;

--DECLARE 
--    NAME varchar2(10):='apple';
--    age number := 10;
--begin
--    -- dbms_output.put_line(name|| ',' || age || 'yammy');
--    dbms_output.put_line('당신의 이름은' || name || '이군요, 나이는' || age || '살이군요');
--end;

-- declare name emp.enmae%type; == declare name varchar2(10);

--declare e_name emp.ename%type;
--            e_sal emp.sal%type;
--begin 
--    select sal, ename into e_sal, e_name from emp where empno='7788';
--        dbms_output.put_line('7788님의 이름은 ' || e_name || '급여는 ' || e_sal);
--end;

-- 아니 이건 안되는데 왜안되는건지 모르겠음
--declare data emp%rowtype;
--begin
--    select * into data from emp where empno='7788';
--    dbms_output.put_line(data.ename ||', '|| data.job ||',' ||data.mgr ||','|| data.deptno);
--end;

--declare
----    v_su number := 87;
--    v_su number := &v_su;
--begin
--    -- 실행문 작성 공간
--    if mod(v_su, 2) = 0 then
--        dbms_output.put_line('짝수데잉');
--    else
--        dbms_output.put_line('홀수데잉');
--    end if;
--end;

--create procedure p_test
--is
--    declare
--        v_su number := 87;
----        v_su number := &v_su;
--    begin
--        -- 실행문 작성 공간
--        if mod(v_su, 2) = 0 then
--            dbms_output.put_line('짝수데잉');
--        else
--            dbms_output.put_line('홀수데잉');
--        end if;
--    end;
--    
--exec p_test;
----------------------------------------------------
-- 실습 !_!_!
-- Q1. 점수 받아서 평점(학점)을 출력 (if 사용)
declare
    score number := &score;
    begin
        dbms_output.put_line('너의 점수는');
        if (score>=90) then
            dbms_output.put_line('A');
        elsif (score>=80) then
            dbms_output.put_line('B');
        elsif (score>=70) then
            dbms_output.put_line('C');
        elsif (score>=60) then
            dbms_output.put_line('D');
        else
            dbms_output.put_line('F');
        end if;
        dbms_output.put_line('축하축하');
    end;
----------------------------------------------------
-- Q2. 1~100 사이 값 중에서 3의 배수의 합과 개수 구하기
declare
    num_sum number := 0;
    num_num number := 0;
    begin 
        for i in 1..100 loop
            if mod(i, 3) = 0 then
                dbms_output.put_line(i||'는 3의 배수당');
                num_sum := i + num_sum;
                num_num := num_num + 1;
            end if;
        end loop;
        dbms_output.put_line(num_sum ||'는 배수의 합이당 '||','|| 
                                        num_num ||'는 배수의 갯수당');
    end;
----------------------------------------------------
-- Q3. 원하는 단 입력받아서 구구단 출력 프로그램 작성
declare
    ori_num number := &ori_num;
    begin 
        dbms_output.put_line('구구단 '|| ori_num || '단 출력 시작');
        for i in 1..9 loop
            dbms_output.put_line(ori_num || 'X' || i || ' = ' || ori_num*i);
        end loop;
    end;

----------------------------------------------------
-- Q4. loop 문으로 6부터 14까지 출력하기
declare 
    v_num number := 6;
    v_total_num number := 0;
    begin
        while v_num < 15 loop
            dbms_output.put_line('현재 숫자는 : ' || v_num);
            v_num := v_num + 1;
            v_total_num := v_total_num + 1;
        end loop;
        dbms_output.put_line(v_total_num || '번 회전했음');
    end;
----------------------------------------------------
-- Q5. 원하는 단 입력받아서 구구단 출력 프로그램 작성(while문)
declare
    v_num number := &v_num;
    i number := 1;
    begin
    dbms_output.put_line(v_num || '단 출력을 시작합니다');
        while i<9 loop
            i := i + 1;
             dbms_output.put_line(v_num || 'X' || i || ' = ' || v_num*i);
        end loop;
    end;
----------------------------------------------------
-- CASE 예제
declare
    v_grade char(1) := 'S';
    v_str VARCHAR2(30);
    begin
        v_str :=
        case v_grade
            when 'A' then '상'
            when 'B' then '중'
            when 'C' then '하'
            else '노력필요'
        end;
        dbms_output.put_line(v_grade || '는 ' || v_str);
    end;
----------------------------------------------------
-- Q6. 구구단 2중 반복문
declare
    orinum number := 1;
    subnum number := 1;
    begin
    dbms_output.put_line('구구단 시작');
        for orinum in 1..9 loop
            for subnum in 1..9 loop
                dbms_output.put_line(orinum || 'X' || subnum || ' = ' || orinum*subnum);
            end loop;
        end loop;
    end;
----------------------------------------------------
create or replace PROCEDURE p_test2(
    name in varchar2
    )
    is
    begin
        dbms_output.put_line(name || '님 하이');
    end;
exec p_test2('쥐');
----------------------------------------------------
-- ex. 인수 아이디, 이름, 나이, 주소를 입력받아 userlist 테이블에 
--      insert 한 후 인수의 값들을 출력하는 프로시져 작성
create or replace procedure p_emp2insert (
    empno in emp2.empno %type := 8888,
    name in emp2.name%type default '이쁜이',
    deptno in emp2.deptno%type := 8888,
    hobby in emp2.hobby%type := null
    )
    is
    begin
        insert into emp2(empno, name, deptno, hobby) values(empno, name, deptno, hobby);
        dbms_output.put_line('insert 정보는 ' || empno || name || deptno || hobby);
    end;
    
exec p_emp2insert(7777, 'ㅇㅣ효리', 7777, '서울');
exec p_emp2insert; -- 인수 넣지 않을 경우 기본 값으로 셋팅
exec p_emp2insert(empno=>9999, name=>'장둉공', deptno=>9999);
----------------------------------------------------
create procedure p_stud
is
    begin
        select into from student order by id desc;
    end;
----------------------------------------------------
-- Q1. 저장프로시저 emp 테이블에서 
--      급여 상위 5위까지 출력하는 프로시저 만들기
select sal from emp where rownum=1;
select ename, sal from emp order by sal desc;
delete emp where rownum = 1;

select *
  from (select * from emp order by sal )    -- 인라인 뷰  
  where rownum=1 ; 

select  x.*
  from (select * from emp) x   -- 인라인 뷰  
  where rownum=1 ; 
  
  select e.* from emp e, dept2 d ;

select x.*
  from emp x, dept2 d   -- 인라인 뷰  
  where rownum=1 ;

--cf)
select top 1 sal from emp;  -- top 값 MSSQL에 있는 명령
----------------------------------------------------
-----방법1. ----------------------------------------
drop PROCEDURE p_empMaxSal;

create or replace procedure p_empMaxSal 
is
  v_emprow  emp%ROWTYPE;
  Begin
    for i in 1..5 loop
      select * into v_emprow from 
        ( SELECT *
            FROM ( select * from emp order by sal desc ) 
              WHERE ROWNUM <= i ) where rownum <= 5 ;
        dbms_output.put_line(v_emprow.empno || ' ' || v_emprow.ename || ' ' || v_emprow.sal);
    end loop;
  end;
----------------------------------------------------
exec p_empMaxSal ;
----방법2. -----------------------------------------
create or replace procedure emp_top5
is
  v_emprow emp%ROWTYPE;
begin
  for i in 1..5 loop
    select * into v_emprow from 
        (select * from (select * from emp order by sal desc)
         where rownum<=i order by sal, ename) where rownum=1 order by sal asc;
    dbms_output.put_line(v_emprow.empno || ' ' || v_emprow.ename || ' ' || v_emprow.sal);
  end loop;
end;
----------------------------------------------------
exec emp_top5;
----------------------------------------------------
select rownum, ename, sal from emp  where rownum <= 5
  order by sal desc;
----------------------------------------------------
-- 프로시저 cusor 활용 문제
-- Q1. 특정 과목을 인수로 받아 그 과목을 강의하는 
--       강사 정보 검색를 검색하는 프로시져 작성.
select * from professor;
select * from department;

-- Q2. 특정 과목을 수강하고 있는 학생의 정보를 검색하는 프로시져 작성.
create or replace procedure p_job_emp(e_job in emp.job%type)
is
name emp.ename%type;

select * from student;
-- Q3. 1~100 사이를 반복하되 10의 배수만 출력하는 프로시져 작성.
declare
    v_num number := 1;
begin
    for v_num 1..100
        if(mod(v_num, 10) = 0)
            dbms_output.put_line(v_num);  
    end loop;
end;

declare
    ori_num number := &ori_num;
    begin 
        dbms_output.put_line('구구단 '|| ori_num || '단 출력 시작');
        for i in 1..9 loop
            dbms_output.put_line(ori_num || 'X' || i || ' = ' || ori_num*i);
        end loop;
    end;
-- Q4. member 테이블(id, name, age, addr)에 데이터를 insert한 후 
--      최종 모든 레코드를 검색하는 프로시져작성 (insert 데이터는 
--      인수로 받는다 , cursor 이용, 출력 후 최종 전체 레코드수를 출력한다.)

-- Q5. id, name, age를 인수로 받아 id에 해당하는 레코드의 값을 인수로 들어온
--      name, age로 update 하고 난 후 commit 하고 변경된 레코드의 
--      결과를 출력하는 프로시져를 작성하시오.

-- Q6. 강사가 담당하는 과목과 그 과목이 어느 강의실에서 진행되며 
--       총 수용 인원이 몇 명인지 검색하는 프로시져 작성.
--       (아래그림참조) -(Join이용 , cursor 이용)