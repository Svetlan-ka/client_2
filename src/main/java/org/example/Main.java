package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        String host = "localhost";
        final int port = 8050;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String question1 = in.readLine();
            System.out.println(question1);
            out.println("Аня");

            String question2 = in.readLine();
            System.out.println(question2);
            out.println("12");

            String question3 = in.readLine();
            System.out.println(question3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}