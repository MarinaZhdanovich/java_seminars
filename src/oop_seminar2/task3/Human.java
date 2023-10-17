package oop_seminar2.task3;

public class Human extends BaseHuman implements Runner {

    private String name;
    private int maxRun;
    private int maxJump;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Human(String name, int maxRun, int maxJum) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJum;
    }

    @Override
    public boolean run(int length) {
        if (length <= getMaxRun()){
            System.out.printf("%s пробежал по беговой дорожке %d метров.\n", name, length);
            return true;
        }
        else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d метров, остановился после %d метров.\n",
                    name, length, getMaxRun());
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= getMaxJump()){
            System.out.printf("%s перепрыгнул через стену %d см.\n", name, height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену %d см, остался на месте.\n",
                    name, height);
            return false;
        }
    }

}
