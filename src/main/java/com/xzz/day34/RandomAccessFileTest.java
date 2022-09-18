package com.xzz.day34;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 徐正洲
 * @date 2022/6/11-16:20
 */
public class RandomAccessFileTest {
    /**
     * 随机存取文件流：直接继承于Object，既可以输入也可以输出。
     * 1）写文件：重新覆盖
     * 2）实现DataInput、DataOutput接口，造两个对象，用于输入输出
     * 3）需要选择模式：r 只读，rw 读写， rwd 读写，同步数据，rws 读写，同步数据元数据更新。
     * 4）会对原有文件内容从头开始覆盖
     */

    @Test
    public void test(){
        RandomAccessFile randomAccessFileInput = null;
        RandomAccessFile randomAccessFileOutput = null;
        try {
            randomAccessFileInput = new RandomAccessFile(new File("src\\main\\resources\\01.png"),"r");
            randomAccessFileOutput = new RandomAccessFile(new File("src\\main\\resources\\02.png"),"rw");

            byte[] bytes = new byte[1024];
            int len;
            while ((len = randomAccessFileInput.read(bytes))!=-1){
                randomAccessFileOutput.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFileInput!=null){
                try {
                    randomAccessFileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (randomAccessFileOutput!=null){
                try {
                    randomAccessFileOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 文本数据覆盖
     */
    @Test
    public void test2() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src\\main\\resources\\ocean.txt","rw");
        randomAccessFile.seek(4);
        randomAccessFile.write("xzz".getBytes());
        randomAccessFile.close();
    }
}