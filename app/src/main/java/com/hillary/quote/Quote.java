package com.hillary.quote;

import java.util.concurrent.ThreadLocalRandom;

public class Quote {
    String[] getQuoteList(){

        String[] quotes=new String[]{
                "\"Chewie, we're home.\" - Star Wars Episode VII: The Force Awakens",
                "\"It was Beauty killed the Beast.\" - King Kong",
                "\"They call it a Royale with cheese.\" - Pulp Fiction",
                "\"Magic Mirror on the wall, who is the fairest one of all?\" - Snow White and the Seven Dwarves",
                "\"Just when I thought I was out, they pull me back in.\" - The Godfather: Part III",
                "\"I don't want to survive. I want to live.\" - 12 Years a Slave",
                "\"Help me, Obi-Wan Kenobi. You're my only hope.\" - Star Wars Episode IV: A New Hope",
                "\"Hasta la vista, baby.\" - Terminator 2: Judgment Day",
                "\"I'm having an old friend for dinner.\" - The Silence of the Lambs",
                "\"Just keep swimming.\" - Finding Nemo",
                "\"I'm the king of the world!\" - Titanic",
                "\"Shaken, not stirred.\" - Goldfinger",
                "\"Keep your friends close, but your enemies closer.\" - The Godfather: Part II",
                "\"The greatest trick the devil ever pulled was convincing the world he didn't exist.\" - The Usual Suspects",
                "\"Roads? Where we're going we don't need roads.\" - Back to the Future",
                "\"I love the smell of napalm in the morning.\" - Apocalypse Now",
                "\"Say hello to my little friend!\" - Scarface",
                "\"I am serious. And don't call me Shirley.\" - Airplane",
                "\"Here's Johnny!\" - The Shining",
                "\"To infinity and beyond!\" - Toy Story",
                "\"I see dead people.\" - The Sixth Sense",
                "\"Why so serious?\" - The Dark Knight",
                "\"The first rule of Fight Club is: You do not talk about Fight Club.\" - Fight Club",
                "\"You're gonna need a bigger boat.\" - Jaws",
                "\"Frankly, my dear, I don't give a damn.\" - Gone With the Wind"
        };
        return quotes;
    }

    String getRandomQuotes(){
        String quote;
        int quotesArrayLen = getQuoteList().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote = getQuoteList()[randomNum];
        return quote;
    }
}
