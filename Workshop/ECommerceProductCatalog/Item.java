import java.util.UUID;

public abstract class Item {
    protected final UUID id;
    protected String name;
    protected String category;
    protected int price;

    Item(String name, String category, int price){
        this.id=UUID.randomUUID();
        this.name=name;
        this.category=category;
        this.price=price;
    }

    String generateId(){
        StringBuilder sb = new StringBuilder();
        String chars="abcdefghijklmnopqrstuvwxyz1234567890";
        for(int i=0;i<10;++i){
            int idx=(int)(Math.random()*36);
            sb.append(String.valueOf(chars.charAt(idx)));
        }
        return sb.toString();
    }

    @Override
    public String toString(){
        return this.id+"\n"+this.name+"\n"+this.category+"\n"+this.price;
    }

    protected void setPrice(int price) {
        if(price>=0) this.price = price;
        else System.out.println("Invalid Price");
    }

}
