package pet;
import java.util.Scanner;
import java.util.Date;
public class manage {
    Scanner input = new Scanner(System.in);
    private String name;
    private cat[] cats;
    private dog[] dogs;
    private pets[] pet;

    private int dogFoot = 0; // 狗的当前长度
    private int catFoot = 0; //猫的当前长度
    private int petFoot = 0;

    private int num = 0;  //库存数量
    private int inNum = 0;  //进货数量
    private int outNum = 0;  //销售数量

    public manage(int len) {
        if (len > 0) {
            this.cats = new cat[len]; // 开辟数组大小
            this.dogs = new dog[len];
            this.pet = new pets[len];
        } else {
            this.dogs = new dog[1]; // 至少开辟一个空间
            this.cats = new cat[1];
            this.pet = new pets[1];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() { // 添加的是一个宠物
        System.out.println("您添加的是狗还是猫？\n" + "1.狗    2.猫");
        String choice = input.next();
        if (choice.equals("1")) {
            dog D = new dog();

            System.out.println("请输入您要添加的宠物的信息");
            System.out.print("颜色：");
            D.setColor(input.next());
            System.out.print("年龄：");
            D.setAge(input.nextInt());
            System.out.print("性别：");
            D.setSex(input.next());
            System.out.print("进货价格：");
            D.setInPrice(input.nextDouble());
            System.out.print("出售价格：");
            D.setOutPrice(input.nextDouble());

            if (dogFoot < dogs.length) {
                dogs[dogFoot] = D;
                dogFoot++;
                System.out.println("添加成功！");
                inNum++;
                num++;
            } else {
                System.out.println("添加失败！");
            }
        } else if (choice.equals("2")) {
            if (catFoot < cats.length) {
                cat C = new cat();

                System.out.println("请输入您要添加的宠物的信息");
                System.out.print("颜色：");
                C.setColor(input.next());
                System.out.print("年龄：");
                C.setAge(input.nextInt());
                System.out.print("性别：");
                C.setSex(input.next());
                System.out.print("进货价格：");
                C.setInPrice(input.nextDouble());
                System.out.print("出售价格：");
                C.setOutPrice(input.nextDouble());

                if (catFoot < cats.length) {
                    cats[catFoot] = C;
                    catFoot++;
                    System.out.println("添加成功！");
                    inNum++;
                    num++;
                } else {
                    System.out.println("添加失败！");
                }
            } else {
                System.out.println("没有这个选项，请重新输入!");
            }
        }
    }
    public void printf(){
        System.out.println("=====宠物店清单=====");
        System.out.println("颜色  年龄  性别  进口价  出口价");
        System.out.println("=====宠物猫清单=====");
        for (int i = 0; i < cats.length; i++) {
            if (cats[i] != null) {
                System.out.println(cats[i].getColor() + "\t" + cats[i].getAge() + "\t" + cats[i].getSex() +
                        "\t" + cats[i].getInPrice() + "\t" + cats[i].getOutPrice());
            }
        }
        System.out.println("=====宠物狗清单=====");
        for (int i = 0; i < dogs.length; i++) {
            // 应该是 dogs[i]
            // if (cats[i] != null) {
            //     System.out.println(dogs[i].getColor() + "\t" + dogs[i].getAge() + "\t" + dogs[i].getSex() +
            //             "\t" + dogs[i].getInPrice() + "\t" + dogs[i].getOutPrice());
            // }
            // 不要有重复的代码 dogs[i]，另外创建一个变量
            dog dog = dogs[i];
            if (dog != null) {
                System.out.println(dog.getColor() + "\t" + dog.getAge() + "\t" + dog.getSex() +
                        "\t" + dog.getInPrice() + "\t" + dog.getOutPrice());
            }
        }
    } public void sell() {
        if(num == 0) {
            System.out.println("库存为零\n");
        }
        else {
            System.out.println("您要出售的是猫还是狗？\n" + "1.猫 2.狗");
            String choice = input.next();
            if(choice.equals("1")) {
                System.out.println("请输入您要出售的猫的特征");
                System.out.print("颜色：");
                String color1 = input.next();
                System.out.print("年龄：");
                int age1 = input.nextInt();
                System.out.print("性别：");
                String sex1 = input.next();
                int i,j=catFoot;
                for ( i = 0; i < catFoot; i++) {
                    if (color1.equals(cats[i].getColor()) && age1 == cats[i].getAge() && sex1.equals(cats[i].getSex())) {
                        j = i;
                        break;
                    }
                }
                if (i == catFoot) {
                    System.out.println("没有该猫");
                }
                else {
                    pet[petFoot] = cats[i];
                    petFoot++;
                    for (int m = j; m < catFoot; m++) {
                        cats[m] = cats[m + 1];
                    }
                    System.out.println("售出成功！\n");
                    catFoot -= 1;
                    outNum++;
                    num--;
                }
            }
            if(choice.equals("2")) {
                System.out.println("请输入您要出售的狗的特征");
                System.out.print("颜色：");
                String color1 = input.next();
                System.out.print("年龄：");
                int age1 = input.nextInt();
                System.out.print("性别：");
                String sex1 = input.next();
                int i,j=dogFoot;
                for ( i = 0; i < dogFoot; i++) {
                    if (color1.equals(dogs[i].getColor()) && age1 == dogs[i].getAge() && sex1.equals(dogs[i].getSex())) {
                        j = i;
                        break;
                    }
                }if (i == dogFoot) {
                    System.out.println("没有该猫");
                }
                else {
                    pet[petFoot] = dogs[i];
                    petFoot++;
                    for (int m = j; m < catFoot; m++) {
                        dogs[m] = dogs[m + 1];
                    }
                    System.out.println("售出成功！\n");
                    catFoot -= 1;
                    outNum++;
                    num--;
                }
            }
        }
    }
    public void note(){
        System.out.println("商店销售记录清单");
        System.out.println("颜色  年龄  性别  进口价  出口价");
        for (int i = 0; i < petFoot; i++) {
            System.out.println(pet[i].getColor() + "\t" + pet[i].getAge() + "\t" + pet[i].getSex() + "\t" + pet[i].getInPrice() + "\t" + pet[i].getOutPrice());
        }
    }
    public void profitNote(){
        System.out.println("店铺盈利情况");
        double cost=0,inprice=0,outprice=0;
        for (int i = 0; i < petFoot; i++) {
            inprice=inprice+pet[i].getInPrice();
            outprice=outprice+pet[i].getOutPrice();
        }
        cost=outprice-inprice;
        System.out.println("总进口金额:"+inprice+"  总销售金额:"+outprice+"   总利润:"+cost);
        System.out.println("库存数量:"+num+" 进货数量:"+inNum+ "销售数量:"+outNum);
    }
}