delimiter $$
drop function if exists lbtokg $$
-- drop function `lbtokg`;
create FUNCTION `lbtokg` (
	lb FLOAT
) RETURNS FLOAT

BEGIN
declare kg FLOAT;
set kg =  lb * 0.45359237;
return kg;

end $$

select lbtokg(1);
