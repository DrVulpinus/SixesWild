# SixesWild
This is the code for Software Engineering group Phoebe

SIXES WILD - HOW TO START THE GAME:

In the zip file, open the project SixesWild in Eclipse. Expand src >> forms and then right-click on the file "StartProgram".
Select the option Run As >> Java Application.
The game will load a splash screen and then load the main menu.

Double-click the Level button to bring up the Level Selection screen.
Grey panels indicate that a level is not currently accessible.  Currently, the only accessible level will be level 1, which
is a puzzle level.

Left-click any of the first four levels to begin playing a level. Each level is a different type of mode:
-PUZZLE MODE
-LIGHTNING MODE
-ELIMINATION MODE
-RELEASE MODE

Upon beginning a level, click and drag the mouse across at least two blocks whose values add up to six to perform a move. Performing a move simultaneously increases the score, and in Puzzle, Elimination, and Release modes, the game decrements a unique value that affects the level's win conditions.

In Puzzle Mode, the player can perform moves that add up to six and a number of moves is displayed. When the value reaches 0, the game will end.

In Lightning mode, the player can perform moves as they would in Puzzle mode and a timer is displayed. When the timer gets to 0, the game will end.

In Elimination mode, the player can mark up squares after a move is performed. A total number of squares in the level is displayed at the beginning of the game. Once the player successfully marks each square in the level, the game will end. (Some of these levels may not be able to be won).

In Release mode, a number of 6 blocks will be displayed in the level, as well as a number of release blocks (pink squares). When a 6 block is directly vertically adjacent to a release block, the release block "consumes" that block, which updates the number of release blocks left. Once the number of release blocks left reaches 0, the game will end.

When the game ends, the game checks if the player has reached at least 1 star level (displayed by the progress bar on the game screen). If the player has not reached at least 1 star level, they do not unlock the next level.

If at least 1 star level is reached when the game ends, the next level of that type is unlocked, and is now playable.

If the player successfully beats a level, the game saves the number of stars they achieved for that level and displays them in the level selection screen.

Left-clicking the Back button mid-game will return the screen to the level selection screen. The player's progress in that level is saved, and even if the player begins playing a different level, their progress in that level will be the same when they return to it.

In any level, the player also has access to special moves. These moves do not update the score but still count as a move that has been made, and have an infinite number of uses. When a special move is selected and used, the current move reverts back to a regular move.

Swap Move - swaps two selected squares. Does not work if more than two squares are selected.

Clear Block - removes a block from the grid. Any tiles above that grid drop down to fill the space.

Shuffle Board - re-shuffles all tiles on the board except for 6 blocks and release blocks (in Release Mode).

Exit the application by left-clicking the red 'X' in the top right corner of the screen.




SIXES WILD - HOW TO START THE LEVEL EDITOR:

In the zip file, open the project SixesWild in Eclipse. Expand LevelBuilder >> forms and right-click on the file "StartBuilder".
Select the option Run As >> Java Application
The game will load a splash screen and then load the main menu.

Left-click any of the buttons to begin creating a new level. Each button indicates a different type of level to create.

Left-clicking the Exit Without Saving will cause the application to quit without saving the user's progress in creating the level. When the application is run again, it will generate a new, empty grid on the screen.

Left-click the Close button to exit the level. Doing so will save the current level in the builder.

Various tools are available to select in the drop down menu:

Add Square - when selected, clicking on the grid in a square causes a square to be placed in that location.

Add Release Square - when selected, clicking on the grid in a square causes a release square to be placed in that location.

Remove Square - when selected, clicking on the grid in a square causes a square to be removed from that location. Nothing happens if a square is not already in that location.

Add Six - when selected, clicking on the grid in a square causes a six to be placed in that location. A six cannot be placed in the grid if it is not being placed in a pre-existing square.

Remove Six - when selected, clicking on the grid in a square causes a six to be removed from that location. Nothing happens if a six is not already in that location.

Other settings can be readjusted by pressing various buttons:

Enable/Disable Special Moves - causes a menu with check boxes to be selected, indicating which special moves should be allowed in a level. Pressing the close button exits the menu, but saves any changes. The special buttons that appear in the builder itself are just an indicator of the general area in which the special moves will appear.

Edit Star Points - opens a menu where the required star points are displayed. The numbers indicate how many points are required for that number of stars. Pressing the close button exits the menu, but saves any changes.

Edit Value % - opens a menu where the frequencies of each value of block is displayed. Changing the fields in this menu affect the probability of a block of an indicated value spawning in a square when a level is loaded for the first time. The total sum of all the percentages are displayed at the bottom of the box; if the total sum does not add up to 100%, it returns an error message. Pressing the close button exits the menu, but saves any changes.

Edit Multiplier % - opens a menu where the frequencies of each multiplier of block is displayed. Changing the fields in this menu affect the probability of a multiplier of an indicated value spawning in a block when a level is loaded for the first time. The total sum of all the percentages are displayed at the bottom of the box; if the total sum does not add up to 100%, it returns an error message. Pressing the close button exits the menu, but saves any changes.

Save Level - saves the level and adds it to the player application. Opening the player application after saving will display a new level with an added file name.

Preview Level  - opens a "preview" of the level, which displays all updated changes and the grid as it was edited in the builder.

Go Back - returns to the main menu screen. Does NOT save changes.

Update Stats - Saves any changes made directly to the text field which contains the win condition unique to a level type. Does not save changes to the score.

The textfields also adjust various things:

Score - is editable, but changes to it are not saved.

Moves Remaining/Marked Squares Remaining/Time Remaining/Release Blocks Remaining: Adjusts the requirements for a player to beat a level.

