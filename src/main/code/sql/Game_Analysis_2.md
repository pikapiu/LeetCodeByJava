[512. 游戏玩法分析 II](https://leetcode-cn.com/problems/game-play-analysis-ii/)

![activity](https://pkq-blog-img.oss-cn-hangzhou.aliyuncs.com/20200304190224.png?x-oss-process=style/small)

## 题解

解法1:

```sql
SELECT device_id,player_id FROM Activity 
WHERE
( player_id,
  event_date
)
IN
( SELECT player_id,MIN(event_date) FROM Activity GROUP BY player_id
)
```

解法2:

```sql
SELECT a.device_id, a.player_id
FROM
Activity a
JOIN
(
SELECT player_id,MIN(event_date) lastest_date FROM Activity GROUP BY player_id
) t
ON  t.player_id = a.player_id AND t.lastest_date = a.event_date
```

解法3:
```sql
SELECT
player_id,
device_id
FROM
(
SELECT
ac.*,
if(@player=player_id,@row_num:=@row_num+1,@row_num:=1) row_num,
@player:=player_id
FROM
Activity ac,
(SELECT @row_num := 0,@player:='') b
order by player_id,event_date
) a
where a.row_num =1
```