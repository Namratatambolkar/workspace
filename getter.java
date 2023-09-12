class employee {
    private String name;
    private int id;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

}

public class getter {
    public static void main(String args[]) {
        employee e1 = new employee();
        e1.setName("NAMU");
        System.out.println(e1.getName());
        e1.setId(24);
        System.out.println(e1.getId());
    }
}
