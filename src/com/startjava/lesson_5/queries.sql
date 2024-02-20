\echo All jaegers
SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo Not yet destroyed
SELECT *
  FROM jaegers
 WHERE status = 'ACTIVE'
 ORDER BY model_name;

\echo Jaegers Mark-1 and Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN (1, 4)
 ORDER BY model_name;

\echo All except Mark-1 and Mark-4
SELECT *
  FROM jaegers
 WHERE mark NOT IN (1, 4)
 ORDER BY mark DESC;

\echo The oldest
SELECT *
  FROM jaegers
 WHERE launch <= (SELECT MIN(launch)
                    FROM jaegers)
 ORDER BY model_name;

 \echo Jaegers that killed most kaiju
SELECT *
  FROM jaegers
 WHERE kaiju_kill >= (SELECT MAX(kaiju_kill)
                        FROM jaegers)
 ORDER BY kaiju_kill DESC;

 \echo Average weight
 SELECT ROUND(AVG(weight), 3) AS avg_weight
   FROM jaegers;

\echo Increase killed kaiju by 1 with undestroyed jaegers
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status != 'DESTROYED';

SELECT *
  FROM jaegers
 ORDER BY model_name;

\echo Delete all destroyed
DELETE FROM jaegers
 WHERE status = 'DESTROYED';

SELECT *
  FROM jaegers
 ORDER BY model_name;
 