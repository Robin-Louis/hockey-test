INSERT INTO team (coach, year)
VALUES ('Dominique Ducharme', 2019),
       ('Dominique Ducharme', 2020);


INSERT INTO player (number, name, last_name, position, is_captain)
VALUES (31, 'Carey', 'Price', 'goaltender', false),
       (14, 'Nick', 'Suzuki', 'forward', false),
       (15, 'Jesperi', 'Kotkaniemi', 'forward', false),
       (71, 'Jake', 'Evans', 'forward', false),
       (27, 'Alexander', 'Romanov', 'defenseman', false),
       (6, 'Shea', 'Weber', 'defenseman', true);

INSERT INTO team_player (team_id, player_id)
values (1, 1);
INSERT INTO team_player (team_id, player_id)
values (1, 2);
INSERT INTO team_player (team_id, player_id)
values (1, 3);
INSERT INTO team_player (team_id, player_id)
values (1, 4);
INSERT INTO team_player (team_id, player_id)
values (1, 5);
INSERT INTO team_player (team_id, player_id)
values (1, 6);
INSERT INTO team_player (team_id, player_id)
values (2, 1);
INSERT INTO team_player (team_id, player_id)
values (2, 2);
INSERT INTO team_player (team_id, player_id)
values (2, 3);
INSERT INTO team_player (team_id, player_id)
values (2, 4);
INSERT INTO team_player (team_id, player_id)
values (2, 5);
INSERT INTO team_player (team_id, player_id)
values (2, 6);
