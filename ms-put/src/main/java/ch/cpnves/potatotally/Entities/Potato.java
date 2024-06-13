package ch.cpnves.potatotally.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Potato {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String usage;

    public Potato(){}

    public Potato(String name, String usage){
        this.setName(name);
        this.setUsage(usage);
    }

    public Long getID(){
        return this.id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUsage(){
        return this.usage;
    }

    public void setUsage(String usage){
        this.usage = usage;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Potato potato))
            return false;
        return Objects.equals(this.id, potato.id) && Objects.equals(this.name, potato.name)
                && Objects.equals(this.usage, potato.usage);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.usage);
    }

    @Override
    public String toString(){
        return "Potato{" + "id=" + this.getID() + ", name='" + this.getName() + '\'' + ", usage='" + this.getUsage() + '\'' + '}';
    }
}
