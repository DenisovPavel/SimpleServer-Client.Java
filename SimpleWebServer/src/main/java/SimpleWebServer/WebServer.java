package SimpleWebServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8088);) { // создал сервер сокет;
            while (true) { // бесконечный цикл для того чтобы все время было соединение и не проподало
                Socket socket = serverSocket.accept();// экземпляр розетки содержащий метод подключения;
                System.out.println();// для удобства читабельности
                System.out.println("New Client ready to communicate!");
                System.out.println();// для удобства читабельности

                BufferedReader input = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter output = new PrintWriter(socket.getOutputStream());


                while (!input.ready()) ;
                while (input.ready()) {
                    System.out.println(input.readLine());
                }
                output.println("HTTP/1.1 200 OK");
                output.println("Content-Type:text/html; charset=utf-8");
                output.println();
                output.println("<h1> Hello from Server! </h1>");
                output.flush();// метод немедленной отправки.

            input.close();//чтобы закрывались
            output.close();// по окончанию обработки всех запросов
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
