package org.aram;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

    public static void main(String[] args) throws Exception{

        BokbulBok bokbulBok = new BokbulBok();
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println(serverSocket);


        while(true){
            try {

                String msg = bokbulBok.selectOne();
                Socket client = serverSocket.accept();
                System.out.println(client);
                OutputStream out = client.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

//                InputStream in = new ByteArrayInputStream(bokbulBok.selectOne().getBytes());
                dos.writeUTF(msg);

//                byte[] buffer = new byte[1024*8];

//                while(true){
//                    int count = in.read();
//                    System.out.println("count :" + count);
//                    if (count == -1){
//                        break;
//                    }
//                    dos.writeUTF();
//                }
                if(msg == null){
                    break;
                }
                dos.flush();
                out.close();
            }catch (Exception e){
                break;

            }

        }

    }
}
