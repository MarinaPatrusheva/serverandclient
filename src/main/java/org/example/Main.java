package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        try(Socket socketClient = new Socket(config.localhost, config.port)){
            PrintWriter out = new PrintWriter(socketClient.getOutputStream(), true);
            out.println("Тестовый текст");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}