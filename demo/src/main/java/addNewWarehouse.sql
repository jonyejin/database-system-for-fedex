DELIMITER $$
drop procedure if exists fedex.build_new_warehouse $$
drop view if exists temp_view3 $$

CREATE PROCEDURE `build_new_warehouse`(
	a_id VARCHAR(20),
    warehouse_name VARCHAR(20)
)
BEGIN
	DECLARE v INT DEFAULT 0; -- due to first insert, set v as 1
    set @v1 = (select count(*) as count_area_id from area a where a.area_id = a_id);
    -- area_id 존재 안하면 추가해주기
	insert into area(area_id) values(a_id);
    if @v1 = 0 THEN
		
		-- temp_view
		create view temp_view3 as select area_id from area a;
		
        set @count_row = (select count(*) from temp_view3);
        while v < @count_row do
			insert into warehouse_connection(start_warehouse_area, dest_warehouse_area, edge_weight) values((SELECT area_id from temp_view3 limit v, 1), a_id, v);
            set v = v+1;
		end while;
        
        -- sorry for weird code
        delete from warehouse_connection where start_warehouse_area = a_id;
        
	END IF;
    
    -- warehouse 에 row 추가해주기
    -- 몇번째인지 count받아와서 +1한 값 id로 쓰기
    set @c_warehouse = (select count(*) from warehouse);
    
    set @temp = concat("warehouse_id", @c_warehouse);
    insert into warehouse(warehouse_id, area_id, warehouse_name) values(@temp, a_id, warehouse_name);

END $$

call build_new_warehouse('area5', '옥천hub제2창고');
