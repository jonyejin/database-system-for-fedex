delimiter $$

drop function if exists checkCardNumber $$
create FUNCTION `checkCardNumber` (
	CARD_NUMBER VARCHAR(16)
) RETURNS bool

BEGIN
declare v BOOL;
SET @v1 = 
CAST(SUBSTRING(CARD_NUMBER, 0, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 2, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 4, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 6, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 8, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 10, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 12, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 14, 1) as unsigned);

SET @v2 = 
CAST(SUBSTRING(CARD_NUMBER, 1, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 3, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 5, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 7, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 9, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 11, 1) as unsigned) + 
CAST(SUBSTRING(CARD_NUMBER, 13, 1) as unsigned);
-- CAST(SUBSTRING(CARD_NUMBER, 15, 1) as unsigned);


SET @added = 2 * @v1 + @v2;

if  @added % 10 = 0 then set v = true;
else set v = false;
end if;

return v;

end $$

-- select checkCardNumber("4520020019004060");
select checkCardNumber("0000000000000000");