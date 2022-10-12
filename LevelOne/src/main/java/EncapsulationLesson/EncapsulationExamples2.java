package EncapsulationLesson;

public class EncapsulationExamples2 {
    public static void main(String[] args) {
        EncapsulationExamples c = new EncapsulationExamples("Male");
        c.setName("Misha");
        c.setAge(22);
        c.setWeight(60);
        System.out.println("Name:" + c.getName() + " " + "Age:" + c.getAge() + " " + "Weight:" + c.getWeight());
    c.setWeight(-15);//даже при смене веса, данные все ровно защищены с помощью инкапсуляции!
        System.out.println("Weight changed:"+ c.getWeight());
    }
    // c помощью public get мы можем втдеть значение этих переменных!
    // с помощью set мы позволяем наделять эти переменные определенными значениями!которые регулируются внутри метода!
    // эти методы обычно называются Сеттеры и Геттеры;
    //public boolean isClever(){
    // return clever;                                             is == get; только для boolean;
    // инкапсуляция хорактеризуется private переменными и public методами get && set, которые нередко проверяют какие
    //либо условия;


    //ВАЖНО!!!!!Если return type - метода Get == mutable! то лучше возвращать его копию!!!
    // public StringBuilder getName(){
    // StringBuilder sb1 = new StringBuilder(name); - в данном случае это копия name;
    // return sb1;
}
