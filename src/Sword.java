public class Sword<T extends Metal>{
    private T material;

    public Sword(T mtl)
    {
        material = mtl;
    }

    public int checkEndurance()
    {
        return material.getEndurance();
    }
}
