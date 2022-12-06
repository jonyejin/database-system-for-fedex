
delimiter $$
drop function if exists kgtolb $$
-- drop function `kgtolb`;
create FUNCTION `kgtolb` (
	kg FLOAT
) RETURNS FLOAT

BEGIN
declare lb FLOAT;
set lb =  kg / 0.45359237;
return lb;

end $$

select kgtolb(1);
