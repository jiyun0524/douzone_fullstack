-- 계정만들기
create user yoon identified by oracle;

-- 만든 계정의 lock 풀기
alter user yoon account unlock;

-- 기본 권한 설정
grant connect, resource to yoon;