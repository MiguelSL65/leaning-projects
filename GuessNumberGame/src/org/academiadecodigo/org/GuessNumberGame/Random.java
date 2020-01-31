package org.academiadecodigo.org.GuessNumberGame;

public class Random {

        public static int getRandom (int max) {
                return getRandom(0, max);
        }

        public static int getRandom(int min, int max) {
            return (int) (Math.random() * (max - min + 1) + min);
        }
}
