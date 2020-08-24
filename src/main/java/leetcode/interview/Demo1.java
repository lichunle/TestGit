package leetcode.interview;

public class Demo1 {

    /**
     * 判定字符是否唯一
     * @param astr
     * @return
     */
    public static boolean isUnique(String astr) {
        boolean isFlag = true;

        for(int i = 0;i < astr.length();i++) {
            String subStr = astr.substring(i+1,astr.length());

            if(subStr.indexOf(astr.charAt(i)) >= 0) {
                isFlag = false;
                break;
            }
        }
        return isFlag;
    }

    public static void main(String[] args) {

    }
}
