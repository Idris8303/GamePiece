public class GamePiece {

    private Integer positionX;
    private Integer positionY;
    private Boolean frozen;
    private String  color;
    private String name;

    public GamePiece(Integer positionX, Integer positionY, Boolean frozen, String color, String name){
        this.positionX = positionX;
        this.positionY = positionY;
        this.frozen = frozen;
        this.color = color;
        this.name = name;

}

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public Boolean getfrozen() {
        return frozen;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}



