/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 23 - Troubleshooting Car Issues

An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to perform a task that a human expert might do. Many websites are available that will help you self-diagnose a medical issue by answering a series of questions. And many hardware and software companies offer online troubleshooting tools to help people solve simple technical issues before calling a human.

Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build the system:

@startuml
if (Is the car silent when you turn the key?) then (yes)
if (Are the battery terminals corroded?) then (yes)
:Clean terminals and try starting again.;
stop
else (no)
:Replace cables and try again.;
stop
endif
else (no)
if (Does the car make a slicking noise?) then (yes)
:Replace the battery.;
stop
else (no)
if (Does the car crank up but fail to start?) then (yes)
:Check spark plug connections.;
stop
else (no)
if (Does the engine start and then die?) then (yes)
if (Does you car have fuel injection?) then (yes)
:Get it in for service.;
stop
else (no)
:Check to ensure the choke is opening and closing.;
stop
endif
else (no)
:This should not be possible.;
stop
endif
endif
endif
endif
@enduml

Example Output

Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.

Constraint

Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.

Challenge

Investigate rules engines and inference engines. These are powerful ways to solve complex problems that are based on rules and facts. Identify a rules engine for your programming language and use it to solve this problem

 */
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String silent = in.nextLine();
        if (silent.equals("yes")){
            System.out.print("Are the battery terminals corroded? ");
            String terminals = in.nextLine();
            if (terminals.equals("yes")){
                System.out.print("Clean terminals and try starting again");
            }
            else if (terminals.equals("no")){
                System.out.print("Replace cables and try again");
            }

        }else if (silent.equals("no")){
            System.out.print("Does the car make a slicking noise?");
            String slicking = in.nextLine();
            if (slicking.equals("yes")){
                System.out.print("Replace the battery.");
            }
            else if (slicking.equals("no")){
                System.out.print("Does the car crank up but fail to start?");
                String fail = in.nextLine();
                if (fail.equals("yes")){
                    System.out.print("Check spark plug connections.");
                }
                else if (fail.equals("no")){
                    System.out.print("Does the engine start and then die?");
                    String die = in.nextLine();
                    if (die.equals("yes")){
                        System.out.print("Does you car have fuel injection?");
                        String fuel = in.nextLine();
                        if (fuel.equals("yes")){
                            System.out.print("Get it in for service.");

                        }
                        else if (fuel.equals("no"));{
                            System.out.print("Check to ensure the choke is opening and closing");
                        }

                    }else if (die.equals("no")){
                        System.out.print("This should not be possible.");

                    }
                }

            }

        }
    }
}
