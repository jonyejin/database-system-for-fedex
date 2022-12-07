delimiter $$

drop trigger if exists fedex.relocate_cs_workers $$
create trigger relocate_cs_workers before delete on `cs_department` for each row
begin
	update `cs_worker_info`
    set cs_department_id = (select cs_department_id
    from cs_department 
    where area_id = (select area_id from cs_department where 
    cs_department_id = OLD.cs_department_id) and 
    cs_department_id <> OLD.cs_department_id
    limit 1)
	where cs_department_id = OLD.cs_department_id;
	
end $$

delete from cs_department where cs_department_id = 2;