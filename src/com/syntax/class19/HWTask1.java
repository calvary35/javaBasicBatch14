package com.syntax.class19;

public class HWTask1 {

        int beats;
        String instrument;
        String band;
        int recordsSold;
        String singer;

        HWTask1(String instrument, int beats, String band) {
            this.instrument = instrument;
            this.beats = beats;
            this.band = band;
        }
    }

    class Song extends HWTask1 {


        Song(String instrument, int beats, String band, String singer) {
            super(instrument, beats, band);
            this.singer = singer;
        }
    }

    class hits extends Song {

        hits(String instrument, int beats, String band, String singer, int recordsSold) {
            super(instrument, beats, band, singer);
            this.recordsSold = recordsSold;
        }

        void facts() {
            System.out.println("The main instrument is " + instrument + " the song has " + beats + " per minute " +
                    "the band name is " + band + " and the lead singer is " + singer +
                    " and they have sold " + recordsSold + " records ");

        }

    }


     class test{


        public static void main(String[] args) {
            hits task = new hits("bass guitar", 110, "Jungle", "TJ", 345789);
            task.facts();

        }
    }

