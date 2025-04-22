-- Write your code here:
select top_retailers.rank company_rank, top_retailers.name company_name,
       suppliers.annual_revenue_billions supplier_revenue
from top_retailers, suppliers
where suppliers.annual_revenue_billions > 25;