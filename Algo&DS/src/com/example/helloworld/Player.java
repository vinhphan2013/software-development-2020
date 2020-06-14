package com.example.helloworld;

public class Player {
    public String fn;
    public String ln;
    public int number;

    public Player(String fn, String ln, int number) {
        this.fn = fn;
        this.ln = ln;
        this.number = number;
    }

    public String toString() {
        return ln + " ," + fn;
    }
}
