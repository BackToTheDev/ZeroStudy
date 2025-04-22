//BE 36_권준성
package week2.test;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args){
        File source = new File("stream.txt");
        File target = new File("copy_stream.txt");

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.flush();
            System.out.println("파일 복사가 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 중 오류 발생: " + e.getMessage());
        }


    }
}
