package com.abb.demo.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Create by jomplte on 2017/06/12/012
 * Email: 1955139298@qq.com
 */
public class CloseHelper {

    public static void close(Closeable closeable){
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
