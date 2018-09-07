package org.aram;

import java.io.*;
import java.net.Socket;

public class Client1 {

    public static void main(String[] args) throws Exception{


        Socket socket = new Socket("10.10.10.91",7777);
        System.out.println(socket);

        InputStream in = socket.getInputStream();
        DataInputStream din = new DataInputStream(in);
//        OutputStream out = socket.getOutputStream();



//        byte[] buffer = new byte[1024*8];

        while (true){
            try {
                String str = din.readUTF();
//                if (count == -1) {
//                    break;
//                }
//                out.writeUTF(str);
                System.out.println(str);

            }
            catch (Exception e){

            }
        }


    }


}
