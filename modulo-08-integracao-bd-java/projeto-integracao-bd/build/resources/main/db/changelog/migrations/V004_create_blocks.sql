CREATE TABLE BLOCKS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    blocked_at TIMESTAMP NOT NULL,
    block_reason TEXT,
    unblocked_at TIMESTAMP,
    unblock_reason TEXT,
    card_id BIGINT NOT NULL,
    FOREIGN KEY (card_id) REFERENCES CARDS(id)
);
