package pet;

import java.util.Scanner;

// 在 idea 里断点调试，一步一步走
public class main {
    public static void main(String[] args) {
        manage st =new manage(100);
        int x=0;
        while(x<1)
        {
            System.out.println("1.查看库存\n" + "2.添加宠物\n" +
                    "3.出售宠物\n" + "4.查看盈利\n" + "5.销售记录\n" + "0.退出程序");
            Scanner sc =new Scanner(System.in);
            int choich;
            choich=sc.nextInt();
            switch (choich) {
                case 0:
                    break;
                case 1:
                    st.printf();
                    break;
                case 2:
                    st.add();
                    break;
                case 3:
                    st.sell();
                    break;
                case 4:
                    st.profitNote();
                    break;
                case 5:
                    st.note();
            }
            if(choich==0)
                break;
        }
    }
}
