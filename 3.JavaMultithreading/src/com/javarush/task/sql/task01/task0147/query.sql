-- Write your code here:

select required, identifier, description
from parts
where description is null or required is true