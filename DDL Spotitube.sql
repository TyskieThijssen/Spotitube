USE master
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
)
GO

CREATE TABLE Playlist(
	owner	VARCHAR(50),
	name	VARCHAR(50),
	CONSTRAINT PK_Playlist PRIMARY KEY (owner, name)
)
GO

CREATE TABLE Availability(
	owner			VARCHAR(50),
	name			VARCHAR(50),
	title			VARCHAR(50),
	availability	BIT,
	CONSTRAINT PK_Availability PRIMARY KEY (name, title)
)
GO

CREATE TABLE Users(
	name	VARCHAR(50),
	age		INT
)
GO