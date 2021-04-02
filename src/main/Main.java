package main;

import BuilderUtil.Builder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Builder builder = new Builder();
        while(true)
        builder.accessWebsite();
        //builder.buyer();
        //builder.seller();
    }
}
