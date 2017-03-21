USE master
GO

DROP DATABASE Spotitube
GO

CREATE DATABASE Spotitube
GO

USE Spotitube
GO

CREATE TABLE Track(
	title			VARCHAR(50) PRIMARY KEY,
	performer		VARCHAR(50),
	duration		TIME,
	album			VARCHAR(50),
	playcount		INT,
	publicationdate	DATE,
	description		VARCHAR(500),
	availability	BIT
)
GO

CREATE TABLE Playlist(
	naam	VARCHAR(50),
	title	VARCHAR(50),
	CONSTRAINT PK_Playlist PRIMARY KEY (naam, title),
	CONSTRAINT FK_Playlist FOREIGN KEY (title) REFERENCES Track(title)
)
GO

CREATE TABLE Users(
	naam	VARCHAR(50),
	age		INT
)
GO