DELIMITER $$

DROP PROCEDURE IF EXISTS fedex.write_cs_and_set_worker;

CREATE PROCEDURE `write_cs_and_set_worker`(
	whole_request_id VARCHAR(20),
    question_type TINYINT,
    title VARCHAR(100),
    body VARCHAR(300),
    is_answered TINYINT
)
BEGIN
	-- insert to board
    -- create complaint_id
    set @v1 = (select count(*) from board);
    set @v2 = concat('complaint_', @v1);
question_typequestion_type    
    insert into board(complaint_id, id, question_type, title, body, is_answered) 
    values(@v2, whole_request_id, question_type, title, body, is_answered);
    
    -- cs_worker_info에서 근무자 뽑아오기
    set @id = (select worker_id from cs_worker_info limit 1);
    
    -- 빈 customer_service_answer 만들기
    insert into board_answer(complaint_id, worker_id, title, body) 
    values(@v2, @id, "답변 대기 중입니다.", concat(id, "상담사가 배정되었고 답변을 기다리는 중입니다."));
END $$
DELIMITER ;
