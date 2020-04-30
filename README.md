# 00-Design-Justice-League

Q1: The Justice League has had another run in with the Legion of Doom, led this time by Vandal Savage. The Legion’s newest scheme involves pelting the earth with a series of giant meteors. The plan is to cause widespread earthquakes and therefore destruction, ushering in a new age of civilization, with Vandal Savage in charge. Luckily, Batman has a contingency plan for every situation. He is going to have Superman fly up into the atmosphere and use his heat vision to destroy the meteors (or at least blow them up into smaller pieces) in the order that they are going to reach the ground. Batman needs a program into which he can enter meteors as they are discovered and which will output the meteors in the correct order so that he can tell Superman which one to destroy next.

For this question, I chose to make multiple classes: Superman, Batman, Meteor, MeteorDestroyer, and Outerspace. Multiple classes helped to keep my ideas organized. If I felt stuck on a "design" issue, I asked myself what is the purpose of this paricular class. This almost always gave clarity.

Moreover, this question had some areas of ambiguity. For example, how was one to decide the correct order of the meteors? By distance, velocity, size? I decided to go with the metors distance to Earth, thinking that velocity of falling
objects in a vaccum would be the same and that meteor of almost any size should be considered a threat. So I added the
meteors to a priority queue, sorting them by their distance.

Essentially, I first create an outer space with a random number of meteors at random locations in the space Grid. Batman
scans the outer space for meteors and return a list of meteors. Superman adds the meteors to a priority queue and destroys
them one by one.
