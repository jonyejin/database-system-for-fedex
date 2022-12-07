DELIMITER $$

drop procedure if exists `new_customer`;
CREATE PROCEDURE `new_customer`(
	first_name varchar(20),
    middle_name varchar(20),
    last_name varchar(20),
    
    house_phone varchar(20),
    cell_phone varchar(20),
    
    card_number varchar(15),
    card_type varchar(20),
    
    cvc varchar(3),
    expiration_year varchar(2),
    expiration_month varchar(2)
)
BEGIN
	-- insert customer_info
    -- id creation
    set @v1 = (select count(*) from customer_info);
    set @v2 = concat('customer_', @v1);
    
    insert into customer_info(customer_id, first_name, middle_name, last_name, house_phone, cell_phone) 
    values(@v2, first_name, middle_name, last_name, house_phone, cell_phone);
    
    -- insert payment 
    insert into payment(card_number, customer_id, card_type, cvc, expiration_year, expiration_month) 
    values(card_number, @v2, card_type, cvc, expiration_year, expiration_month);
    
  	
END $$
DELIMITER ;
call new_customer('yejin1', '', 'cho', '123123125', '123123125', '123123125', '123123125','123', '11', '22');
-- "yejin", "", "cho", "123123125", "123123125", "123123125", "123123125","123", "11", "22"