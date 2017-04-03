USE Spotitube;

DELETE FROM Availability;
DELETE FROM Playlist;
DELETE FROM Track;

INSERT INTO Track VALUES
	('One day remains', 'Alter Bridge', '0:3:30', 'One day remains', NULL, NULL, NULL),
	('Simple man live', 'Shinedown', '0:9:15', NULL, 150000, '4-4-2009', 'Brent smith doing what he does best');

INSERT INTO Playlist VALUES
	('Thijs', 'Hardcore'),
	('Teun', 'Deep House'),
	('Thijs', 'Rawstyle'),
	('Thijs', 'Drum ''n Bass');

INSERT INTO Availability VALUES
	('Thijs', 'Hardcore', 'One day remains', 0),
	('Teun', 'Deep House', 'Simple man live', 1);