-- Write your code here:
select name
    --   ,round((length(name)-length(replace(name, 'Slope', ''))) / length('Slope')) as Slope,
    --   round((length(name)-length(replace(name, 'Clip', ''))) / length('Clip')) as Clip
from part
where name like '%Slope%Slope%'
      OR name like '%Clip%Clip%'