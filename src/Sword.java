public class Sword<T extends Metal>{
    private T material;

    public Sword(T mtl)
    {
        material = mtl;
    }

    public boolean checkEndurance()
    {
        return material.getEndurance() > 49;
    }
}
