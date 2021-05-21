drop table board;

-- 1. ���̺� ����
create table Board (
	num number(7) not null,				-- ���������� ó���� �۹�ȣ 
	writer varchar2(20) not null,		--�ۼ���
	email varchar2(30) ,					-- ����
	subject varchar2(50) not null,		 -- ����
	passwd varchar2(12) not null,   	 -- ��й�ȣ
	reg_date  date not null, 				 -- �۾� ��¥   
	readcount   number(3) default 0,	  -- ��ȸ��
	ref  number  not null, 					-- �׷�( �ۿ� ����...)
	re_step number not null,					-- �׷� ����
	re_level  number not null,				-- �׷� ����
	content  nvarchar2(2000) not null,	-- �۳���
	ip varchar2(20)  not null,   				--�� �� ���� ������
	constraint  board_num_pk  primary key(num)
	
) SEGMENT creation IMMEDIATE ;

-- 2. sequence ����
create sequence board_num;		-- �ڵ� ���� ��ȣ

select max(num) from board;

SELECT * FROM BOARD;

SELECT COUNT(*) FROM BOARD;

insert into board(num, writer, subject, email, content, passwd, reg_date, ref, re_step, re_level, ip) 
		values(board_num.nextval, 'b', 'b', 'b', 'b', 'b', '2016-03-21', 1, 1, 1, 1);
		
		
select count(*) from board;


select rownum, num, writer, ref from  
    (select num, writer, ref from BOARD order by ref desc) where writer='b';


select num, writer, email, subject, passwd, reg_date, ref, re_step, re_level, content, ip, readcount, r  
	from(select num, writer, email, subject, passwd, reg_date, ref, re_step, re_level, content, ip, readcount, rownum r 
		from(select num, writer, email, subject, passwd, reg_date, ref, re_step, re_level, content, ip, readcount 
			from board order by ref desc, re_step asc) order by ref desc, re_step asc, re_level asc, reg_date asc) where r>=1 and r<=2;

select * from board;
delete from board;

UPDATE BOARD SET RE_STEP = RE_STEP + 1, RE_LEVEL = RE_LEVEL + 1 WHERE ref=1;

SELECT MAX(RE_STEP) FROM BOARD where ref = 83 and re_level = 1