# SimpleSpitGame
Variation of Spit/Speed card game in Java.
#Goal
The goal of this project is to master git version control system via collaborative github project, and to practice general Java skills, focusing mainly on Java FX based interface, client - server network communication for multiplayer etc.
#Rules
The basic rules of the game are here: http://www.pagat.com/patience/spit.html but as the base version we introduce couple of modifications:

*at the beginning cards are split evenly between two players, so each gets 26 face-down cards in a pile

*each player's stack consists of maximally 4 face up cards

*whenever player gets two or more cards of the same value on his stack, he's able to "fold" them together in one face-up pile creating space for additional cards to be shoven from his face-down pile

*at the begining of the game each player fills his stack with four cards, and processes folding if it's possible, then fills free stack space if any is created

*when players are ready, they put two cards (one for each player) on center, and the actual game begins. The layout should look like this: layout.png

*player is able to play one of his stack cards on one of two top center cards on condition that the card he plays is one value higher or one value lower

*the goal of the game is to get rid of all of your cards

*whenever the game gets blocked so that there's no possibility for a player to make a move, players simultanously put one card from their face down pile on a table, just like on the very beginning of the game

*whenever a player notices that the two top cards on the center are of the same value, they're obliged to shout "stop!" as this causes the enemy player to collect all the center cards under their face-down pile


