# The Shortest Bus Route Finder

This is the application that will build the shortest route from City 1-Stop A to City 2-Stop B. 

_TASK_

This route should be displayed as list of instructions for the user.

Output example:
- Get to Bus Stop A in City 1
- Take Bus #123 and direct to Bus Stop B in City 1
- Take Bus #234 and direct to Bus Stop C in City 1
- Take Bus #345 and direct to Bus Stop D in City 2
- Take Bus #999 and direct to Bus Stop E in City 2
- You achieved your final destination
  
Details:
- After starting program should print all available stops in both cities.
- Stop A and Stop B should be input parameters for the program.
- Found route details additionally should be saved in json and xml formats.
- All initial stops and routes information should be stored in DB. DB schema with all tables, relationships and initial data should be defined in sql script.

There are 2 city at some distance to each other.
Each city contains some amount of bus stops which are determined by coordinates (latitude-longitude).
There are amount of bus routes which connect all these stops.