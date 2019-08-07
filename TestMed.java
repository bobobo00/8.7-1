package day01;

import java.util.Scanner;

/**
 * @ClassName TestMed
 * @Description 一只老鼠喝药后有两种状态（死（1），活（0）），有10只老鼠就可以表示1024个状态。将药的编号表示为2进制，（9:1001）
 * 若最后死掉的是第三、六、七只老鼠（0001100100:200）即表示第200瓶药有毒：
 * 第一个老鼠喝药瓶编号二进制表示后所有编号的第一位为1的药，第一个老鼠喝所有编号第二位为1的药，依次类推。
 * 最后死的老鼠即代表该位编码为1的药有问题，10只老鼠最后可检查出哪一瓶药有毒。
 * @Auther danni
 * @Date 2019/7/31 16:05]
 * @Version 1.0
 **/

public class TestMed {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bottle,tester;
        System.out.println("请分别输入药的瓶数和实验者数：");
        bottle=scanner.nextInt();
        tester=scanner.nextInt();
        if(Math.pow(2,tester)<bottle){
            System.err.println("实验者数不足,无法检测");
            return;
        }
        System.out.println("请输入死亡实验者数目");
        int num=scanner.nextInt();
        int[] person=new int[num];
        System.out.println("请输入死亡实验者编号（编号从1到"+tester+")");
        for (int i = 0; i <num ; i++) {
           person[i]=scanner.nextInt();
        }
        int[] result=new int[10];
        int temp=0;
        for (int i = 0; i <person.length ; i++) {
            result[person[i]]=1;
        }
        for (int i = 0; i <result.length ; i++) {
            if(result[i]==1){
                temp+=Math.pow(2,i);
            }
        }
        System.out.println("瓶号为"+temp+"的药有毒");


    }
}
