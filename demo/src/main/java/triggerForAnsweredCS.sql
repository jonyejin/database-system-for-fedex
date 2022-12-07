delimiter $$

drop trigger if exists fedex.cs_is_answered $$
create trigger cs_is_answered after insert on `board_answer` for each row
begin
	update `board`
    set is_answered = true
    where complaint_id = NEW.complaint_id;
end $$

insert into board_answer values("c_1", "21", "답변하면", "자동으로바뀌세요");