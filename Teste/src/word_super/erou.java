package word_super;

public class erou extends persoana {
    String putere;
    erou(String name,int age,String putere){
        super(name,age);
        this.putere=putere;

    }
    public static void main(String[] args) {

    }
    public String toString(){

        return super.toString() + this.putere;
    }

}
