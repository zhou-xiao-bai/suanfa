package com.xiaobai.t3;

/**
 * @author 江湖人称白玉汤
 * @program 剑指Offer
 * @description 替换字符串中的空格为'%20'
 * @create 2020-04-29 17:40
 **/
public class ReplaceBlank {

    public static void main(String[] args) throws Exception {
        String target = "we are family";
        System.out.println(replaceBlank(target));
    }

    /**
     * 采用java提供的StringBuffer来实现快速添加字符以及替换字符，
     *      若采用数组的方式，可遍历得到空格数，然后根据原字符传长度和空格数得到结果字符数组的长度，然后遍历替换，两个指针相互移动
     * @param target
     * @return
     * @throws Exception
     */
    public static String replaceBlank(String target) throws Exception {
        if (target==null || target.length()<=0) throw new Exception("字符串不合法");
        StringBuffer result = new StringBuffer();
        char[] tmp = target.toCharArray();
        for (char c : tmp) {
            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
