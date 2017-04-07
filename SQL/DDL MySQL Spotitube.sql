DROP DATABASE IF EXISTS Spotitube;

CREATE DATABASE Spotitube;

USE Spotitube;

CREATE TABLE Track(
	title			VARCHAR(50)	NOT NULL,
    performer		VARCHAR(50)	NULL,
    duration		TIME		NULL,
    album			VARCHAR(50)	NULL,
    playcount		INT			NULL,
    publicationdate	VARCHAR(50)	NULL,
    description		VARCHAR(50)	NULL,
    PRIMARY KEY PK_Track (title)
);

CREATE TABLE Playlist(
	owner	VARCHAR(50)	NOT NULL,
    name	VARCHAR(50)	NOT NULL,
    PRIMARY KEY PK_Playlist (owner, name)
);

CREATE TABLE Availability(
	owner			VARCHAR(50)	NOT NULL,
    name			VARCHAR(50)	NOT NULL,
    title			VARCHAR(50)	NOT NULL,
    availability	BIT			NOT NULL,
    PRIMARY KEY PK_Availability (owner, name, title)
);