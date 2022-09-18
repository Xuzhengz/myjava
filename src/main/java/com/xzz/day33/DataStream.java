package com.xzz.day33;

import org.junit.Test;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 徐正洲
 * @date 2022/6/9-20:02
 *  数据流：用于读取或写出基本数据类型的变量或者字符串
 *
 */
public class DataStream {
    @Test
    public void test() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src\\main\\resources\\69.txt"));

        dataOutputStream.writeUTF("徐正洲");
        dataOutputStream.flush();
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}