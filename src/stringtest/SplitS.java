package stringtest;

public class SplitS {
    public static void main(String[] args) {
        String str="www-baidu-com";
        String[] temp;
        String D="-";
        temp=str.split(D);
        System.out.println(temp);
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

        String str2="www.baidu.com";
        String[] temp2;
        String de="\\.";
        temp2=str2.split(de);
        for (int i=0;i<temp2.length;i++){
            System.out.println(temp2[i]);
        }
    }
}
