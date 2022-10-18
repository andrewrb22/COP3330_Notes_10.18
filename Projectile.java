public abstract class  Projectile {
    double life;

    public Projectile(double l){
        this.life = l;
    }

    public void update(){
        this.life -= 1;

    }

    public boolean isAlive(){
        return life > 0;
    }

    public abstract void move();
    public abstract void draw();
    public abstract boolean hit(Projectile o);
}
