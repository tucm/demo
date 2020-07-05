package com.test.tucm.base.compress;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * @ClassName ZCompress
 * @Description TODO
 * @Author owl
 * @Date 2020-07-05 16:41
 * @Version 1.0
 **/
public class ZCompress {

    /**
     * @param sources 要打包的原文件数组
     * @param target  打包后的文件
     * @return File    返回打包后的文件
     * @throws
     * @Title: pack
     * @Description: 将一组文件打成tar包
     */
    public static File pack(File[] sources, File target) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(target);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        TarArchiveOutputStream os = new TarArchiveOutputStream(out);
        for (File file : sources) {
            try {
                // new TarArchiveEntry()
                os.putArchiveEntry(new TarArchiveEntry(file, file.getName()));
                IOUtils.copy(new FileInputStream(file), os);
                os.closeArchiveEntry();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (os != null) {
            try {
                os.flush();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return target;
    }

    /**
     * @param source 需要压缩的文件
     * @return File    返回压缩后的文件
     * @throws
     * @Title: compress
     * @Description: 将文件用gzip压缩
     */
    public static File compress(File source) {
        File target = new File(source.getAbsolutePath() + ".z");
        FileInputStream in = null;
        GZIPOutputStream out = null;
        try {
            in = new FileInputStream(source);
            out = new GZIPOutputStream(new FileOutputStream(target));
            byte[] array = new byte[1024];
            int number = -1;
            while ((number = in.read(array, 0, array.length)) != -1) {
                out.write(array, 0, number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        File[] sources = new File[]{new File("/Users/owl/test/1.txt"), new File("/Users/owl/test/2.txt")};
        File target = new File("/Users/owl/test/release_package.tar");
        compress(pack(sources, target));
    }
}
