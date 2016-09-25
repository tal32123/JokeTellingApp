package com.example;
/*
    Credit to: http://www.funny.com/cgi-bin/WebObjects/Funny.woa/wa/funny?fn=CI3NJ
    for the jokes.
 */
public class OtherJokeClass {
    int jokeArrayCount = 0;

    final String[] OTHER_JOKE_ARRAY = new String[]{
            "Q.Whats the difference between a tractor and a giraffe? A.One has hydraulics the other has highbollocks.",
        "Q. What kind of band doesn't play music? A. A highbred.",
        "Q. If one is single and two is a couple and three is a crowd, what is four and five? A. 9 (5+4)",
        "Q. What do you get when you cross a parrot and a lion? A. I don't know, but when it talks you'd better listen.",
        "Q. Why do giraffes have long necks? A. Because they have smelly feet.",
        "Q. Why did the orange use suntan lotion? A. He started to peel.",
        "Q. Where does an elephant go when he wants to lie down? A. Anywhere he pleases.",
        "Q. What did the big chimney say to the little chimney? A. \"You are too young to smoke.\"",
        "Q. What did the fish say to the seashores? A. \"Can I ride on you seashorse?\"",
        "Q. Why did Cinderella get kicked off the baseball team? A. Because she ran away from the ball.",
        "Q. A man went to play golf for the day. He took his golf clubs and two pairs of pants. What were the extra pants for? A. In case he got a hole-in-one.",
        "Q. Why didn't the skeleton cross the road? A. Because it had no guts.",
        "Q. I have 3 heads, 5 legs, 7 arms and 444 fingers. What am I? A. A liar.",
        "Q. What do you get when you cross an elephant with a kangaroo? A. Holes all over Australia.",
        "Q. What goes ha, ha plonk? A. Someone laughing their head off.",
        "Q. What do you get when you cross a duck with cheese? A. Cheese and quackers.",
        "Q. What monster sits on the end of your finger? A. The bogie man.",
        "Q. What did the computer screen say to the keyboard after it went for a ride? A. That was a harddrive.",
        "Q. What is a pirate's favourite letter? A. R(Arrrrrggggh)",
        "Q. Why did the cow jump over the moon? A. Because the farmer had cold hands.",
        "Q. How do you make a tissue dance? A. Put a little boogie in it.",
        "Q: How do you get a man to stop biting his nails? A: Make him wear shoes.",
        "Q: Why do chicken coops have two doors? A: Because if it had four doors it's be a chicken sedan.",
        "Q: What is the difference between a tick and a lawyer? A: A tick falls off you when you die.",
        "Q: What's the definition of mixed emotions? A: When you see your mother-in-law backing off a cliff in your new car.",
        "Q: What do call a lawyer with an IQ of 50? A: Your Honor.",
        "Q: How do you know if a restaurant has a clown as a chef? A: When the food tastes funny",
        };
        public String getJoke(){

            String joke;
            if(jokeArrayCount < OTHER_JOKE_ARRAY.length){
                joke = OTHER_JOKE_ARRAY[jokeArrayCount];
                jokeArrayCount++;
            }
            else{
                jokeArrayCount = 0;
                joke = OTHER_JOKE_ARRAY[jokeArrayCount];
            }

            return joke;
        }
        }
