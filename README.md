### Overview
Major league baseball game data is available from an organization called Retrosheet.org.  The data is provided via downloadable delimited text files which can be painstakenly deciphered with documentation.

To be useful this data needs to be organized and loaded into a database where it can be analyzed and queried.



### Features
My project will load just small set of this data for major league seasons 1982 and 2015 to a database
- game data for all games of the 1982 and 2015 seasons 
- player game data for all players of the 1982 and 2015 seasons
- The data for 1982 and 2015 includes over 4500 games and 2,400 players and 129,000 records linking the games/players.

My project wil then provide a simple UI that allows a user to query 
- for a specific game and view information for the players of that game
- for a specific player and view information for the games for that player

Data for the regular season, wild card, division championship, league championship, and world series games will be loaded for the 1982 and 2015 major league seasons.

My project also requires the user to log in so that user information such as email address can be collected.



### Technologies
Loading data to database
- MySQL
- MySQL stored procedure
- Spring Batch
- Gradle
- JAVA SE JDK 13

UI 
- Spring Boot Web
- Spring Boot Data JPA
- Gradle
- Thymeleaf
- Boot Strap
- Hibernate
- MySQL
- JAVA SE JDK 13