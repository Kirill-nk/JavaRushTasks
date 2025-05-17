-- Write your code here:
select name
    --   ,round((length(name)-length(replace(name, 'Slope', ''))) / length('Slope')) as Slope,
    --   round((length(name)-length(replace(name, 'Clip', ''))) / length('Clip')) as Clip
from part
where name like '%Slope%' and round((length(name)-length(replace(name, 'Slope', ''))) / length('Slope')) = 2
      OR name like '%Clip%' and round((length(name)-length(replace(name, 'Clip', ''))) / length('Clip')) = 2