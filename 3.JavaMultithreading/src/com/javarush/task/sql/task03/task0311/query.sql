-- Write your code here:
select top_retailers.name retailer, top_retailers.hq_location retailer_hq, supplier_country.country
from top_retailers, suppliers supplier_country