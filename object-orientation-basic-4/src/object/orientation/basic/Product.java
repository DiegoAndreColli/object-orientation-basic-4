package object.orientation.basic;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Product {

    private String name;

    public Product(String name, Double value) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name))
            return false;
        return true;
    }

}
