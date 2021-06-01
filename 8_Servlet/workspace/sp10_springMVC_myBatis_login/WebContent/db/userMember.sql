
create table UserMember(
		id varchar2(20),
		name varchar2(20),
		pwd varchar2(20),
		email varchar2(30),
		age number
);

select * from usermember;

insert into userMember values('kingsmile','김연아', '1','doyeon@bit.co.kr', 33);
insert into userMember values('kang','강감찬', '1','kang@bit.co.kr', 22);
commit;