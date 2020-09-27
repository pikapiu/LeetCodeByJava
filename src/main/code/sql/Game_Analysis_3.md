[512. 游戏玩法分析 III](https://leetcode-cn.com/problems/game-play-analysis-iii/)

![game-play-analysis-iii](https://pkq-blog-img.oss-cn-hangzhou.aliyuncs.com/20200423092539.png)
## 题解

解法1:

```sql
SELECT a1.player_id, a1.event_date, SUM(a2.games_played) games_played_so_far
FROM activity a1,
     activity a2
WHERE a1.player_id = a2.player_id
  AND a1.event_date > a2.event_date
GROUP BY a1.player_id, a1.event_date
ORDER BY player_id, event_date;
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