# The-Great-Java-Code-Off

•	Teams of 3-4 will have 75mins to solve the problem.

•	Teams should fork the repo, and submit their solutions in their own repo by the deadline

•	The solution should be in Java, there are no other restrictions.

•	Teams are encouraged to let the more junior members write the code with seniors guiding.  

•	After submissions, teams will have 3 mins to present their solutions, 

•	Presentations should include showing the working solutions and talking about the coding choices teams made, including why things have been done a certain way.

•	Judges will get 3mins to ask questions if they feel is necessary.

•	Teams will be assigned presentation slots in a random order.

•	After all teams have presented the Judges will pick a winner.

•	The use of the internet to look up syntax/language features is allowed. However, the use of ChatCPT/AI tools to produce the whole solution is not in the spirit of the competition.

# Judging Criteria

•   Does the solution produce the right answer (this is most important)

•   The Presentation, including how well teams explain their code.

•   Code Quality

•   Testing Quality

•   Scores will be weighted based on the teams' overall experience level (i.e. a team of 4 associates will be scored more favorably than a team of 4 seniors)


# The Challenge

In the world of a 2D grid. Calculate the coordinates that are visitable by a robot starting on (0,0) that can move horizontally or vertically one position at a time. 
In a world where every coordinate pair whose combined individual absolute digits add up to a sum greater than 23 has a mine on it, so (96, -69) comes to 9+6+6+9=30 definitely mined. 


Write the following Functions;

boolean isSafe(int x, int y)

Determines whether a given coordinate (x, y) is safe for the robot to visit, assuming the robot starts at (0,0)
Parameters:
x (integer): The x-coordinate of the position being checked.
y (integer): The y-coordinate of the position being checked.

Returns:
true if the coordinate (x, y) is safe to visit (the sum of its individual absolute digits is less than or equal to 23).
false if the coordinate (x, y) is mined (the sum of its individual absolute digits is greater than 23).


int totalSafeSquares()

Calculates the total number of safe squares in the 2D grid, that the robot can reach from (0,0), considering the mine placement rules
Returns:
The count of safe squares in the 2D grid.


### Extension task
This should only be completed upon successfully completing the previous 2 functions

int shortestSafeJourney (int a, int b, int x, int y)

Calculates the length of the shortest safe journey from the starting position (a, b) to the destination position (x, y).
git 
Parameters:
a (integer): The x-coordinate of the start position.
b (integer): The y-coordinate of the start position.
x (integer): The x-coordinate of the destination position.
y (integer): The y-coordinate of the destination position.
Returns:
The length of the shortest safe journey from (a, b) to (x, y) if a safe path exists. -1 if there is no safe path from (a, b) to (x, y) 

