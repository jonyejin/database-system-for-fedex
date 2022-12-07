delimiter $$
drop trigger if exists cs_question_deleted ;
create trigger cs_question_deleted before delete on `board` for each row
begin
	delete from `board_answer`
    where complaint_id = OLD.complaint_id;
end $$

delete from `board` where complaint_id = '3';