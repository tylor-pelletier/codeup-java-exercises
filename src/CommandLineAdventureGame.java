import java.util.Scanner;

public class CommandLineAdventureGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Desolation Adventure Game

        System.out.println("Desolation Adventure Game started...");
        System.out.println(" ");
        System.out.println("The year is 2176. The world as you know it is gone.  world had plummeted in a nuclear " +
                "race, trying arm themselves with the largest force imaginable. \nPeach between countries grew thin " +
                "and event after event lead to a full scale firing of the nuclear bombs. and one after another, the " +
                "nuclear launch was initiated. \nOnly a few survived this apocalypse in secure bunkers with rations of " +
                "resources. You are in what use to be the mountains of Colorado and it is the summer time. \nThere your " +
                "family had a secure bunker in the mountain. You are inside this bunker, but you need more resources...");
        System.out.println(" ");

        int b = 0;
        for (int a = 0; a <= b; a += 1) {

            System.out.print("Do you want to explore the mountain or the cave? [mountain/cave]: ");

            String mountainOrCave = sc.next();
            boolean exploreMountain = mountainOrCave.equals("mountain");
            boolean exploreCave = mountainOrCave.equals("cave");

            if (exploreMountain) {
                System.out.println("You are now outside exploring the mountain");
                int d = 0;
                for (int c = 0; c <= d; c += 1) {
                    System.out.print("Do you want to go up the mountain or down the mountain? [up/down]: ");

                    int f = 0;
                    for (int e = 0; e <= f; e += 1) {

                        String upOrDown;
                        if (f == 1) {
                            upOrDown = "up";

                        } else {
                            upOrDown = sc.next();

                        }
                        boolean goUp = upOrDown.equals("up");
                        boolean goDown = upOrDown.equals("down");

                        if (goUp) {
                            System.out.println("You start walking up the mountain");
                            System.out.print("You chop down some wood for the fire");
                            System.out.println("\\\\Wood added to inventory\\\\");
                            System.out.println("You get to the top and see some smoke off in the distance...");

                            int h = 0;
                            for (int g = 0; g <= h; g += 1) {

                                System.out.print("Do you want to go checkout the smoke or bring wood home? [checkout/home]: ");

                                String checkoutOrHome = sc.next();
                                boolean checkoutSmoke = checkoutOrHome.equals("checkout");
                                boolean goHomeWithWood = checkoutOrHome.equals("home");


                                if (checkoutSmoke) {
                                    System.out.println("You start heading towards the smoke");
                                    System.out.println("You hear cracking of branches and leaves to your right");
                                    System.out.println("Out of the woods comes a rabid mountain lion, worn from radiation");
                                    System.out.println("It starts heading straight for you");
                                    System.out.println("Game in progress. End game");

                                } else if (goHomeWithWood) {
                                    System.out.print("You start walking down the mountain");
                                    if (f == 1) {
                                        System.out.println("You make it home and add the wood to the pile and water to the reservoir");
                                        System.out.println("\\\\Wood removed from inventory\\\\");
                                        System.out.println("\\\\Water removed from inventory\\\\");
                                    } else {
                                        System.out.println("You make it home and add the wood to the pile");
                                        System.out.println("\\\\Wood removed from inventory\\\\");
                                    }
                                    b += 1;

                                } else {
                                    System.out.println("That isn't and option");
                                    h += 1;

                                }

                            }

                        } else if (goDown) {
                            System.out.println("You start walking down the mountain");
                            System.out.println("You find a stream at the bottom of the mountain");
                            System.out.println("\\\\Water added to inventory\\\\");

                            int j = 0;
                            for (int i = 0; i <= j; i += 1) {

                                System.out.print("Do you want to go up the mountain or home? [up/home]: ");

                                String upOrHome = sc.next();
                                boolean goUpMountain = upOrHome.equals("up");
                                boolean goHome = upOrHome.equals("home");

                                if (goUpMountain) {
                                    f += 1;

                                } else if (goHome) {
                                    System.out.println("You start walking home");
                                    System.out.println("You make it home and fill up your reservoir with water");
                                    System.out.println("\\\\Water removed from inventory\\\\");
                                    b += 1;

                                } else {
                                    System.out.println("That isn't and option");
                                    j += 1;

                                }

                            }

                        } else {
                            System.out.println("That isn't and option");
                            d += 1;
                        }

                    }

                }

            } else if (exploreCave) {
                System.out.println("You walk to the cave");
                System.out.println("You are walking inside the cave");

                int y = 0;
                for (int z = 0; z <= y; z += 1) {

                    System.out.print("The cave comes to a fork, do you want to go right or left? [right/left]: ");

                    int w = 0;
                    for (int x = 0; x <= w; x += 1) {

                        int u = 0;
                        for (int v = 0; v <= u; v += 1) {

                            String rightOrLeft;
                            if (w == 1) {
                                rightOrLeft = "left";

                            } else if (u == 1) {
                                rightOrLeft = "right";

                            } else {
                                rightOrLeft = sc.next();

                            }
                            boolean goRight = rightOrLeft.equals("right");
                            boolean goLeft = rightOrLeft.equals("left");

                            if (goRight) {
                                System.out.println("You are walking down the tunnel to the right");
                                System.out.println("You see a light coming from far down the tunnel");

                                int s = 0;
                                for (int t = 0; t <= s; t += 1) {

                                    System.out.println("Do you want to go towards the light or away from it down the left " +
                                            "tunnel? [towards/left]: ");

                                    String towardsOrLeft = sc.next();
                                    boolean towards = towardsOrLeft.equals("towards");
                                    boolean left = towardsOrLeft.equals("left");

                                    if (towards) {
                                        System.out.println("It looks like a recently lit torch, there may be someone down here...");
                                        System.out.println("Game in progress. End game");

                                    } else if (left) {
                                        w += 1;

                                    } else {
                                        System.out.println("That isn't an option");
                                        s += 1;
                                    }

                                }

                            } else if (goLeft) {
                                System.out.println("You are walking down the tunnel to the left");
                                System.out.print("The tunnel leads to a dead end with some writing on the wall");
                                System.out.println("The words are smudged and hard to read");
                                System.out.println("There are some sharp rocks on the ground that would work well for hunting arrows");
                                System.out.println("\\\\Sharp rocks added to inventory\\\\");

                                int q = 0;
                                for (int r = 0; r <= q; r += 1) {

                                    System.out.print("Do you want to leave the cave and bring the sharp rocks home or go down the " +
                                            "tunnel to the right? [leave/right]: ");

                                    String leaveOrRight = sc.next();
                                    boolean leave = leaveOrRight.equals("leave");
                                    boolean right = leaveOrRight.equals("right");

                                    if (leave) {
                                        System.out.println("You walk out of the cave and head home");
                                        System.out.println("You reach your home and use some branches from your pile to make arrows");
                                        System.out.println("\\\\Sharp rocks removed from inventory\\\\");
                                        System.out.println("\\\\Arrows added to your inventory\\\\");
                                        b += 1;

                                    } else if (right) {
                                        u += 1;

                                    } else {
                                        q += 1;

                                    }

                                }

                            } else {
                                System.out.println("That isn't an option");
                                y += 1;
                            }

                        }

                    }

                }

            } else{
                System.out.println("That isn't an option");
                b += 1;
            }

        }

    }

}
