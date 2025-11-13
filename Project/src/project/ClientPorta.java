package project;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientPorta
{
    public static void main(String[] args)
    {
        try
        {
            // collega il sensore al server
            Socket s = new Socket("127.0.0.1", 12345); // IP e porta del server
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            Scanner tastiera = new Scanner(System.in);
            }}