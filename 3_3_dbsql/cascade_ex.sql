CREATE TABLE t1 (
  id           NUMBER,
  description  VARCHAR2(50),
  CONSTRAINT t1_pk PRIMARY KEY (id)
);

CREATE TABLE t2 (
  id             NUMBER,
  t1_id          NUMBER,
  description    VARCHAR2(50),
  CONSTRAINT t2_pk PRIMARY KEY (id),
  CONSTRAINT t2_t1_fk FOREIGN KEY (t1_id) REFERENCES t1 (id) ON DELETE CASCADE
);

CREATE TABLE t3 (
  id             NUMBER,
  t2_id          NUMBER,
  description    VARCHAR2(50),
  CONSTRAINT t3_pk PRIMARY KEY (id),
  CONSTRAINT t3_t2_fk FOREIGN KEY (t2_id) REFERENCES t2 (id) ON DELETE CASCADE
);

INSERT INTO t1 VALUES (1, 't1 ONE');

INSERT INTO t2 VALUES (1, 1, 't2 ONE');
INSERT INTO t2 VALUES (2, NULL, 't2 TWO');

INSERT INTO t3 VALUES (1, 1, 't3 ONE');
INSERT INTO t3 VALUES (2, NULL, 't3 TWO');
COMMIT;

select * from t1;
select * from t2;
select * from t3;

SELECT (SELECT COUNT(*) FROM t1) AS t1_count,
       (SELECT COUNT(*) FROM t2) AS t2_count,
       (SELECT COUNT(*) FROM t3) AS t3_count
FROM   dual;

delete t1;
delete t2;
delete t3;


