/** This class is representative of the player. the user's in-game avatar figure. They are possessed of several
 * attributes which define them, namely their name, credit and health
 */
public class Player
{
  private String name
  //The user defines this variable via an input displayed upon game start
  private Int credit
    //This value will accumulate as the user commands the player character to perform actions. Positive actions
    //will award the player a set number of credits
  private Int health
  //This variable is defined upon game launch (presented as a percentage) and will decrease upon encountering
  //a form of negative feedback. The player is punished for committing impudent actions.
      public player(String name)
  //The player is composed of these three variables
      {
          this.name = name
          credit = 0
          health = 100
          //When depleted to zero, the game is over and will reset to its initial state. I will not include
          //lives, as many deem them archaic and being made to start over from the beginning will reinforce the user's
          //ability by repetition. If I am able to implement a checkpointing system, I will not introduce lives
          //but instead make the player restart from the checkpoint, with need to worry about restarting.
          //Restoring the game from a specific state may cause inconsistencies, the type of which may cause the
          //game to be unfinishable. I must conduct a number of tests to ensure this does not become the case.
      }
      public class Item
      {
          private ItemType itemType;
      }
      public enum ItemType
          //
      {

      }
}

