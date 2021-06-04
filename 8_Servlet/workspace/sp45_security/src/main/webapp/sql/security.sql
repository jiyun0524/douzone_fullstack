
 
 select u.userid, u.password , u.enabled , u.roll_name  
 from user u  join roll r
 on user.userid = roll.userid
 ---------------------------------------------------------------
  select u.id, u.passwd , u.enabled , u.roll_name  
		 from user u  join roll r
 			on user.userid = roll.userid
-------------------------------------------------------------------- 
    4.   SELECT &quot;UID&quot; AS USERID  ,  pwd AS PASSWORD ,  1 enabled  , 'ROLE_USER' ROLL_NAME
		 	FROM member WHERE &quot;UID&quot;=?;     
 
 [ JDBC _2 ] => security-context.xml 코드 수정

 	<!--  DB연결하지 않고 in-memory 처리 	
    			<security:user-service>
    			<security:user name="kingsmile" password="kosta" authorities="ROLE_USER"/>
    			<security:user name="admin" password="kosta" authorities="ROLE_ADMIN,ROLE_USER"/>
    		</security:user-service> 
    	-->
 

<!-- JDBC 연동코드 -->
    	<security:jdbc-user-service data-source-ref="driverManagerDataSource"
    	 users-by-username-query="SELECT  id  AS USERID  ,  
    	                                             passwd AS PASSWORD ,  
    	                                             1 enabled 
    	                          FROM member  WHERE id=?"
    	 authorities-by-username-query="SELECT  id  AS USERID  ,  
    	                                         'ROLE_USER' AS ROLL_NAME
		                                FROM member  WHERE  id=?"                         
    	/>  
    



CREATE TABLE roll (
	userid VARCHAR2(20),
  Role_name VARCHAR2(30)
);

ROLE_USER , ROLE_ADMIN
INSERT INTO roll VALUES('admin','ROLE_USER');
INSERT INTO roll VALUES('admin','ROLE_ADMIN');

INSERT INTO roll VALUES('simson','ROLE_USER');
COMMIT;

select * from roll;
	
select * from tab;

select * from member;		 -- name, passwd, id

insert into member( no, name, jumin, passwd, id) values(1005, '해피도연', '7712202037926', '123', 'admin');

select * from members;


<!-- JDBC 연동코드 -->
    	<security:jdbc-user-service data-source-ref="driverManagerDataSource"
    	 users-by-username-query="SELECT id AS USERID  ,  
    	                                             paswd AS PASSWORD ,  
    	                                             1 enabled 
    	                          FROM member WHERE id=?"
    	 authorities-by-username-query="SELECT id AS USERID  ,  
    	                                         'ROLE_USER' AS ROLL_NAME
		                                FROM member WHERE id=?"                         
    	/>  
  --------------------------------------------------------------------------------- 	 
  SELECT id AS USERID  ,    'ROLE_USER' AS ROLL_NAME
		                                FROM member WHERE id= 'bobby';
		                                
  SELECT id AS USERID  ,    passwd AS PASSWD ,   1 enabled 
    	                          FROM member WHERE id='bobby' ;
    	                          
 ----------------------------------------------------------------------
   SELECT id AS USERID  ,    'ROLE_USER' AS ROLL_NAME
		                                FROM member WHERE id= 'admin';
		                                
  SELECT id AS USERID  ,    passwd AS PASSWD ,   1 enabled 
    	                          FROM member WHERE id='admin' ;
   	