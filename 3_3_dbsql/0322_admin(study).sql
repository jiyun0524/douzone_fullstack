-- ���������
create user yoon identified by oracle;

-- ���� ������ lock Ǯ��
alter user yoon account unlock;

-- �⺻ ���� ����
grant connect, resource to yoon;