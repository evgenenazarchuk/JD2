package by.it_academy.jd2;


public class Hello {
    private static by.it_academy.jd2.core.untils.CheckerUtils CheckerUtils;

    public static void main(String[] args){
        for (String arg : args){
            if(CheckerUtils.isAllLowerCase(arg)){
                System.out.println(arg);
            }
        }
    }
}