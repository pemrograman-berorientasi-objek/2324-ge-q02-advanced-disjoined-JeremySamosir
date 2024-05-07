package academic.model;

public class Human {
    protected String id;
    protected String name;

public Human() {
}

    public Human(String _id, String _name) {
        this.id = _id;
        this.name = _name;


    }
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}  