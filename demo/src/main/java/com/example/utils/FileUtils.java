package com.example.utils;

import java.io.*;

public class FileUtils {

    private static final String ENCODING = "UTF-8";//编码方式

    /**
     * 获取文件的行
     *
     * @param fileName
     *            文件名称
     * @return List<String>
     */
    public static String getContentByLine(String fileName) {
        StringBuffer lines = new StringBuffer();
        InputStreamReader read = null;
        BufferedReader bufferedReader = null;
        try {
            String configPath = FileUtils.class.getClassLoader().getResource(fileName).getPath();
            configPath = configPath.replaceAll("%20", " ");// 处理文件路径中空格问题
            File file = new File(configPath);
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                read = new InputStreamReader(new FileInputStream(file), ENCODING);
                bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                int lineIndex = 1;
                while ((lineTxt = bufferedReader.readLine()) != null) {

                    // 如果第二行是D开头就读进来
                    if(lineIndex == 2){
                        lines.append(lineTxt);
                    }
                    if (lineTxt == null || lineTxt.length() == 0) {
                        continue;
                    }
                    lineIndex ++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return lines.toString();
    }
}