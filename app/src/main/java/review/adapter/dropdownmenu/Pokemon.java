package review.adapter.dropdownmenu;

import java.util.ArrayList;

public class Pokemon {
    private String name;
    private String type;
    private String image;
    private int baseExp;

    public Pokemon(String name, String type, String image, int baseExp) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.baseExp = baseExp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBaseExp() {
        return baseExp;
    }

    public void setBaseExp(int baseExp) {
        this.baseExp = baseExp;
    }


}
