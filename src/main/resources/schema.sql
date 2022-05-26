DROP TABLE IF EXISTS team_member CASCADE;
DROP TABLE IF EXISTS player CASCADE;
DROP TABLE IF EXISTS team CASCADE;

CREATE TABLE team
(
    id    INT AUTO_INCREMENT PRIMARY KEY,
    coach VARCHAR(20) NOT NULL,
    year  BIGINT      NOT NULL
);

CREATE TABLE player
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL

);

CREATE TABLE team_member
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    team_id    BIGINT      NOT NULL,
    player_id  BIGINT      NOT NULL,
    number     TINYINT     NOT NULL,
    position   VARCHAR(20) NOT NULL,
    is_captain BOOLEAN     NOT NULL,
    FOREIGN KEY (team_id) REFERENCES team (id),
    FOREIGN KEY (player_id) REFERENCES player (id),
    UNIQUE KEY unique_composition (team_id, player_id)
);
