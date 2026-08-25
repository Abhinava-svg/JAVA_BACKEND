record Alien(int id, String name) {
    public Alien(int id, String name){

        if(id==0)
            throw new IllegalArgumentException("id cannot be zero");
        this.id = id;
        this.name = name;
    }
}

public class recordMethod {
    public static void main(String[] args){

        Alien a1 = new Alien(1, "Navin");
        Alien a2 = new Alien(1, "Navin");
        System.out.println(a1.name());

        System.out.println(a1.equals(a2));
        System.out.println(a1);
    }
}
