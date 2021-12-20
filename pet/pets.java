package pet;

public class pets {
    private String color;  //颜色
    private int age;  //年龄
    private String sex; //性别
    private double inPrice;  //进货价格
    private double outPrice;  //销售价格


    public pets(String color, int age, String sex) {
        this.color = color;
        this.age = age;
        this.sex = sex;
    }
    public pets(){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getInPrice() {
        return inPrice;
    }

    public void setInPrice(double inPrice) {
        this.inPrice = inPrice;
    }

    public double getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(double outPrice) {
        this.outPrice = outPrice;
    }

}