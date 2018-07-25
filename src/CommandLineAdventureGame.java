import java.util.Scanner;

public class CommandLineAdventureGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Desolation Adventure Game

        System.out.println("Desolation Adventure Game started...");
        System.out.println(" ");
        System.out.println("The year is 2176. The world as you know it is gone. The world had plummeted in a nuclear " +
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
                    System.out.print("Do you want to go up the mountain or down the mountain? [up/down]: ");
                int d = 0;
                for (int c = 0; c <= d; c += 1) {
                    String upOrDown;
                    if (d == 1) {
                        upOrDown = "up";
                    } else {
                        upOrDown = sc.next();
                    }
                    boolean goUp = upOrDown.equals("up");
                    boolean goDown = upOrDown.equals("down");

                    if (goUp) {
                        System.out.println("You start walking up the mountain");
                        System.out.print("You chop down some wood for the fire \n" +
                                "\\\\Wood added to inventory\\\\ \n" +
                                "You get to the top and see some smoke off in the distance... \n");
                        int h = 0;
                        for (int g = 0; g <= h; g += 1) {
                            System.out.print("Do you want to go checkout the smoke or bring wood home? [checkout/home]: ");
                            String checkoutOrHome = sc.next();
                            boolean checkoutSmoke = checkoutOrHome.equals("checkout");
                            boolean goHomeWithWood = checkoutOrHome.equals("home");

                            if (checkoutSmoke) {
                                System.out.println("Work in progress. End game");
                            } else if (goHomeWithWood) {
                                System.out.print("You start walking down the mountain \n" +
                                "You make it home and add the wood to the pile \n" +
                                "\\\\Wood removed from inventory\\\\ \n" +
                                "You have completed your task. End game");
                            } else {
                                h += 1;
                            }
                        }
                    } else if (goDown) {
                        System.out.println("You start walking down the mountain");
                        System.out.println("You find water at the bottom of the mountain \n" +
                        "\\\\Water added to inventory\\\\");
                        int j = 0;
                        for (int i = 0; i <= j; i += 1) {
                            System.out.print("Do you want to go up the mountain or home? [up/home]: ");
                            String upOrHome = sc.next();
                            boolean goUpMountain = upOrHome.equals("up");
                            boolean goHome = upOrHome.equals("home");

                            if (goUpMountain) {
                                d += 1;
                            } else if (goHome) {
                                System.out.println("You start walking home \n" +
                                "You make it home and fill up your reservoir with water \n" +
                                "\\\\Water removed from inventory\\\\ \n" +
                                "You have completed your task. End Game");
                            } else {
                                System.out.println("That isn't and option");
                                j += 1;
                            }
                        }
                    } else {
                        System.out.println("That isn't and option");
                        b += 1;
                    }
                }
            } else if (exploreCave) {
                System.out.println("You walk to the cave \nYou are walking inside the cave");
                int f = 0;
                for (int e = 0; e <= f; e += 1) {
                    System.out.print("The cave comes to a fork, do you want to go right or left? [right/left]: ");
                    String rightOrLeft = sc.next();
                    boolean goRight = rightOrLeft.equals("right");
                    boolean goLeft = rightOrLeft.equals("left");

                    if (goRight) {
                        System.out.println("You are walking down the tunnel to the right");
                        System.out.println("You see a light coming from far down the tunnel");
                        System.out.println("Do you want to go towards the light or away from it down the left tunnel? [towards/left]: ");
                        int l = 0;
                        for (int k = 0; k <= l; k += 1) {
                            String towardsOrLeft = sc.next();
                            boolean towards = towardsOrLeft.equals("towards");
                            boolean left = towardsOrLeft.equals("left");

                            if (towards) {

                            } else if (left) {

                            } else {

                            }
                        }
                    } else if (goLeft) {
                        System.out.println("You are walking down the tunnel to the left");
                        System.out.print("The tunnel leads to a dead end \n" +
                                "Do you want to leave the cave or go down the right tunnel? [leave/right]: ");
                    } else {
                        System.out.println("That isn't an option");
                        f += 1;
                    }
                }
            } else {
                System.out.println("That isn't an option");
                b += 1;
            }

        }

    }

}
