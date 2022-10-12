package EncapsulationLesson;

// Сокрытие данных, защита их от внешнего
// нежелательного вмешательства, помещение их в
// в "капсулу";
public class EncapsulationExamples {
    //Человек
    final String pol;

    EncapsulationExamples(String pol) {
        this.pol = pol;
    }

    private String name;

    public String getName() { // создали метод который передает имя из капсуляции public + datatype + get+nameofdatatype;
        return name;
    }

    public void setName(String s) { // создали метод который позволяет назначить имя(изменить)public+void+set+Name(datatype+new name)
        name = s;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {//если возвраст > 0 , то он изменится если возраст < 0, то он останется прежним!
            age = i;
        }
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int w) {
        if (w > 0) {
            weight = w;
        }
    }
}

