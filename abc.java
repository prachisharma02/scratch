class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class lenses {
    private String brandname ;
    private String color;

    public lenses(String brandname, String color) {
        this.brandname = brandname;
        this.color = color;
    }

    public String getBrand() {
        return brandname;
    }

    public String getColor() {
        return color;
    }
}

 class Main {
    public static void main(String[] args) {
        
        Person tarun = new Person("Tarun");

        
        lenses lens = new lenses("Lenskart", "Black");

        System.out.println(tarun.getName() + " has a " + lens.getColor() + " " + lens.getBrand() + " eyeglass.");
    }
}
