INSERT INTO team (id, coach, year)
VALUES (1, 'Dominique Ducharme', 2019),
       (2, 'Dominique Ducharme', 2020);


INSERT INTO player (id, name, last_name)
VALUES (1, 'Carey', 'Price'),
       (2, 'Nick', 'Suzuki'),
       (3, 'Jesperi', 'Kotkaniemi'),
       (4, 'Jake', 'Evans'),
       (5, 'Alexander', 'Romanov'),
       (6, 'Shea', 'Weber');

INSERT INTO team_member (team_id, player_id, number, position, is_captain)
VALUES (1, 1, 31, 'goaltender', false),
       (1, 2, 14, 'forward', false),
       (1, 3, 15, 'forward', false),
       (1, 4, 71, 'forward', false),
       (1, 5, 27, 'defenseman', false),
       (1, 6, 6, 'defenseman', true),
       (2, 1, 31, 'goaltender', false),
       (2, 2, 14, 'forward', false),
       (2, 3, 15, 'forward', false),
       (2, 4, 71, 'forward', false),
       (2, 5, 27, 'defenseman', false),
       (2, 6, 6, 'defenseman', true);
