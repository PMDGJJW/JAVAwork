package text1;

import java.io.File;

public class Text {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\PMDGJJW\\Desktop\\123.md");
        System.out.println("文件名称"+file.getName());
        System.out.println("文件绝对路径名"+file.getAbsolutePath());
        System.out.println("文件绝对路径名"+file.getPath());
        System.out.println("文件绝对路径名"+file.length());
        System.out.println("文件是否存在"+file.exists());
        System.out.println("文件是否是目录"+file.isDirectory());
        System.out.println("文件是否是文件"+file.isFile());
    }

}
