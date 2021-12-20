package pet;

// 先阅读一下 Java命名规范（每个语言都有自己的命名规范，大部分是类似的）
// https://cloud.tencent.com/developer/article/1584463
// "单词首字母大写"，dog 应该为 Dog；pets 应该为单数 Pet
public class dog extends pets{
    public dog(String color, int age, String sex) {
        super(color, age, sex);
    }

    public dog() {

    }

}
